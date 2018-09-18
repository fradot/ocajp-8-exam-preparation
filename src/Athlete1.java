// Will it compile successfully?
// If yes, what is the output?

interface Runner {

	static void run() {
		System.out.println("Runner is running");
	}

	default float WorldRecord() {
		return 10.56f;
	}

}

interface LongJumper {

	static void run() {
		System.out.println("Long jumper is running");
	}

	default float WorldRecord() {
		return 9.99f;
	}
}

public class Athlete1 implements Runner, LongJumper {

	public static void main (String ... args) {
		LongJumper.run();
	}

}
