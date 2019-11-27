package companyquestains;
import java.util.Scanner;
public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int la=0,i,l;
System.out.println("ENTER THE FIRST NUMBER");
int a=s.nextInt();
System.out.println("ENTER THE SECOND NUMBER");
int b=s.nextInt();
l=(a>b)?a:b;
for(i=1;i<=l;i++)
{
	if(a%i==0&&b%i==0)
	{
		if(i>la)
			la=i;
	}
}
System.out.printf("GCD=%d",la);
s.close();
	}

}
