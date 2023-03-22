package spring1;

public class JavaDeveloper {
	
	int id;
	String name;
	public JavaDeveloper(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void work()
	{
		System.out.println("Java dev is working");
	}
	
	public void doProject()
	{
		System.out.println("Java dev doing java project");
	}
}
