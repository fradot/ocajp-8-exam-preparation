// Will it compile successfully? What's the output of this class?

public class TheNest1 {

	static int j,c;
	
	public static void main(String ...args) {

		int a[][] = {{1,2,3},{5,7,8},{9,10,11}};
			
		o:while(true) {	
		i:while(true) {
			System.out.println(a[j][c++]);
			if(c == 3) break i;
		}
		j++;
		c=0;
		if(j==3) break;
		}
	}

}
