package patterns;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int i,j;
		System.out.println("ENTER THE LIMIT");
		int n=s.nextInt();
		for(i=0;i<=n;i++)
		{
			for(j=0;j<i;j++)
			{
			System.out.print("*");	
			}
			System.out.print("\n");
		}
	}

}
