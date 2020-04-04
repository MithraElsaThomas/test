package methodoverloading;

public class Childoverride extends Parent {
public void get()
{System.out.println("child");
}
	public static void main(String[] args) {
		Childoverride ob = new Childoverride();
		ob.get();//It has 2 methods with the name get but child gets printed as
		//child class has higher priority
		// TODO Auto-generated method stub

	}
}
