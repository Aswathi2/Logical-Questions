package companyquestains;
import java.util.Scanner;
public class Substringreplacing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String str=s.nextLine();
		System.out.println("ENTER THE SUBSTRING1");
		String sub1=s.nextLine();
		System.out.println("ENTER THE SUBSTRING2");
		String sub2=s.nextLine();
		String str4=str.replace(sub1,sub2);
		System.out.println(str4);
	}

}
