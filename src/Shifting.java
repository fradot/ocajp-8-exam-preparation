public class Shifting {

	public static void main (String ... args) {
		Integer x = true ^ false & true ? 2 : 5;
		Integer y = 3;
		x <<= 2;
		System.out.println((x == 8) ? x : y);
	}

}
