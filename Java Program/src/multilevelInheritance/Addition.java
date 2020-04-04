package multilevelInheritance;

public class Addition extends Multiplication {
		public void add()
		{int c=a+b;
		System.out.println("Addition" +c);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Addition ob=new Addition();
	ob.display();
	ob.add();
	ob.multiplication();
		}
	}




