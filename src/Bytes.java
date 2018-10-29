// Will it compile successfully?

public class Bytes {

	public static void main (String ... args) {

		byte c = -128;
		int i = c;
		i-=1000;
		byte a = (byte) i;
		System.out.println(a + " " + c);
	}


}
