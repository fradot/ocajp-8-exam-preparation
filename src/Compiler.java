// Will it compile successfully?
// What is the output of this program?


class ProgrammingLanguage {

	String compiler = "Generic compiler";
	
	void compile() {
		System.out.println(String.format("executing %s", compiler));
	}

}

class C extends ProgrammingLanguage {
	String compiler = "C compiler";

	void compile() {
		System.out.println(String.format("executing %s", compiler));
	}
}


class Compiler {

	public static void main(String ... args) {
		ProgrammingLanguage pl = new ProgrammingLanguage();
		ProgrammingLanguage pl1 = new C();

		System.out.println(pl1.compiler);
		pl1.compile();
		System.out.println(pl.compiler);
		pl.compile();
	}

}
