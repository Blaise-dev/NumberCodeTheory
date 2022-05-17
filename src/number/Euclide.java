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
