package mypackage;

import java.util.*;

public class KidUsers implements LibraryUser{
	public int age;
	public String bookType;

	public KidUsers(int a, String book) {
		age = a;
		bookType = book;
	}

	@Override
	public void registerAccount() {
		if(age <= 12) {
			System.out.println("You have successfully registered under a Kids Account");
		}
		else {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
		
	}

	@Override
	public void requestBook() {
		if(bookType != "Kids") {
			System.out.println("Oops, you are allowed to take only kids books");
		}
		else {
			System.out.println("Book issued successfully, please tetrun the book within 10 days");
		}
	}

}
