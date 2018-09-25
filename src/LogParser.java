// Will it compile successfully?

import java.nio.file.*;
import java.io.FileNotFoundException;

public class LogParser {

	public static void main (String ... args) {

		LogParser e = new LogParser();
		
		try {
			e.loadFile("server.log");
		} catch(RuntimeException r) {
			e.log("log something");
		} 	

	}

	public void loadFile(String file) throws Exception {
		
		// loadFile method at some point throws a new Exception
		throw new FileNotFoundException();

	}

	private void log(String log) {
		// log something
	}

}
