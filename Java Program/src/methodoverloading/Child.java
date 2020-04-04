package methodoverloading;

public class Child extends Parent {
public void get()
{System.out.println("child");
}
	public static void main(String[] args) {
		Child ob = new Child();
		ob.get();
		Parent ob1=new Parent();
		ob1.get();//overriding is removed 
		// TODO Auto-generated method stub

	}
}
