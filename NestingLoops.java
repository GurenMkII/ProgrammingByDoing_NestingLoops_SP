public class NestingLoops
{
	public static void main( String[] args )
	{
        
		// this is #1 - I'll call it "CN"
		for (int n=1; n <= 3; n++  )
		{
			for ( char c='A'; c <= 'E'; c++ )
			{
				System.out.println( c + " " + n );
			}
		}

		System.out.println("\n");

		// this is #2 - I'll call it "AB"
		for ( int a=1; a <= 3; a++ )
		{
			for ( int b=1; b <= 3; b++ )
			{
				System.out.print( a + "-" + b + " " );
			}
			// * You will add a line of code here.
            System.out.println();
        }

		System.out.println("\n");

	}
}

// ANSWERS
// 1.Variable controlled by loop n is changing faster.
// 2.Changed the order of the loops. Variable controlled by c is changing faster now.
// 3.Changed print() to println(). ( a + "-" + b + " " ) is on the new line every time loop b runs.
// 4.Added System.out.println(); after inner loop, which creates a line break every time outer loop runs.