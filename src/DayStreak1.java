// Will it compile successfully? What's the output of this class?

import java.time.LocalDate;
import java.time.Period;

public class DayStreak1 {

	public static void main(String args[]) {

		LocalDate day1 = LocalDate.of(20,12,10);
		LocalDate dayEnd = LocalDate.of(21,1,1);

		System.out.println(day1);
		System.out.println(dayEnd);
		System.out.println(Period.between(day1,dayEnd).minus(Period.parse("p1m")));
	
	}

}
