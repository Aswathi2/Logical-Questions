package companyquestains;
import java.util.Scanner;
public class Stringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("ENTER THE STRING");
String str=s.next();
int l=str.length();
String str1="";

int i;
for(i=l-1;i>=0;i--)
{
str1=str1+str.charAt(i);	

}
System.out.println(str1);
if(str.equals(str1))
	System.out.println("PALINDROME");
else
	System.out.println("NOT PALINDROME");
	}

}
