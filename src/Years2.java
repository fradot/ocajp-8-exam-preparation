// Will It compile successfully? What's the output of this program?

import java.time.LocalDate;
import java.time.Period;

public class Years2 {

	public static void main(String ...args) {
		LocalDate start = LocalDate.parse("2018-01-01");
		LocalDate end = LocalDate.parse("2019-01-01");

		System.out.println(Period.between(start,end).plusMonths(13).multipliedBy(1));
	}

}
