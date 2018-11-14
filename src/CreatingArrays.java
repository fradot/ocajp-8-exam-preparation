// Will it compile successfully?
// What is the output of this java program??

import java.util.Arrays;

public class CreatingArrays {

	public static void main (String...args) {
	
		Boolean[] myArray = new Boolean[]{false,false,true,true};
		Boolean[] myArray2 = Arrays.copyOf(myArray, 4);
		boolean[] myArray3 = {false,false,true,true};
	
		System.out.println(Arrays.deepEquals(myArray, myArray2));
		System.out.println(Arrays.equals(myArray3, myArray));
	}

}
