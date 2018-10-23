// Will it compile successfully? What's the output of this program?

public class Comparing4 {

	public static void main (String...args) {
		Double d = 65.0;
		Integer i = 65;
		char ii = 65; // A
		Float a = 65.0f;
		
		ii+=3;
		
		System.out.println(ii);
		System.out.println(i == ii);
		System.out.println(d.equals(a));
		System.out.println(d.equals(i));
	}

}
