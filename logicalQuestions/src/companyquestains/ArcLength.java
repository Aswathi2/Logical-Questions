package companyquestains;
import java.util.Scanner;
public class ArcLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE RADIUS");
		float radius=s.nextFloat();
		float pi=(float) 3.14;
		System.out.println("ENTER THE ANGLE");
		int angle=s.nextInt();
		
		double arclength=(double)(2*pi*radius*(angle/360.0));
		System.out.println(arclength);
		
	}

}
