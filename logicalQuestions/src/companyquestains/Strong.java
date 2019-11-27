package companyquestains;
import java.util.Scanner;
public class Strong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		//INPUT
System.out.println("ENTER THE NUMBER");
int n=s.nextInt();
int a=n,r,f,i,sum=0;
//
while(n>0)
{
	r=n%10;
	f=1;
	for(i=1;i<=r;i++)
	{
	f=f*i;	
	}
	sum=sum+f;
	n=n/10;
	
}
//CHECKING
if(a==sum)
	System.out.println("Strong number");
else
	System.out.println("Not a strong number");
	}

}
