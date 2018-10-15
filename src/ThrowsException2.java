// What's the output of this program?

import java.io.*;

class MyException extends FileNotFoundException {

	public MyException() {
		super();
	}

}

public class ThrowsException2 {

	public static void main(String ... args) {
		try {
			throwSomeException();
		} catch (MyException fn) {
			System.out.println("MyException caught.");
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException caught.");
		} 
	}

	static void throwSomeException() throws FileNotFoundException {
		try {
			FileInputStream fileInputStream = new FileInputStream("inexistent.txt");
		}
		catch (Exception d) {
			throw new MyException();
		}
	}

}
