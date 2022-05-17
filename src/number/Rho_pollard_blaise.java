package number;

public class Rho_pollard_blaise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1045201212;
		int p = factor(n, 15);
		System.out.println("Factorisation de " + n + " : " + n + " = " + p + " x " + n/p);
	}

	public static int factor(int n, int x0) {
		int x = f(x0);
		int y = f(x);
		int d = Euclide.pgcd(x-y, n);
		while(d == 1) {
			x = f(x);
			y = f(x);
			d = Euclide.pgcd(x-y, n);
		}	// La fonction f utilisée n'a pas permi de retrouver le facteur.
		if(d == n)
			return -1;
		else
			return d;
	}

	public static int f(int x) {
		return x*x+1;
	}
}
