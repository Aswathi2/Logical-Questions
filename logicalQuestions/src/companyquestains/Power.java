package companyquestains;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("ENTER THE NUMBER 1");
int num1=s.nextInt();
System.out.println("ENTER THE NUMBER 2");
int num2=s.nextInt();
double power=Math.pow(num1,num2);
System.out.printf("%d^%d=%.1f",num1,num2,power);
	}

}
