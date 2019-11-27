package series;
import java.util.Scanner;
public class S1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     System.out.println("ENTER THE LIMIT");
     int n=s.nextInt();
     int i,j,sum=0;
     for(i=1;i<=n;i++)
     {
    	 if(i%2==0)
    		sum=(i*i)-2;
    	 else
    		 sum=(i*i)-1;
    	 System.out.print(sum);
    	 System.out.print(" ");
     }
	}

}
