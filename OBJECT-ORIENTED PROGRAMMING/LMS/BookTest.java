import java.util.Scanner;

public class BookTest
{
	public static void main(String[] args)
	{
		String title;
		String author;
		String ISBN;
		boolean availability_status;
		
		Scanner input = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		
		System.out.print("ENTER TITLE OF BOOK:");
		title = inputString.nextLine();
		
		System.out.print("ENTER AUTHOR OF BOOK:");
		author = inputString.nextLine();
		
		System.out.print("ENTER ISBN OF BOOK:");
		ISBN = inputString.nextLine();
		
		System.out.print("ENTER AVAILABILITY STATUS:");
		availability_status = input.nextBoolean();
		
		Book b1 = new Book(title, author, ISBN, availability_status);
		
		b1.displayBooks();
		System.out.print("\n\n");
		
		b1.borrowBook();
		b1.displayBooks();
		System.out.print("\n\n");
			
		b1.borrowBook();
		System.out.print("\n\n");
	}
}