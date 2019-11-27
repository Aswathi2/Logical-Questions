package companyquestains;
import java.util.Scanner;
public class Searchforelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("ENTER THE ARRAY LIMIT");
int limit=s.nextInt();
int a[]=new int[limit];

System.out.println("ENTER THE ARRAY");
int i=0,v=0;
for(i=0;i<limit;i++)
{
	a[i]=s.nextInt();
}
System.out.println("ENTER THE SEARCHING ELEMENT");
int e=s.nextInt();
for(i=0;i<limit;i++)
{
if(a[i]==e) {
	v=1;

	System.out.println("YES");
}


	}
if(v==0)
	System.out.println("NO");

}}
