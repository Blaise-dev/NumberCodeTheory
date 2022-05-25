package number;

public class rho_pollard_darius {

    public static int fonction(int x) {
        return x * x + 1;
    }

    public int rhoPollard(int n, int x1) {
        
        int  x = x1;
        int xp = fonction(x) % n;
        int p = Euclide.gcd(x - xp, n);

        while (p == 1) /*remarque : dans la ieme iteration, x= xi et xp = x2i*/ {

            x = fonction(x) % n;
            xp = fonction(xp) % n;
            xp = fonction(xp) % n;
            p = Euclide.gcd(xi - xp, n);

        }
        if (p == n) {

            return -1;
            
        } else {

            return p;
            
        }
    }
    
}
