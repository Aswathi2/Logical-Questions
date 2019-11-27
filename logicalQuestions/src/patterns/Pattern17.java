package patterns;
import java.util.Scanner;
public class Pattern17 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the limit");
int n=s.nextInt();
int i=0,j=0,c;
for(i=1;i<=n;i++)
{
	c=0;
	for(j=1;j<=2*i;j++)
	{
	System.out.print("* ");
	c++;
	if(c==i)
	System.out.print(" ");
	}
	System.out.println();
}
	}

}
