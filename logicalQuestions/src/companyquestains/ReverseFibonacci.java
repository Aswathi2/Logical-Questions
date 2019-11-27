package companyquestains;
import java.util.Scanner;
public class ReverseFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		 System.out.println("ENTER THE LIMIT");
	      int limit=s.nextInt();
	      int i=0;
	      int number1=0,number2=1,sum=0;
	      int a[]=new int[limit];
	      a[0]=0;a[1]=1;
	      for(i=2;i<limit;i++)
	      {
	    	sum=number1+number2; 
	    	a[i]=sum;
		      number1=number2;
		      number2=sum;
		     
	     }
	      for(i=limit-1;i>=0;i--)
	    System.out.printf("%d\n",a[i]);
	}

}