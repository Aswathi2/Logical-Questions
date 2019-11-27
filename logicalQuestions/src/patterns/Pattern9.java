package patterns;
import java.util.Scanner;
public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE LIMIT");
		int n=s.nextInt();
		int i=0,j=0,k=65;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				
					System.out.printf("%c ",(char)k);
					k++;
					if(k>90)
						k=65;
				}
			System.out.print("\n");
		}
	}

}
