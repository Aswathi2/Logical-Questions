package companyquestains;
import java.util.Scanner;
public class Binarytodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("ENTER THE BINARY NUMBER");
int n=s.nextInt();
int r,sum=0;
double i=0,j=2;
while(n>0)
{
r=n%10;
sum=(int) (sum+(r*Math.pow(j,i)));
i++;
n=n/10;
}
System.out.println(sum);
s.close();
	}

}
