// Will it compile successfully? If yes, what's the output of this method?

public class Appends1 {

	public static void main(String ...args) {
	
		StringBuilder sb = new StringBuilder("ciao");
		String s = sb.capacity() + "hello";
		sb.append(s);
		s.concat(sb.toString());
		System.out.println(sb);
		System.out.println(s);
	
	}

}
