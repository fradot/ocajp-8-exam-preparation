// Will it compile successfully? If yes, what's the output of this class? 

public class Switching {

	static int x;
	static{++x;}
	{x+=3;}

	public static void main (String...args) {
	
		final int y=1;
		
		switch (x) {
			case 0:
			case y:
			x+=y;
			switch (x) {
				case 2:
					System.out.println(1);
					break;
				case 3:
					System.out.println(2);
					break;
			}
			case 2:
			System.out.println(2);
			break;
			default:
			System.out.println("default");
			
		}	
	
	}


}
