// What's the output of this java class? 

public class What {
	
	static int x=2;

	public static void main (String...args) {

		try {
			int a[] = new int[x];
		} catch (Exception e) {
			System.out.println(e instanceof NegativeArraySizeException);
		}	

	}


	static {x-=3;}

}
