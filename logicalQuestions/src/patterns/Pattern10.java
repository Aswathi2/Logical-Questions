package patterns;
import java.util.Scanner;
public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner s=new Scanner(System.in);
				System.out.println("ENTER THE LIMIT");
				int n=s.nextInt();
				int m=n,b=n;
				int i=0,j=0,k=64;
				for(i=1;i<=n;i++)
				{
					for(j=1;j<=b;j++)
					{
						
							System.out.printf("%c ",m+k);
							m--;
						}
					System.out.print("\n");
					m=n;k--;b--;
				}
			}
}
