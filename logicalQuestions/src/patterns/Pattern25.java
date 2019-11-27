package patterns;
import java.util.Scanner;
public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("ENTER THE LIMIT");
int n=s.nextInt();
int i,j;
for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	{
	 if(i==0)
		 System.out.print("c");
	 else if(i==n-1)
		 System.out.print("k");	
	 else
	 {
		 if(i==j||i+j==(n-1))
			 System.out.print("s");
		 else
			 System.out.print("*");
		 
		 
	 }	 
	}
	 System.out.println();
}
}}