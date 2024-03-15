public class Person
{
	public int id;
	public String name;
	
	public Person()
	{
	}
	
	public Person(int id)
	{
		setId(id);
		//this.id = id;
	}
	
	public Person(String name)
	{
		this.name = name;
	}
	
	public Person(int id, String name)
	{
		//this.id = id;
		this(id);
		setName(name);
		//this.name = name;
	}
	
	public void setId(int newId)
	{
		if(newId > 0)	
			id = newId;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public String getName()
	{
		return name;
	}
}
		