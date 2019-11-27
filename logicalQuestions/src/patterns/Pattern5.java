package patterns;
import java.util.Scanner;
public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int i,j,k;
System.out.println("ENTER THE LIMIT");
int n=s.nextInt();
int a=n;
for(i=1;i<=n;i++)
{
	for(k=1;k<a;k++)
	{
		System.out.print(" ");
	}
	for(j=1;j<=i;j++)
	{
		System.out.print("* ");
	}
	System.out.print("\n");
	a--;
}
	}

}
