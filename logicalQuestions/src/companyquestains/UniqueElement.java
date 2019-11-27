package companyquestains;
import java.util.Scanner;
public class UniqueElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("ENTER THE LIMIT");
int limit=s.nextInt();
int array[]=new int[limit];
System.out.println("ENTER THE ARRAY ELEMENTS");
int i=0,j=0,c=0;
for(i=0;i<limit;i++)
{
	array[i]=s.nextInt();
}
for(i=0;i<limit;i++)
{
	for(j=i+1;j<limit;j++)
	{
	if(array[i]==array[j])
	
	c++;	
	
		
	}
}
	if(c==0)
		System.out.println("UNIQUE");
	else
		System.out.println("NOT UNIQUE");
	}
}
