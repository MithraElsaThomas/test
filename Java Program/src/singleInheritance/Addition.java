package singleInheritance;
public class Addition  extends Values {
	public void add()
	{int c=a+b;
	System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Addition ob=new Addition();
ob.display();
ob.add();
	}
}