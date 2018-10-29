// WIll it compile successfully?
// If yes, what's the output of this java program?

class Animal {

	int x = 2;

	public int puppies() {
		System.out.println("animal puppies:");
		return x + 1; 
	}

}

class Rabbit extends Animal {

	int x = 6;

	public int puppies() {
		System.out.println("rabbit puppies:");
		return x * (x - 1);
	}

}


public class Overloading {
	
	public static void main (String ...args) {
		Animal a= new Rabbit();
		System.out.println(a.puppies());
		Rabbit r = (Rabbit) a;
		System.out.println(r.puppies());
	}

}
