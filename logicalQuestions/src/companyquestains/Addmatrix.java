package companyquestains;
import java.util.Scanner;
public class Addmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("ENTER THE NUMBER OF ROWS OF  MATRIX");
int raw1=s.nextInt();
System.out.println("ENTER THE NUMBER OF COLOUMNS OF  MATRIX");
int col1=s.nextInt();
int i,j;
int matrix1[][]=new int[raw1][col1];
int matrix2[][]=new int[raw1][col1];
int summatrix[][]=new int[raw1][col1];
System.out.println("ENTER THE ELEMENTS OF FIRST MATRIX");
for(i=0;i<raw1;i++)
{
	for(j=0;j<col1;j++)	
	{
	matrix1[i][j]=s.nextInt();	
	}
}
System.out.println("ENTER THE ELEMENTS OF SECOND MATRIX");
for(i=0;i<raw1;i++)
{
	for(j=0;j<col1;j++)	
	{
	matrix2[i][j]=s.nextInt();	
	}
}
System.out.println("THE RESULTANT MATRIX");
for(i=0;i<raw1;i++)
{
	for(j=0;j<col1;j++)	
	{
	summatrix[i][j]=matrix1[i][j]+matrix2[i][j];
	System.out.printf("%d ", summatrix[i][j]);
	}
	System.out.println("\n");
}

	}

}
