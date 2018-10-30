// Will it compile successfully? If yes, what's the output of this class?

public class Replacer {

	public static String replace(String str, char x, char y) {
	
		String msg = str + " :replaced";
		str.replace(x, y);
		return str;
	}

	public static void main (String...args) {
	
		System.out.println(replace("log message 1000 - nice message!", '0', 'A'));
	
	}

}
