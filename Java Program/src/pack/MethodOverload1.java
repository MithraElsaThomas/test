package pack;

public class MethodOverload1 {
	public static float add(int a, int b,float z)
	{float c=a+b;
	return(c);
	}
public static int add(int d, int e)
{int f=d+e;
return(f);
}

	public static void main(String[] args) {
		float p=MethodOverload1.add(10,20,30f);
		int q=MethodOverload1.add(40, 30);
System.out.println("p=" +p);
System.out.println("q=" +q);
		// TODO Auto-generated method stub

	}

}
