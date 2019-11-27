package companyquestains;
import java.util.Scanner;
public class Casechainging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("ENTER THE STRING");
String str=s.next();
int l=str.length();
char ch[]=str.toCharArray();
int i=0;
for(i=0;i<l;i++)
{
if(ch[i]>=65&&ch[i]<=90)
	ch[i]=(char) (ch[i]+32);

else
	ch[i]=(char) (ch[i]-32);
}
for(i=0;i<l;i++)
	System.out.print(ch[i]);
	}

}
