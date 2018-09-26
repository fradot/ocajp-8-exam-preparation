// Will it compile successfully?

import java.io.*;

class MyException extends FileNotFoundException {

	public MyException() {
		super();
	}

}

public class ThrowsException {

	public static void main(String ... args) {
		try {
			throwSomeException();
		} catch (FileNotFoundException fn) {
			System.out.println("FileNotFoundException caught.");
		} catch (MyException e) {
			System.out.println("MyException caught.");
		} finally {
			System.out.println("finished.");
		}
	}

	static void throwSomeException() throws MyException, FileNotFoundException {
		FileInputStream fileInputStream = new FileInputStream("inexistent.txt");
	}

}
