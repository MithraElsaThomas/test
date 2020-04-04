package pack;

public class MethodOverload {
	public  int add(int a, int b)
	{int c=a+b;
	return(c);
	}
public  int add(int a, int b)
{int f=a+b;
return(f);
}
	public static void main(String[] args) {
		//int p=MethodOverload.add(10,20);
				//int q=MethodOverload.add(10, 30);
		MethodOverload m=new MethodOverload();	
		int p=m.add(40,1);
				int q=m.add(10, 1);
		System.out.println("p=" +p);
		System.out.println("q=" +q);
		// TODO Auto-generated method stub

	}

}
