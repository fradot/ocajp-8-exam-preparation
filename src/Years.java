// Will It compile successfully? What's the output of this program?

import java.time.Period;

public class Years {

	public static void main(String ...args) {
		Period start = Period.of(1,1,1);
		Period end = Period.of(2,1,1);

		System.out.println(Period.between(start,end).plusMonths(13).multipliedBy(1));
	}

}
