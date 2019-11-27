package patterns;
import java.util.Scanner;
public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.next();
		System.out.println("enter the length");
		int n=s.nextInt();
		int i,j,k=0;
		int l=str.length();
		for(i=0;i<n;i++)
		{
			for(j=0;j<l;j++)
			{
				char c=str.charAt(j);
				for(k=0;k<=i;k++) {
				System.out.print(c);
				}
			
			}
		
			System.out.println();
		}
	}

}
