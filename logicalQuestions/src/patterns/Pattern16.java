package patterns;
import java.util.Scanner;
public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("ENTER THE LIMIT");
int n=s.nextInt();
int i=0,j=0;
for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	{
		if(i==j)
			System.out.print("0 ");
		else
			System.out.printf("%d ",i+1);
	}
	System.out.println();
}
	}

}
