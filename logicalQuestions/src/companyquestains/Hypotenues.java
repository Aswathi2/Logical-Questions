package companyquestains;
import java.util.Scanner;
import java.util.Scanner;

public class Hypotenues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		//DECLARATION
		System.out.println("ENTER SIDE1");
		double side1=s.nextDouble();
		System.out.println("ENTER SIDE2");
	    double side2=s.nextDouble();
		side1=side1*side1;
		side2=side2*side2;
		side1=side1+side2;
		//FINDING HYPOTENUSE
		double hypotenuse=Math.sqrt(side1);
		//PRINTING
		System.out.printf("HYPOTENUSE IS %.1f ",hypotenuse);
	}

}
