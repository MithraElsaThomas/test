package pack;

public class College1 {
	static int f=10;
	String name;
	int age;
	public College1(int a,String n)
	{name=n;
	age=a;
	}
	public void display()
	{System.out.println("name"+name);
	System.out.println("age" +age);
	System.out.println("roll no" +f);
	}
	public static void main(String[] args) 
	{
		College1 ob1 =new College1(10,"abc");
		ob1.display();
		ob1.age=20;
		ob1.name="xyz";
		ob1.display();
		// TODO Auto-generated method stub

	}

}

	