// Will it compile successfully?
// If yes, what's the output of this java program?

import java.time.LocalDate;

public class ANewDay1 {

	public static void main (String ... args) {
		LocalDate aNewDay = LocalDate.of(2015, 12, 31);
		
		aNewDay.minusDays(16);	
	
		System.out.println(aNewDay);
		
	}

}
