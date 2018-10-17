// Will it compile successfully?
// If yes, what's the output of this program?

public class GhostLoop {
	
	static int x;

	public static void main(String ... args) {	
		
		int a[][] = {{987,654,32}, {3,7,9,10,12}};

		LAB:	for(int b[]: a) {
			for(; x < b.length; x++) {

				if (b[x] % 2 != 0) {
					continue LAB;
				}	

				 System.out.println(b[x]);
			}
		}
		
	}
	
}
