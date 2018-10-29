// Will it compile successfully? If yes. what's the output of this java program?

class Person {
	long age = 34;

	public long getAge() {
		return age;
	}

}

public class Author1 extends Person {

	int age = 30;

	public int getAge(){
		return age;
	}

	public static void main(String...args) {
		Person a = new Author1();
		System.out.println(a.getAge());
	}

}
