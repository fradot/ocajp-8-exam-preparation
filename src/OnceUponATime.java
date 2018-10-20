// What's the output of this program?

import java.time.LocalTime;


public class OnceUponATime {

	public static void main (String ... args) {

		LocalTime time = LocalTime.parse("12:01:04");
		LocalTime time1 = LocalTime.of(12,1,4);

		time1.plusHours(24);
		time.plusHours(96);

		System.out.println(time.isAfter(time1));
		
	}

}
