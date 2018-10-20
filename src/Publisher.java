// Will it compile successfully? 
// If yes, what's the output of this program?

class FrontMatter {

	final static int eSN = 0;
	String isbn;
	String title;
	String subTitle;

	FrontMatter(String title,String subTitle,String isbn) {
		this.title = title;
		this.subTitle = subTitle;
		this.isbn = isbn;
	}
	
}

class EFrontMatter extends FrontMatter {

	String eSN;

	EFrontMatter(String title,String subTitle,String isbn,String eSN) {
		super(title,subTitle,isbn);
		this.eSN = eSN;
	}

}

abstract class Book {

	abstract FrontMatter publish();

}

class EBook extends Book {

	EFrontMatter fm;

	EBook(EFrontMatter fm) {
		this.fm = fm;
	}

	EFrontMatter publish() {
		return fm;
	}

}


public class Publisher {

	public static void main (String[] args) {
	
		EFrontMatter fm = new EFrontMatter("Galactica", "Galaxy Exploration", "0000", "01");
		Book b = new EBook(fm);

		System.out.println(b.publish().eSN);
	
	}

}
