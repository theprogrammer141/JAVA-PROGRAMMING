package com.bitspedia.oop.task5;

public class Student
{
	private String name;
	private String email;
	private String CNIC;
	private Course course1;
	private Course course2;
	private Address address;
	
	public Student(String name, String CNIC, Address address)
	{
		this.name = name;
		this.CNIC = CNIC;
		this.address = address;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getCNIC()
	{
		return CNIC;
	}
	
	public void setCNIC(String CNIC)
	{
		this.CNIC = CNIC;
	}
	
	public Course getCourse1()
	{
		return course1;
	}
	
	public void setCourse1(Course course1)
	{
		this.course1 = course1;
	}
	
	public Course getCourse2()
	{
		return course2;
	}
	
	public void setCourse2(Course course2)
	{
		this.course2 = course2;
	}
	
	public Address getAddress()
	{
		return address;
	}
	
	public void setAddress(Address address)
	{
		this.address = address;
	}
	
	public void printData()
	{
		System.out.println("\n");
		System.out.println("STUDENT INFORMATION:-");
		System.out.println("NAME : " + name);
		System.out.println("EMAIL : " + email);
		System.out.println("CNIC : " + CNIC);
		System.out.println("\n");
		
		System.out.println("COURSE1 DETAILS:-");
		System.out.println("COURSE CODE : " + course1.getCourseCode());
		System.out.println("COURSE TITLE : " + course1.getCourseTitle());
		System.out.println("\n");
		
		System.out.println("COURSE2 DETAILS:-");
		System.out.println("COURSE CODE : " + course2.getCourseCode());
		System.out.println("COURSE TITLE : " + course2.getCourseTitle());
		System.out.println("\n");
		
		System.out.println("ADDRESS DETAILS:-");
		System.out.println("STREET ADDRESS : " + address.getStreetAddress());
		System.out.println("TOWN : " + address.getTown());
		System.out.println("CITY : " + address.getCity());
		System.out.println("COUNTRY : " + address.getCountry());
		System.out.println("\n");
		
		System.out.println("PHONE NUMBER DETAILS:-");
		System.out.println("COUNTRY CODE : " + address.getPhoneNumber().getCountryCode());
		System.out.println("CITY CODE : " + address.getPhoneNumber().getCityCode());
		System.out.println("LINE NUMBER : " + address.getPhoneNumber().getLineNumber());
		System.out.println("\n");
	}
}