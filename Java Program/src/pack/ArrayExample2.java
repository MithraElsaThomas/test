package pack;

public class ArrayExample2 {

	public static void main(String[] args) {
		int r=2;
		int c=3;
		// TODO Auto-generated method stub
		int[][] a=new int[2][3];
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=5;
		a[1][0]=8;
		a[1][1]=9;
		a[1][2]=10;

		
		for(int i=0;i<r;i++)
		{
	        for(int j=0;j<c;j++)
	        {System.out.println(a[i][j]+ " ");
		}
	
	}

	}
}
	
