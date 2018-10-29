// Will it compile successfully? 
// If yes, what would be the output executing the program with this command:
// java Increaser true

public class Increaser {

	static int x;

	public static void main (String ... args) {

		boolean increase = Boolean.valueOf(args[0]);
		boolean increased;

		increased = (increase && increase());
		
		System.out.println(increased + " x:" + x);		
	}

	static boolean increase() {
		return (x++ == x);
	}

}
