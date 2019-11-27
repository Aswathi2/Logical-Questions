package patterns;
import java.util.Scanner;
public class Pattern4 {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

				Scanner s=new Scanner(System.in);
				int i,j,k;
				System.out.println("ENTER THE LIMIT");
				int n=s.nextInt();
				int a=n;
				for(i=1;i<=n;i++)
				{
					if(i>1)
					{
						for(k=1;k<i;k++)
						{
							System.out.print(" ");
				}}
						for(j=1;j<=a;j++)
						{
							System.out.print("*");
						}
			
        System.out.print("\n");
        a--;
				}
	}

}
