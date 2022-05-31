package number;

public class P1_pollard_blaise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1045;
		int p = factor(n, 15);
		System.out.println("Factorisation de " + n + " : " + n + " = " + p + " x " + n/p);
	}

	public static int factor(int n, int B) {
		int a = 2;
		for(int j = 2 ; j <= B ; j++) {
			a = (int) Math.pow(a,j);
			int d = Euclide.gcd(a-1, n);
			if(d > 1 && d < n)
				return d;
		}
		return -1;		// Cette valeur de B n'a pas permi de retrouver le facteur.
	}
}
