// Will it compile successfully?

interface Statiics1 {
	
	default int getId() {
		return 2;
	}

}


interface MyStatics extends Statics1 {

	public static int getid() {
		return 1;
	}

}


public class Statics{

	public static void main(String ...args) {

		System.out.println("Statics started.");
	
	}

}
