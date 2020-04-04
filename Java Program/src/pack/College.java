package pack;

public class College {
	String name;
	int age;
	public College(int a,String n)
	{name=n;
	age=a;
	}
	public void display()
	{System.out.println("name"+name);
	System.out.println("age" +age);
	}
	public static void main(String[] args) 
	{
		College ob1 =new College(10,"abc");
		ob1.display();
		College ob2 =new College(20,"xyz");
	ob2.display();
		// TODO Auto-generated method stub

	}

}
