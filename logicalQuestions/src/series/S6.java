package series;
import java.util.Scanner;
public class S6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     int a=0;
     System.out.println("ENTER THE LIMIT");
     int n=s.nextInt();
     int i=0,ss=0;
     System.out.println("ENTER THE NUMBER");
     int l=s.nextInt();
     int ar[]=new int[n];
     for(i=0;i<n;i++)
     {
    	 
    	 if(i%2==0) {
    		// System.out.printf("%d ", a);
    		 ar[i]=a;
    	 }
    	 else
    	 {
    		ss=a/2;
    		//System.out.printf("%d ", ss);
    		 a=a+2;
    		 ar[i]=ss;
    	 }
  
     }
     for(i=0;i<n;i++)
     {
     if(i==l)
    	 System.out.printf("%d ",ar[i-1]);
	}}

}
