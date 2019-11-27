package companyquestains;
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		//DECARATION
		System.out.println("ENTER THE YEAR");
		int year=s.nextInt();
		if(year%4==0&&(year%100!=0||year%400==0))
		{
		System.out.println("LEAP YEAR");
		}
		else
			System.out.println("NOT LEAP YEAR");
	}

}
