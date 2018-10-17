// Will it compile successfully?
// If yes, what's the output of this class?

public class LabLooper {

	public static void main(String ... args) {	
		
		int a[][] = {{987,654,32}, {3,7,9,10,12}};

		for(int b[]: a) {
			LAB:for(int x=0; x < b.length; x++) {

				if (b[x] % 2 != 0) {
					continue LAB;
				}	

				 System.out.println(b[x]);
			}
		}
		
	}
	
}
