// Will it compile successfully? What's the output of this class?

import java.time.format.*;
import java.time.LocalDateTime;

public class Formatting {

	public static void main (String ...args) {

		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM,FormatStyle.LONG);
		LocalDateTime sometime = LocalDateTime.parse("2018-10-24T13:32:47");

		System.out.println(sometime.format(formatter));
		
	}

}
