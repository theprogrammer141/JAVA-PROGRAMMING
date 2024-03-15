package com.bitspedia.sms.app;

import com.bitspedia.sms.Student;
import com.bitspedia.lms.Book;

public class StudentTest
{
	public static void main(String[] args)
	{
		Student s = new Student(1);
		System.out.println(s.id);
		
		Book b = new Book();
		b.isbn = "23423-3423-3423";
		System.out.println(b.isbn);
	}
}