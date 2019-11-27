package patterns;
import java.util.Scanner;
public class PatternAss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner s=new Scanner(System.in);
			  String str=s.next();
			  int n=s.nextInt();
			  int i,j,k=0,m=0,a=n;
			  for(i=0;i<2*n;i++)
			  {
				  k=0;
				  if(i<=n)
				  {
				  for(j=0;j<i;j++)
				  {
					  System.out.printf("%c ",str.charAt(k));
									   k++;
				  }}
				  else
				  {
					 for(j=0;j<a-1;j++)
				  {
					  System.out.printf("%c ",str.charAt(k));
									   k++;
				  }
					  a--;
				  }  
				  System.out.println();
					  
			  }
		  }
		
	}

