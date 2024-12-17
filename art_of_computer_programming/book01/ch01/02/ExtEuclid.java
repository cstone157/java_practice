import java.util.Random;

/**
 *      Given two positive integers m and n, find their greatest common divisor d, 
 * that is, the largest positive ingeter that evenly divides both m and n.  
 * Additionally compute two, not-necessarily-positive, inters a and b such that
 * a*m + b*n = d.
 */
class ExtEuclid{
    /**
     * Main
     */
    public static void main(String args[]){
        // create instance of Random class
        Random rand = new Random();

        //int m = rand.nextInt(10000);
        //int n = rand.nextInt(10000);
        int m = 1769;
        int n = 551;

        int[] a = {0, 1};
        int[] b = {1, 0};
        int c = m;
        int d = n;
        
        // if m is less than n swap them
        if (m < n) {
            int tmp = m;
            m = n;
            n = tmp;
        }

        int r = m % n;
        int q = m / n;
        
        // while r is greater than 0
        while (r > 0) {
            System.out.println("a' = " + a[1] + "\ta = " + a[0] + "\tb' = " + b[1] + "\tb = " + b[0] + "\tc = " + c + "\td = " + d + "\tq = " + q + "\tr = " + r);
            c = d;
            d = r;
            int t = a[1];
            a[1] = a[0];
            a[0] = t - q*a[0];
            t = b[1];
            b[1] = b[0];
            b[0] = t - 1*b[0];

            if (m < n) {
                int tmp = m;
                m = n;
                n = tmp;
            }

            r = m % n;

            if (r == 0)
                break;

            m = n;
            n = r;
        }

        System.out.println(" ============================================ ");
        System.out.println("a' = " + a[1] + "\ta = " + a[0] + "\tb' = " + b[1] + "\tb = " + b[0] + "\tc = " + c + "\td = " + d + "\tq = " + q + "\tr = " + r);
        System.out.println("Greatest Common Divisor = " + d);
        System.out.println("m = " + m);
        System.out.println("n = " + n);
    }  
}