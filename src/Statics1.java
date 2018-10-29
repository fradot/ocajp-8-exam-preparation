// Will it compile successfully?

interface Statics {
	
	static int getId() {
		return 2;
	}

}


interface MyStatics extends Statics {

	public default int getid() {
		return 1;
	}

}


public class Statics1 {

	public static void main(String ...args) {

		System.out.println("Statics started.");
	
	}

}
