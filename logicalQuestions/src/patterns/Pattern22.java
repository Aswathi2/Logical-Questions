package patterns;
import java.util.Scanner;
public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE LIMIT");
		int n=s.nextInt();
		int i,j,a=n,c=0,b=n;
		for(i=1;i<=n;i++)
		{
			c=0;
			for(j=1;j<=(2*n)+1;j++)
			{
				if(c<i&&(j==a+1)||(c<i)&&j==b+1) {
					System.out.print("*");
					c++;}
				else
					System.out.print("#");
			}
			System.out.println();
			b++;a--;
		}
		
	}

}
