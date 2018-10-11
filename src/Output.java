// Will it compile succesfully?
// What's the output of this program?

public class Output {

	static int x;
	static int[] a= {1,2,3,4,5,6,7,8,9};

	public static int value(int x) {
		try {
			x = a[9];
		}
		catch (Exception s) {
			System.out.println("x: " + x);
			return x;
		}
		finally {
			x += 2;
		}

		return x;
	}

	public static void main(String ... args) {
		System.out.println(x);
		x = value(x);
		System.out.println(x);
	}

}
