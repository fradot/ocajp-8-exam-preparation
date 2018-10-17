// Will it compile successfully? If yes, what's the output of this class?

public class LabSwitch {

	final static String TEST = "test";

	public static void main(String ... args) {

		switch (test().toString()) {
			case TEST:
				continue;
				System.out.println("Tested");
			default:
				System.out.println("Not yet tested");
		}
	}

	private static StringBuilder test() {
		return new StringBuilder("test");
	}

}
