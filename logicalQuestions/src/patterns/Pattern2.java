package patterns;
import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int i,j;
		System.out.println("ENTER THE LIMIT");
		int n=s.nextInt();
		int a=n;
		for(i=0;i<=n;i++)
		{
			for(j=1;j<=a;j++)
			{
			System.out.print("*");	
			}
			System.out.print("\n");
			a--;
		}
	}

}
