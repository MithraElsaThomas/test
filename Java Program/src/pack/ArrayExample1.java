package pack;

public class ArrayExample1 {

	public static void main(String[] args) {
		int[][] a=new int[3][3];
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=5;
		a[1][0]=8;
		a[1][1]=9;
		a[1][2]=10;
		a[2][0]=11;
		a[2][1]=12;
		a[2][2]=13;
		
		for(int i=0;i<a.length;i++)
		{
	        for(int j=0;j<a.length;j++)
	        {System.out.println(a[i][j]+ " ");
		}
	
		
		// TODO Auto-generated method stub

	}

	}
}
