// Will it compile successfully? If yes, what's the output of this java class?

class Base {

	public void methodA() {
		System.out.println("base - a");
	}
	
}

public class SubBase extends Base {

	public void methodA() {
		System.out.println("sub - a");
	}
	
	public void methodB() {
		System.out.println("sub - b");
	}

	public static final void main(String... s) {
		
		Base b = new SubBase();
		b.methodA();
		b.methodB();
		
	}

}
