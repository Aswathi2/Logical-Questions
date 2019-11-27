package companyquestains;
import java.util.Scanner;
public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
double n=s.nextInt();
double sq=Math.sqrt(n);
double ss=sq*sq;
if(ss==n)
	System.out.println("PERFECT SQUARE");
else
	System.out.println("NOT A PERFECT SQUARE");

	}

}
