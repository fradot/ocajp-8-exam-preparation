// Will it compile successfully? If yes, what's the output of this class?

class BBB {

	public int h = 2;

	public void getH() {
		System.out.println("BBB - " + h);
	}

}

public class AAA extends BBB {

	public int h = 100;

	public void getH() {
		System.out.println("AAA - " + h);
	}

	public static void main (String...args) {
	
		BBB b = new AAA();
		System.out.println(b.h);
		b.getH();
		AAA a = (AAA) b;
		System.out.println(a.h);
		a.getH(); 

	}

}
