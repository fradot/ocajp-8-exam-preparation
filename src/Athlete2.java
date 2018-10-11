// Will it compile successfully?
// If yes, what's the output?

interface Runner {

	static void run() {
		System.out.println("Runner is running");
	}

	default float worldRecord() {
		return 10.56f;
	}

}


interface LongJumper {
	
	static void run() {
		System.out.println("Long jumper is running");
	}

	default float worldRecord() {
		return 9.99f;
	}
}


interface OlympicAthlete extends Runner, LongJumper {

	default float worldRecord() {
		return 9.78f;
	}

}

public class Athlete2 implements OlympicAthlete {

	public static void main(String ... args) {
		System.out.println(new Athlete2().worldRecord());
	}
}
