package companyquestains;
import java.util.Arrays;
import java.util.Scanner;
public class Lcmofarray {

	public static void main(String[] args) {
		
				Scanner s=new Scanner(System.in);
				System.out.println("ENTER THE LIMIT");
				int limit=s.nextInt();
				int array[]=new int[limit];
				System.out.println("ENTER THE ARRAY ELEMENTS");
				int i=0,j,max=0,c=0,la=1,l=0;
				for(i=0;i<limit;i++)
				{
					array[i]=s.nextInt();
					la=array[i]*la;
				}
				Arrays.sort(array);
				max=array[limit-1];
				for(i=max;i<=la;i++)
				{
					c=0;
					for(j=0;j<limit;j++)
					{
					if(i%array[j]==0)
					{
					c++;	
					}
					}
					if(c==limit)
					{
						max=i;
						break;
					}
				
				}
				System.out.printf("LCM OF ARRAY IS %d",max);
			}

		


	}


