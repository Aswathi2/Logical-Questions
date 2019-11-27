package patterns;
import java.util.Scanner;
public class Pattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("ENTER LIMIT");
int n=s.nextInt();
int i,j=0,k=0,a=n,m=1,o=n;
for(i=1;i<2*n;i++)
{
  if(i<=n)
  {
	for(k=1;k<a;k++)
	System.out.print(" ");
	for(j=1;j<=i;j++)	
	{
		System.out.print("* ");
	}
	a--; 
}
  else
  {
	  for(k=1;k<=m;k++)
			System.out.print(" ");
			for(j=1;j<=o-1;j++)	
			{
				System.out.print("* ");
			}
			m++; o--; 
  }
  System.out.println();
	}

}
}