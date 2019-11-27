package series;
import java.util.Scanner;
public class Robbery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("ENTER THE NUMBER OF HOUSES");
int n=s.nextInt();
int i;
int a[]=new int[n];
System.out.println("ENTER THE MONEY IN EACH HOUSES");
for(i=0;i<n;i++)
{
	a[i]=s.nextInt();
}

int max=0,j,sum=0,k;
if(n==2) {
	i=0;
	if(a[i]>a[i+1])
	max=a[i];
	else
		max=a[i+1];
}
else
{
for(i=0;i<n;i++)
{
	sum=0;sum=sum+a[i];
	for(j=i+2;j<n;j=j+2)
	{
		sum=sum+a[j];

		}
	if(sum>max)
		max=sum;
	}
for(i=0;i<n;i++)
{
	sum=0;sum=sum+a[i];
for(k=i+3;k<n;k=k+2)
{
	sum=sum+a[k];

	}
if(sum>max)
	max=sum;
}
}
System.out.println(max);
	}

}
