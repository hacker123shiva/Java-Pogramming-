
public class letterN {

	public static void main(String[] args) {
		int n=7;
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(j==0 || j==n-1 || j==i)
					System.out.print("*");
				else
					System.out.print(" ");				
			}
			System.out.println();
		}

	}

}
