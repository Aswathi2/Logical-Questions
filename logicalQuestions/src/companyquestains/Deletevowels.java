package companyquestains;
import java.util.Scanner;
public class Deletevowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("ENTER THE STRING");
String str=s.next();
int i=0;
int l=str.length();
String str1="";
str1=str.replaceAll("[AEIOUaeiou]","");
System.out.printf("NEW STRING AFTER DELETION IS %s",str1);
	}

}
