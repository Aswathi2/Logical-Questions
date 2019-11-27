package companyquestains;
import java.util.Scanner;
public class VowelsUpperConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("ENTER THE STRING");
String str=s.nextLine();
int u=0,c=0,v=0,i;
for(i=0;i<str.length();i++)
{
	if(str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='A'||str.charAt(i)=='U'||str.charAt(i)=='A'||str.charAt(i)=='i'||str.charAt(i)=='e'||str.charAt(i)=='u'||str.charAt(i)=='o'||str.charAt(i)=='a')
	v++;
	else if(str.charAt(i)>=65&&str.charAt(i)<=90)
	{
		u++;
	}
	else
		c++;
}
System.out.printf("CONSONATS=%d",c);
System.out.printf("VOWELS=%d",v);
System.out.printf("UPPER=%d",u);
	}

}
