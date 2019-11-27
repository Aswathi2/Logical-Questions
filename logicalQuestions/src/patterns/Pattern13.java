package patterns;
import java.util.Scanner;
public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);

System.out.println("ENETR THE LIMIT");
	int n=s.nextInt();
	int i,j,a=1,aa=0,m=n,k;int p=1;
	for(i=0;i<2*n;i++)
	{
		if(i<n)
		{
		m--;
		for(j=0;j<m;j++)
		{
			System.out.print(" ");
		}
		for(k=0;k<a;k++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
		aa=a;
		a=a+2;
		}
		
		else {
			aa=aa-2;
		for(j=0;j<p;j++)
		{
			System.out.print(" ");
		}
		for(k=0;k<aa;k++)
		{
			System.out.print("*");
		}
		System.out.print("\n");p++;
	}
	}

}}
