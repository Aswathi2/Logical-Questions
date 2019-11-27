package companyquestains;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s=new Scanner(System.in);
		  //DECLARATION
		  System.out.println("ENTER THE NUMBER");
	      int n=s.nextInt();
	      int f=1,i;
	      //FINDING FACTORIAL
	      for(i=1;i<=n;i++)
	      {
	        f=f*i;
	      }
	      //PRINTING
	      System.out.printf("%d", f);
	}
	}


