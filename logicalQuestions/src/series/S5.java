package series;
import java.util.Scanner;
public class S5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the limit");
int n=s.nextInt();
int a=4,b=1;
for(int i=1;i<=n;i++)
{
	System.out.print(a);
	System.out.print(" ");
	a=a+(b*b);
	b++;
}
	}

}
