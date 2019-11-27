package series;
import java.util.Scanner;
public class S2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the limit");
int n=s.nextInt();
int a=11,sq=0;
for(int i=1;i<=n;i++)
{
	sq=a*a;
	System.out.print(sq);
	System.out.print(" ");
	a=a+4;
}
	}

}
