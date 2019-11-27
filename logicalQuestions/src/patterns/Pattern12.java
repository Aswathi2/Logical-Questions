package patterns;
import java.util.Scanner;
public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s=new Scanner(System.in);
		System.out.println("ENETR THE STRING");
			  String str=s.next();
				
			  int n=str.length();
			  int i,j,k=0;
			  for(i=0;i<n;i++)
			  {
				  k=0;
				 
				  for(j=0;j<=i;j++)
				  {
					  System.out.printf("%c ",str.charAt(k));
									   k++;
				  }
				 
				  System.out.println();
					  
			  }
		  }
		
}

