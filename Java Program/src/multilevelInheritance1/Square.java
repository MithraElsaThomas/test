package multilevelInheritance1;

public class Square extends Addition {
	public void squr()
	{
	int d=c*c;
	System.out.println("square" +d);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Square ob=new Square();
ob.display();
ob.add();
ob.squr();

	}

}
