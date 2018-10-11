// Will it compile succesfully?
// What's the output of this program?

class MyNumber {
	int x = 0;
}


public class Output2 {

	static Integer x = 0;
	static int[] a= {1,2,3,4,5,6,7,8,9};

	public static MyNumber value(MyNumber x) {
		try {
			x.x = a[9];
		}
		catch (Exception s) {
			System.out.println("x: " + x.x);
			return x;
		}
		finally {
			x.x += 2;
		}

		return x;
	}

	public static void main(String ... args) {
		MyNumber n = new MyNumber();
		System.out.println(x);
		x = value(n).x;
		System.out.println(x);
	}

}
