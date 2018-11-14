// WIll it copmpile successfully?

class A {

	int i;

	A(int j) {
		i=j;
	}

}

class B extends A {
	int x, y;

	B(int a,int b) {
		x=a;
		y=b;
	}
	
}


public class Constructors {

	public static void main (String...args) {
	
		A b = new B(1,2);
		
	
	}

}
