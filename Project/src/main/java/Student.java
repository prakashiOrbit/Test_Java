
public class Student {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String [] args)
	{
		Student s=new Student();
		s.setId(1);
		s.setName("name");
		System.out.println(s.getId());
		System.out.println(s.getName());
	}
}
