// WIll it compile successfully?
// If yes, what's the output of this java program?

class Animal {

}

class Rabbit extends Animal {

}


public class CastIt {
	
	public static void main (String ...args) {
		Animal a= new Animal();
		Rabbit o = new Rabbit();
		o = (Rabbit) a;
	}

}
