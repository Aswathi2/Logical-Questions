package companyquestains;
import java.util.Scanner;
public class Enciphering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     System.out.println("ENTER THE CHARACTER");
     char a=s.next().charAt(0);
     System.out.println("ENTER THE NUMBER");
     int b=s.nextInt();
     int d=(int)a;
     int c=b+d;
     System.out.printf("%c",(char)c);
	}

}
