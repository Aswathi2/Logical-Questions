package patterns;
import java.util.Scanner;
public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("ENTER THE LIMIT");
int n=s.nextInt();
int i,j,l=1,k1=0,a=n,m=0,c=0;
for(i=1;i<=n;i++)
{
	
	for(j=1;j<=n;j++)
	{
		if(j<=i)
		System.out.printf("%d ",j);
		else
			System.out.print(" ");
	}
	for(j=n;j>=1;j--)

		if(j<=i)
		System.out.printf("%d ",j);
		else
			System.out.print(" ");
	System.out.println();
}
	}

}
