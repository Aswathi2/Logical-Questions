package companyquestains;
import java.util.Scanner;
public class Circumference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
double pi=3.141;
System.out.println("ENTER THE RADIUS");
double radius=s.nextDouble();
double circumference=radius*2*pi;
System.out.printf("CIRCUMFERENCE OF CIRCLE=%.1f",circumference);
	}

}
