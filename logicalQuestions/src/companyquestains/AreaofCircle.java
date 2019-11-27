package companyquestains;
import java.util.Scanner;
public class AreaofCircle {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		//DECLARATION
		System.out.println("ENTER RADIUS");
		float radius=s.nextFloat();
		float pi=(float) 3.141;
		//FINDING AREA
		float area=pi*radius*radius;
		//PRINTING
		System.out.printf("AREA OF CIRCLE IS %.1f",area);
	}

}
