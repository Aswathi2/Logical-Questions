package companyquestains;
import java.util.Scanner;
public class HighestFreequencyChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String str=s.next();
		int i=0,j=0;
		char ch =0;
		int max=0,count=0;
		int l=str.length();
		 for(i=0;i<l;i++)
		    {
			 count=0;
		    	for(j=i+1;j<l;j++)
		        {
		    if(str.charAt(i)==(str.charAt(j)))
		    {
		    	count++;
		    }}
		    
		    	if(max<count)
		    	{
		    		max=count;
		    		ch=str.charAt(i);
		    	}		}
	
		 System.out.print("HIGHEST FREEQUENCY CHARACTER IS ");
System.out.println(ch);
}}
