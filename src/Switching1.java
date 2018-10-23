// Will it compile successfully? If yes, what's the output of this class? 

public class Switching1 {

	static String x = "";
	{x.concat("empty");}
	static{x+="full";}

	public static void main (String...args) {
	
		final String y="empty";
	
		switch (x) {
			case "FULL":
			System.out.println("full");
			case y:
			x+=y;
			switch (x) {
				case "fullempty":
					System.out.println(1);
					break;
				case "emptyempty":
					System.out.println(2);
					break;
			}
			default:
			System.out.println("default");
			
		}	
	
	}


}
