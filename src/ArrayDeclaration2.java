// Will it compile successfully? What's the ouput of this java class?

public class ArrayDeclaration2 {

	public static void main (String...args) {

		int[] d= {4,6,4};
		int[] d1=new int[]{4,5,1};
		int[] d2=new int[]{3,1};
		int[] d3={new Integer('A')}; // A = 65

		System.out.println(d[0] + d1[0] + d2[0] + d3[0]);	
	}

}
