// Will it compile successfully?
// If yes what's the output of this class?

interface AirToAir {
	default void deploy() {
		System.out.println("Deploy air to air weapon system.");
	}
} 

interface AirToGround {
	default void deploy() {
		System.out.println("Deploy air to ground weapon system.");
	}
}

interface RocketLauncher {
	static void deploy() {
		System.out.println("Deploy rocket launcher");
	}
}


public class A101 implements AirToAir, AirToGround, RocketLauncher {

	public static void main(String[] args) {
		AirToGround r = new AirToGround(){};
		r.deploy();
	}

	public void deploy() {
		System.out.println("Deploy A10 weapon system.");
	}
}
