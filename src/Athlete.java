// What's the output of this java program?

interface Runner {
	String SPORT = "run";
}

interface HighJumper {
	String SPORT = "high-jump";
}

class Athlete implements Runner, HighJumper {
	public static void main(String ... args) {
		System.out.println(SPORT);
	}
}
