package companyquestains;
import java.util.Scanner;
public class Sumofprimenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("ENTER THE LOWER BOUND");
int a=s.nextInt();
System.out.println("ENTER THE UPPER BOUND");
int b=s.nextInt();
int i,j,flag=0,sum=0;
for(i=a;i<=b;i++)
{

	if(i==2)
		flag=0;
	else
	{
	for(j=2;j<=i/2;j++)
	{
		if(i%j==0)
		{
			flag=1;
			break;
		}
		else
			flag=0;
		
	}}
	if(flag==0) {
	sum=sum+i;
	}
	}
System.out.printf("%d\n",sum);
}
	}


