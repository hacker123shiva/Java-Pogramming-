// letter V
public class letterV {

	public static void main(String[] args) {
		int n=7;
		int i,j;
		for(i=0;i<2*n;i++)
		{
			for(j=0;j<2*n;j++)
			{
				if(i==j && j<=(2*n-1)/2 || i==(2*n-1)-j && j>(2*n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}	
	}
}
