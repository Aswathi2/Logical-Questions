package companyquestains;import java.io.FileInputStream;
import java.util.Scanner;
public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE STRING1");
		String str=s.next();
		
		String str2="";
		int l=str.length();
		int i;
		   
		   for(i=l/2;i<l;i++)
		    {  
		 str2=str2+str.charAt(i);
		    }
		   for(i=0;i<l/2;i++)
		    {  
		 str2=str2+str.charAt(i);
		    }
		   
		  
			   System.out.printf(str2);   
		   
	}

}
