// letterQ
public class letterQ {

	public static void main(String[] args) {
		int n=7;
		int i,j;
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=n;j++)
			{
				if(i==0 && j!=n ||j==0 && i!=n || i==(n-1) && j!=n || j==(n-1) && i!=n || j==n && i==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		// Upgraded Another font with curves
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=n;j++)
			{
				if(i==0 && j!=0 && j!=(n-1) && j!=n ||j==0 && i!=0 && i!=(n-1) && i!=n || i==(n-1) && j!=0 && j!=(n-1) && j!=n || j==(n-1) && i!=0 && i!=(n-1) && i!=n || j==n && i==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}


	}

}
