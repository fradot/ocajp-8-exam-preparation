// Will it compile successfully? If yes, what's the output of this program?

public class TheStringBuilder {

	public static void main (String[] args) {

		StringBuilder a = new StringBuilder("bc");
		
		a.ensureCapacity(300);		

		StringBuilder sb = new StringBuilder(a);
		
		sb.ensureCapacity(200);
		sb.append("fgh");
		
		System.out.println(sb.capacity());
	
	}

}
