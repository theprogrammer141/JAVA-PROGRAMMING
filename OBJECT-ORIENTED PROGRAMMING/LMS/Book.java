public class Book
{
	String title;
	String author;
	String ISBN;
	boolean availability_status;
	
	public Book(String title, String author, String ISBN, boolean availability_status)
	{
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.availability_status = availability_status;
	}
	
	public void borrowBook()
	{
		if(availability_status == false)
		{
			System.out.print("BOOK NOT AVAILABLE");
		}
		else
		{
			availability_status = false;
		}
	}
	
	public void returnBook()
	{
		if(availability_status == false)
		{
			availability_status = true;
		}
		else
		{
			System.out.print("ALREADY AVAILABLE");
		}
	}
	
	public void displayBooks()
	{
		System.out.println("TITLE : " + title);
		System.out.println("AUTHOR : " + author);
		System.out.println("ISBN : " + ISBN);
		System.out.println("AVAILABILITY : " + availability_status);
	}
}