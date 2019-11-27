package companyquestains;
import java.util.Scanner;
public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		//ENTERING LIMIT
		System.out.println("ENTER THE LIMIT");
		int limit=s.nextInt();
		int i,j,min=9;
		int array[]=new int[limit];
		//INPUTTING ARRAY ELEMENTS
		System.out.println("ENTER ARRAY ELEMENTS");
		for(i=0;i<limit;i++)
		{
			array[i]=s.nextInt();
		}
		for(i=0;i<limit;i++)
		{
			if(array[i]<min)
			{
				min=array[i];
			}
		}
		System.out.printf("%d",min);
		
		
	}

}
