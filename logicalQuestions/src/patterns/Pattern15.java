package patterns;
import java.util.Scanner;
public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENETR THE LIMIT");
		int n=s.nextInt();
		int i,j,a=1,aa=n-2,m=n,k;int p=1;
		for(i=0;i<n;i++)
		{
			if(i<=n-2)
			{	
				for(j=0;j<aa;j++)
				{
					System.out.print("* ");
				}
				aa--;
			
			}
			System.out.println();
	}

}}
