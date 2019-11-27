package companyquestains;
import java.util.Scanner;
public class Greatestamong3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER1");
		int num1=s.nextInt();
		System.out.println("ENTER THE NUMBER2");
		int num2=s.nextInt();
		System.out.println("ENTER THE NUMBER3");
		int num3=s.nextInt();
		
		int largest =num1 > num2 ? ( num1 > num2 ? num1 : num3) : (num2 > num3 ? num2: num3) ;
		System.out.printf("LARGEST=%d", largest);
	}

}
