<<<<<<< HEAD
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
=======
package number;

public class Euclide {

	public static int pgcd(int m, int n)
	{
		m = Math.abs(m);
		n = Math.abs(n);
		int r = 0;
	    while(n != 0)
	    {
	    	r = m % n;
	    	m = n;
	    	n = r;
	    }
	    return m;
	}
}
>>>>>>> 18afa88c0ca5c534dd4d51eb0121af6c677e7bd0
