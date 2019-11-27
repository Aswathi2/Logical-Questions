package companyquestains;
import java.util.Scanner;
public class InsertingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENETR THE ARRAY SIZE");
		int size=s.nextInt();
		int i,j,temp=0,temp1=0;
		int a[]=new int[size+1];
		System.out.println("ENETR THE ARRAY ELEMENTS");
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("ENETR THE POSITION");
		int position=s.nextInt();
		System.out.println("ENETR THE ELEMENT");
		int element=s.nextInt();
		for(i=size;i>=position-1;i--)
		{
			if(i==position-1)
			{
			
			a[i]=element;
			
		}
			else
			{
			a[i]=a[i-1];
			}
		
	}
System.out.println("after insertion");
for(i=0;i<size+1;i++)
{
	System.out.printf("%d\n", a[i]);
}
}}
