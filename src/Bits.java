// What's the output of this program?

public class Bits {

	public static void main (String ... args) {
		int b1 = 0x000F;
		int b2 = 0x78AA;

		System.out.println(b1 & b2 ^ 0xA);	
	}
	
}
