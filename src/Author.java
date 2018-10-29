// Will it compile successfully? If yes. what's the output of this java program?

class Person {
	long age = 34;

	public long getAge() {
		return age;
	}

}

public class Author extends Person {

	Long age = 30l;

	public Long getAge(){
		return age;
	}

	public static void main(String...args) {
		Person a = new Author();
		System.out.println(a.getAge());
	}

}
