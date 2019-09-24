package chc.jsj;
class Student{
	protected String school;
	String name;
	public int age;
	Student(String name,int age,String school){
		this.name = name;
		this.age = age;
		this.school =school;
	}
}
public class Test {
	public static void main(String[ ] args)
	{
		Student s = new Student("fandoudou",23,"HWPU");
		System.out.println(s.name);
	}
}
