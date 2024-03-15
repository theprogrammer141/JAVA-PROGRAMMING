public class Book
{
	private String ISBN;
	private String title;
	private Author author;
	
	public Book(String ISBN, String title, Author author)
	{
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
	}
	
	public String getISBN()
	{
		return ISBN;
	}
	
	public void setISBN(String ISBN)
	{
		this.ISBN = ISBN;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public Author getAuthor()
	{
		return author;
	}
	
	public void setAuthor(Author author)
	{
		this.author = author;
	}
	
	public void displayBookInformation()
	{
		System.out.print("\n\n");
		System.out.println("BOOK DETAILS:-");
		System.out.println("BOOK ISBN: " + ISBN);
		System.out.println("BOOK TITLE: " + title);
		System.out.println("AUTHOR ID: " + author.getId());
		System.out.println("AUTHOR NAME: " + author.getName());
		System.out.print("\n\n");
	}
}