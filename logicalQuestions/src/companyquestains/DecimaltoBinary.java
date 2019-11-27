package companyquestains;
import java.util.Scanner;
public class DecimaltoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("ENTER THE NUMBER");
int decimal=s.nextInt();
int binary[]=new int[25];
int r,i=0;
while(decimal>0)
{
binary[i]=decimal%2;
decimal=decimal/2;
i++;
}

System.out.println("THE BINARY REPRESENTATION IS");
int k=0;
for(k=i-1;k>=0;k--)
{
	System.out.printf("%d", binary[k]);
}
	}

}
