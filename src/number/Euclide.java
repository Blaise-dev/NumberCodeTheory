package number;

public class Euclide {

    public int a;
    public int b;

    public static int gcd(int a, int b) {

        int res;

        while (b > 0) {
            res = a % b;
            a = b;
            b = res;
        }
        return a;
    }
}
