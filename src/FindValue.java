// What's the ouptu of this java program?

class MyValue {
	
	protected int x=y;
	protected static int y;
	
	static {
		y += 4;
	}

	{
		x += 4;
	}

	MyValue() {
		x += 1;
	}

}

class MySubValue extends MyValue {

	MySubValue() {
		x += 1;
	}

	int getX() {
		return x;
	}
}


public class FindValue {

	public static void main(String ...args) {

		MySubValue x = new MySubValue();
		System.out.println(x.getX());
		
	}

}
