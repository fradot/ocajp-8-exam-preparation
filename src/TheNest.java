// Will it compile successfully? What's the output of this class?

public class TheNest {

	public static void main(String ...args) {

		int a[][] = {{1,2,3},{5,7,8},{9,10,11}};

		o: for(int j=0,c=0;j<3;j++) {
			c=0;
		i: while(true) {
			System.out.println(a[j][c++]);
			if(c == 3) break outer;
		}
		}
	}

}
