package patterns;
import java.util.Scanner;
public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("ENTER THE LIMIT");
int n=s.nextInt();
int i,j=0,sum=0;
for(i=0;i<n;i++)
{
	
for(j=0;j<n;j++)
{
	if(i==j||j==n-i-1)
		System.out.print("* ");
	else
		System.out.print("0 ");
}
System.out.println();
}
	}

}
