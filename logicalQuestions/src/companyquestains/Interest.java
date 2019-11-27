package companyquestains;
import java.util.Scanner;
public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		//Inputting
		System.out.println("enter the principle amount");
		double principleamount=s.nextDouble();
		System.out.println("enter the number of years");
		int numberofyear=s.nextInt();
		System.out.println("enter the rate of interest");
		double rateofinterest=s.nextDouble();
		double interest=0;
		interest=principleamount*numberofyear*(rateofinterest/100);
		System.out.printf("SIMPLE INTEREST=%.1f",interest);
	}

}
