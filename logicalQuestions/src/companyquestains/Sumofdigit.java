package companyquestains;
import java.util.Scanner;
public class Sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int number=s.nextInt();
		int i=0,j=0,r,sum=0;
		int a=number;
		while(number>0)
		{
			r=number%10;
			sum=sum+r;
			number=number/10;
		}
		System.out.printf("SUM OF DIGIT=%d", sum);
	}

}
