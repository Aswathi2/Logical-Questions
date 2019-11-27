package companyquestains;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      System.out.println("ENTER THE NUMBER");
      int number=s.nextInt();
      int i,sum=0;
      for(i=1;i<number;i++)
      {
    	  if(number%i==0)
    	  {
    		sum=sum+i;  
    	  }
      }
      if(sum==number)
      {
    	  System.out.println("PERFECT NUMBER");
    	  
      }
      else
    	  System.out.println("NOT A PERFECT NUMBER");
	}

}
