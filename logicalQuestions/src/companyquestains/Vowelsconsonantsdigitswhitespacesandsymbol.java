package companyquestains;

import java.util.Scanner;

public class Vowelsconsonantsdigitswhitespacesandsymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String str=s.nextLine();
		int c=0,v=0,i,d=0,w=0,ss=0;
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='A'||str.charAt(i)=='U'||str.charAt(i)=='A'||str.charAt(i)=='i'||str.charAt(i)=='e'||str.charAt(i)=='u'||str.charAt(i)=='o'||str.charAt(i)=='a')
			v++;
			else if(str.charAt(i)>=48&&str.charAt(i)<=57)
				d++;
			else if(str.charAt(i)==' ')
				w++;
			else if(str.charAt(i)>=65&&str.charAt(i)<=90||str.charAt(i)>=90&&str.charAt(i)<=122)
				c++;
			else
				ss++;
				
		}
		System.out.printf("CONSONATS=%d\n",c);
		System.out.printf("VOWELS=%d\n",v);
		System.out.printf("WHITESPACE=%d\n",w);
		System.out.printf("SYMBOLS=%d\n",ss);
		System.out.printf("DIGITS=%d",d);
			}

		


	}


