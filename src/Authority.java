// WIll it compile successfully?

public class Authority {
	String name;
	String surname;
	int age;

	Authority(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
}

public class Major extends Authority {
	int mandate;

	Major(String name, String surname, int age, int mandate) {
		super(name, surname, age);
		this.mandate = mandate;
	}
	
	public static void main (String args[]) {
		Authority m = new Major("John", "Doe", 51, 4);	
	}
}
