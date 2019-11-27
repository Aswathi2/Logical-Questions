package companyquestains;
import java.util.Scanner;
public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
	      System.out.println("ENTER THE NUMBER");
	      int number=s.nextInt();
	      int a=number;
	      double sum=0;
	      int r;
	      while(number>0)
	      {
	    	  r=number%10;
	    	  sum=sum+Math.pow(r,3);
	    	  number=number/10;
	      }
	      if(sum==a)
	    	  System.out.println("AMSTRONG");
	      else
	    	  System.out.println("NOT AMSTRONG");
	}

}
