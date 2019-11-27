package companyquestains;
import java.util.Scanner;
public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER 1");
		int num1=s.nextInt();
		System.out.println("ENTER THE NUMBER 2");
		int num2=s.nextInt();
		int lcm=num1>num2?num1:num2;
		int i,max=0;
		for(i=lcm;i<=(num1*num2);i++)
		{
			if(i%num1==0&&i%num2==0)
			{
				max=i;
				break;
			}
		}
		System.out.printf("LCM=%d",max);
		
}}
