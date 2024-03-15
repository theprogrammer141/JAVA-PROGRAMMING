import java.util.Scanner;

public class BookTest
{
	public static void main(String [] args)
	{
		String ISBN;
		String title;
		int author_id;
		String author_name;
		
		Scanner input = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		
		System.out.print("ENTER ISBN:");
		ISBN = inputString.nextLine();
		
		System.out.print("ENTER TITLE:");
		title = inputString.nextLine();
		
		System.out.print("ENTER AUTHOR ID:");
		author_id = input.nextInt();
		
		System.out.print("ENTER AUTHOR NAME:");
		author_name = inputString.nextLine();
		
		Author author = new Author(author_id, author_name);
		
		Book book = new Book(ISBN, title, author);
		
		book.displayBookInformation();
	}
}