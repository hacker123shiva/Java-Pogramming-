// letter K
public class letterK {

	public static void main(String[] args) {
		int n=7;
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(j==0 || (i<=(n-1)/2 && i==(n-2)-j) || (i>(n-1)/2 && i==j+1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
