package companyquestains;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
	      System.out.println("ENTER THE NUMBER");
	      int number=s.nextInt();
	      int i=2;
	      int number1=0,number2=1,sum=0;
	      if(number==1)
	      System.out.printf("%d\n",number1);
	      else if(number==2)
	      {
	      System.out.printf("%d\n",number1);
	      System.out.printf("%d\n",number2);
	      }
	     
	      else
	      {
	    	  System.out.printf("%d\n",number1);
		      System.out.printf("%d\n",number2);
	      while(i<number)
	     {
	    	sum=number1+number2; 
	    	System.out.printf("%d\n",sum);
		      number1=number2;
		      number2=sum;
		      i++;
	     }}     
	}

}
