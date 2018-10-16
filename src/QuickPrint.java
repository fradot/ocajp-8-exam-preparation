// Will it compile successfully?
// If yes, what's the output of this program?

public class QuickPrint {

	static int k;

	public static void main (String ... args)  {
		for(int j=10; j>=k; j--,k++,System.out.print(k));
	}

}
