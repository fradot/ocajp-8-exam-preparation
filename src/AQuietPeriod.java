// Will it compile successfully? If yes, what's the output of this class?

import java.time.LocalDate;
import java.time.Period;

public class AQuietPeriod {

	public static void main(String ... args) {

		LocalDate now = LocalDate.now();
		LocalDate aYearLater = now.plus(Period.ofDays(365));		

		System.out.println(Period.between(now,aYearLater));
		
	}

}
