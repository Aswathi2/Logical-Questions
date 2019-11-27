package companyquestains;
import java.util.Arrays;
import java.util.Scanner;
public class GcdofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE LIMIT");
		int limit=s.nextInt();
		int array[]=new int[limit];
		System.out.println("ENTER THE ARRAY ELEMENTS");
		int i=0,j,max=0,c=0,la=0;
		for(i=0;i<limit;i++)
		{
			array[i]=s.nextInt();
		}
		Arrays.sort(array);
		max=array[limit-1];
		for(i=1;i<=max;i++)
		{
			c=0;
			for(j=0;j<limit;j++)
			{
			if(array[j]%i==0)
			{
			c++;	
			}
			}
			if(c==limit&&i>la)
			{
				la=i;
			}
		
		}
		System.out.printf("GCD OF TWO NUMBERS IS %d",la);
	}

}
