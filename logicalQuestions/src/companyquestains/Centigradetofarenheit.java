package companyquestains;
import java.util.Scanner;
public class Centigradetofarenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE VALUE");
		double value=s.nextDouble();
		double farenheit=value*(9/5)+32;
		System.out.printf("FARENHEIT=%.1f",farenheit);
	}

}
