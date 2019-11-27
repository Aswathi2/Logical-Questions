package patterns;
import java.util.Scanner;
public class Pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int i,j;
for(i=1;i<=5;i++)
{
	for(j=1;j<=4;j++)
	{
		if((i==1&&j!=1)||(i==2&&j==2)||(i==3&&j==4)||(i==4&&j==4)||(i==5&&j!=4))
System.out.print("*");
		else
			System.out.print(" ");
			
}
	System.out.println();
	}
	}

}
