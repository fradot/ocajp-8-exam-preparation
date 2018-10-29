// Will it compile successfully? What's the output of this java class?

public class ArrayDeclaration {

	public static void main (String...args) {

		int[] d= {4,6,4};
		int[] d1=new int[]{4,5,1};
		int[] d2=new int[2]{3,1};
		int[] d3={new Integer("08")};

		System.out.println(d[0] + d1[0] + d2[0] + d3[0]);	
	}

}
