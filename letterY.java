// letter Y
public class letterY {

	public static void main(String[] args) {
		int n=7;
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j && i<=(n-1)/2  || i==(n-1)-j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		// Upgraded Another font
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j && i<=(n-1)/2  || i==(n-1)-j && i<=(n-1)/2 || j==(n-1)/2 && i>=(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
