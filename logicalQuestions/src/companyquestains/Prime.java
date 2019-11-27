package companyquestains;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER NUMBER");
		int n=s.nextInt();
		int i,flag=0;
		if(n==2) {
			System.out.println("PRIME");
		}
		if(n>2)
		{
		for(i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
			flag=1;
			break;
			}
			else
			{
				flag=0;
		}}
		if(flag==1)
			System.out.println("NOT PRIME");
		else
			System.out.println("PRIME");
	}}

}
