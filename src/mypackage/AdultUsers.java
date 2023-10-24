package mypackage;

public class AdultUsers implements LibraryUser{
	public int age;
	public String bookType;

	public AdultUsers(int a, String book) {
		age = a;
		bookType = book;
	}

	@Override
	public void registerAccount() {
		if (age > 12) {
			System.out.println("You have successfully registered under an Adult Account");
		}
		else {
			System.out.println("Sorry, age must be greater than 12 to register as an adult");
		}
		
	}

	@Override
	public void requestBook() {
		if(bookType != "Fiction") {
			System.out.println("Oops, you are allowed to take only Adult Fiction books");
		}
		else {
			System.out.println("Book issued successfully, please return the book within 7 days");
		}
		
	}

}
