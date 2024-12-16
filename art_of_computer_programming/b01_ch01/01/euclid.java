import java.util.Random;

/**
 *      Given two positive integers m and n, find their greatest common divisor, 
 * that is, the largest positive ingeter that evenly divides both m and n.
 */
class euclid{
    /**
     * Main
     */
    public static void main(String args[]){
        // create instance of Random class
        Random rand = new Random();

        int m = rand.nextInt(10000);
        int n = rand.nextInt(10000);

        System.out.println("m = " + m + ", \t\tn = " + n);

        int r = m;
        while (r > 0) {
            if (m < n) {
                int tmp = m;
                m = n;
                n = tmp;
            }

            System.out.println("m = " + m + ", \t\tn = " + n);
                r = m % n;
            m = m / n;

            System.out.println("m = " + m + ", \t\tn = " + n + ", \t\tr = " + r);
        }

        System.out.println("Greatest Common Divisor = " + n);  
    }  
}