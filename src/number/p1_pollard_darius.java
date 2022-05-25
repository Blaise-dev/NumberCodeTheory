package number;


public class p1_pollard_darius {

    public static int p1Pollard(int n, int b) {

        int a = 2;
        for (int j = 2; j <= b; j++) {
            int puissance = (int) Math.pow(a, b);
            a = puissance % n;
        }
        int d = Euclide.gcd((a - 1), n);
        if (1 < d && n > d) {

            return d;

        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int n = 125416897;
        int b = 56;
        int f = p1Pollard(n, b);

        System.out.println("Un facteur premier de n est : " +f);
    }
}