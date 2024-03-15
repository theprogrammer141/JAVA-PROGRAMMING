package com.bitspedia.oop.task5.app;

import java.util.Scanner;
import com.bitspedia.oop.task5.*;

public class StudentTest
{
	public static void main(String [] args)
	{
		String name;
		String email;
		String CNIC;
		String course1Code;
		String course1Title;
		String course2Code;
		String course2Title;
		String streetAddress;
		String town;
		String city;
		String country;
		String countryCode;
		String cityCode;
		String lineNumber;
		
		Scanner input = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		
		System.out.print("ENTER NAME : ");
		name = inputString.nextLine();
		
		System.out.print("ENTER EMAIL : ");
		email = inputString.nextLine();
		
		System.out.print("ENTER CNIC : ");
		CNIC = inputString.nextLine();
		
		System.out.print("\n");
		
		System.out.print("ENTER COURSE 1 CODE : ");
		course1Code = inputString.nextLine();
		
		System.out.print("ENTER COURSE 1 TITLE : ");
		course1Title = inputString.nextLine();
		
		System.out.print("\n");
		
		System.out.print("ENTER COURSE 2 CODE : ");
		course2Code = inputString.nextLine();
		
		System.out.print("ENTER COURSE 2 TITLE : ");
		course2Title = inputString.nextLine();
		
		System.out.print("\n");
		
		System.out.print("ENTER STREET ADDRESS : ");
		streetAddress = inputString.nextLine();
		
		System.out.print("ENTER TOWN : ");
		town = inputString.nextLine();
		
		System.out.print("ENTER CITY : ");
		city = inputString.nextLine();
		
		System.out.print("ENTER COUNTRY : ");
		country = inputString.nextLine();
		
		System.out.print("\n");
		
		System.out.print("ENTER COUNTRY CODE : ");
		countryCode = inputString.nextLine();
		
		System.out.print("ENTER CITY CODE : ");
		cityCode = inputString.nextLine();
		
		System.out.print("ENTER LINE NUMBER : ");
		lineNumber = inputString.nextLine();
		
		PhoneNumber phoneNumber = new PhoneNumber(countryCode, cityCode, lineNumber);
		Address address = new Address(streetAddress, town, city, country, phoneNumber);
		Course course1 = new Course(course1Code, course1Title);
		Course course2 = new Course(course2Code, course2Title);
		Student student1 = new Student(name, CNIC, address);
		student1.setEmail(email);
		
		student1.setCourse1(course1);
		student1.setCourse2(course2);
		
		student1.getAddress().getPhoneNumber().setCountryCode(countryCode);
		student1.getAddress().getPhoneNumber().setCityCode(cityCode);
		student1.getAddress().getPhoneNumber().setLineNumber(lineNumber);
		
		student1.printData();
		
		Student student2 = new Student("Ahmed", "34035-2324225-2", address);
		student2.setEmail("ahmed@gmail.com");
		student2.setCourse1(new Course("CSC-101", "PROGRAMMING FUNDAMENTALS"));
		student2.setCourse2(new Course("MTH-101", "INTRODUCTION TO CALCULUS"));
		student2.getAddress().getPhoneNumber().setCountryCode("+92");
		student2.getAddress().getPhoneNumber().setCityCode("042");
		student2.getAddress().getPhoneNumber().setLineNumber("042");
		
		student2.printData();
	}
}