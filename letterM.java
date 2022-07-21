
public class letterM {

	public static void main(String[] args) {
		int n=7;
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(j==0 || j==n-1 ||(i<=(n-1)/2 && i==j) ||(i<=(n-1)/2 && i==(n-1)-j))
					System.out.print("*");
				else
					System.out.print(" ");				
			}
			System.out.println();
		}
	}
}
