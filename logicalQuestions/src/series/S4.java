package series;
import java.util.Scanner;
public class S4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("ENTER LIMIT");
int l=s.nextInt();
int i;
float ss=(float) .5;
for(i=1;i<=l;i++)
{
	System.out.printf("%.1f", ss);
	System.out.print(" ");
	ss=ss*3;
}
	}

}
