interface fly {

	default void fly(int height) {
		System.out.println("fly, height:" + height);
	}
}

interface heatVision extends fly {

	static void heatVision() {
		fly(5000);
		System.out.println("heat vision");
	}
	
}

public class Superman implements heatVision {

	public static void main(String args[]) {
		heatVision.heatVision();
	}	

}

