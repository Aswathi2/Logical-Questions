package companyquestains;
import java.util.Scanner;
public class Secondgreatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("ENTER THE NUMBER1");
int num1=s.nextInt();
System.out.println("ENTER THE NUMBER2");
int num2=s.nextInt();
System.out.println("ENTER THE NUMBER3");
int num3=s.nextInt();

if(num1<num2&&num2<num3)
{
	System.out.println(num2);
}
else if(num3<num2&&num2<num1)
{
	System.out.println(num2);
}
else if(num1<num3&&num3<num2)
{
	System.out.println(num3);
}
else if(num2<num3&&num3<num1)
{
	System.out.println(num3);
}
else if(num3<num1&&num1<num2)
{
	System.out.println(num1);
}
else
{
	System.out.println(num1);
}

	}

}
