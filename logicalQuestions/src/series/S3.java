package series;
import java.util.Scanner;
public class S3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the limit");
int n=s.nextInt();
int a=1,sum=1,c=0;
float ss=1;

for(int i=1;i<=n;i++)
{
	ss = sum*a;
	System.out.printf("%.1f",ss);
	System.out.print(" ");
	c++;sum++;
	if(c==2)
	{
		a=a*3;
		c=0;
		sum=1;  
		}
	}
	
}
	}
