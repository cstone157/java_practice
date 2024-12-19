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
        int m_org = 1769;
        int n_org = 551;
        int m = m_org;
        int n = n_org;

        int[] a = {0, 1};
        int[] b = {1, 0};
        int c = m;
        int d = n;
        
        int r = m;
        int q = 0;

        while (r > 0) {
            if (m < n) {
                int tmp = m;
                m = n;
                n = tmp;
            }

            r = m % n;
            q = m / n;
            if (r == 0)
                break;
            
            m = n;
            n = r;

            System.out.println("a' = " + a[1] + "\ta = " + a[0] + "\tb' = " + b[1] + "\tb = " + b[0] + "\tc = " + c + "\td = " + d + "\tq = " + q + "\tr = " + r);

            
            c = d;
            d = r;
            int t = a[1];
            a[1] = a[0];
            a[0] = t - q * a[0];
            t = b[1];
            b[1] = b[0];
            b[0] = t - q * b[0];
        }

        System.out.println(" ============================================ ");
        System.out.println("a' = " + a[1] + "\ta = " + a[0] + "\tb' = " + b[1] + "\tb = " + b[0] + "\tc = " + c + "\td = " + d + "\tq = " + q + "\tr = " + r);
        System.out.println("a{" + a[0] + "} * m{" + m + "} + b{" + b[0] + "} * n{" + n + "} = d{" + d + "}");
        //System.out.println("Greatest Common Divisor = " + d);
        //System.out.println("m = " + m);
        //System.out.println("n = " + n);
    }  
}