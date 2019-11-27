package companyquestains;
import java.util.Scanner;
public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int n=s.nextInt();
		int i=0;
		int oct []=new int[25];
		while(n>0)
		{
		oct[i]=n%8;
		n=n/8;
		i++;
		}
		for(int k=i-1;k>=0;k--)
			System.out.printf("%d", oct[k]);
		}

	}


