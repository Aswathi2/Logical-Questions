package patterns;
import java.util.Scanner;
public class Pattern20 {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	int i,j,k;
	System.out.println("ENTER THE LIMIT");
	int n=s.nextInt();
	int a=n,m=1,k1=0,l=0;
	for(i=1;i<=n;i++)
	{
	l=i;m=1;	
	for(j=1;j<=i;j++)
	{
		if(m==1)
		{
		for(k1=1;k1<a;k1++)
		{
			System.out.print(" ");
		}
		m=0;
		}
		System.out.printf("%d ",l);
		l--;
	}
	System.out.println();
	a--;
	}
}}