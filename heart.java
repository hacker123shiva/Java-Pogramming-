
public class heart {

	public static void main(String[] args) {
		int n=9;
		int i,j;
		for(i=0;i<(n-1)/2;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==0 && j!=(n-1)/2 && j!=0 && j!=(n-1) || j==0 && i<=(n-1)/2 && i!=0 || j==(n-1) && i<=(n-1)/2 && i!=0 || i==1 && j==(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j && j<=(n-1)/2 || i==(n-1)-j && j>(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}
}

