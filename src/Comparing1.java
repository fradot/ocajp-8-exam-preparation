// Will it compile successfully? What's the output of this program?

public class Comparing1 {

	public static void main (String...args) {
		Double d = 10.0;
		Integer i = 10;
		int ii = 10;

		System.out.println(i.equals(d));
		System.out.println(d == ii);
		System.out.println(d.equals(i));
		System.out.println(d.equals(ii));
	}

}
