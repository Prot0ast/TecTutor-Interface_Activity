package mypackage;

public class LibraryInterfaceDemo {

	public LibraryInterfaceDemo() {}

	public static void main(String[] args) {
		KidUsers kid = new KidUsers(10, "Kids");
		kid.registerAccount();
		kid.requestBook();
		KidUsers kid2 = new KidUsers(18, "Fiction");
		kid2.registerAccount();
		kid2.requestBook();
		
		AdultUsers adult = new AdultUsers(5, "Kids");
		adult.registerAccount();
		adult.requestBook();
		AdultUsers adult2 = new AdultUsers(23, "Fiction");
		adult2.registerAccount();
		adult2.requestBook();

	}

}
