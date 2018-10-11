// Will it compile successfully?

import java.util.List;
import java.util.ArrayList;

interface Link {
	void connect(Link c);
}

class Item implements Link {

	private List<Link> links = new ArrayList<Link>();

	public void connect(Link c) throws IllegalArgumentException {
		if(c != null) {
			links.add(c);
		} else {
			throw new IllegalArgumentException("Link cannot be null!");
		}
	}

	List<Link> links() {
		return links;
	}
}


class Rel implements Link {
	
	Item a;
	Item b;

	Rel(Item a, Item b) {
		this.a = a;
		this.b = b;
	}

	public void connect(Link c) throws IllegalArgumentException {
		a.connect(c);
		b.connect(c);
	}

}

public class Many {

	private static Link d;

	public static void main (String ... args) {
		Item f = new Item();
		Item l = new Item();
		d = new Item();

		Rel r = new Rel(f,l);
		
		try {
			r.connect(d);
		}
		catch (NumberFormatException | RuntimeException w) {
			System.out.println(w.getMessage());
		}

	}

}
