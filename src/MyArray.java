// Will it compile successfully? If yes, what's the output of this java class?

public class MyArray {

	static int[][] myArray2 = new int[4][5];

	public static void main(String...args) {
 		char c = 'A';	
		int[] myArray = new int[]{1,2,3,4};
	  	int[][] myArray1 = new int[(int) c][];
		myArray1[0] = myArray.clone();

		System.out.println(myArray.length);
		System.out.println(myArray1[0][0]);
		System.out.println(myArray1[54]);
		System.out.println(myArray2[2][3]);	
	
	}

}
