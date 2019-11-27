package companyquestains;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      System.out.println("ENTER THE NUMBER");
      int number=s.nextInt();
      int a=number;
      int sum=0,r;
      while(number>0)
      {
    	  r=number%10;
    	  sum=sum*10+r;
    	  number=number/10;
      }
      if(sum==a)
    	  System.out.println("PALINDROME");
      else
    	  System.out.println("NOT PALINDROME");
      
	}

}
