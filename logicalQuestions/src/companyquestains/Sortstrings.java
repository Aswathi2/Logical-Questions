package companyquestains;
import java.util.Scanner;
public class Sortstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     System.out.println("ENTER THE NUMBER OF STRINGS");
     int number=s.nextInt();
     String str[]=new String[number];
     String temp="";
     int i,j;
     System.out.println("ENTER THE STRINGS");
     for(i=0;i<number;i++)
     {
    	 str[i]=s.next();
     }
   
    for(i=0;i<number;i++)
    {
    	for(j=0;j<number;j++)
        {
    if(str[i].charAt(0)<str[j].charAt(0))
    {
    	temp=str[i];
    	str[i]=str[j];
    	str[j]=temp;
    }
    }
	}
    System.out.println("SORTED ARRAY IS");
    for(i=0;i<number;i++)
    {
    	System.out.printf("%s\n",str[i]);
    }
}
}
