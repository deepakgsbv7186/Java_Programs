import java.util.Scanner; 
class MatrixMulti
{
public static void main(Sting args[])
{
int[] a=new int[2][2];
int[] b=new int[2][2];
int[] c=new int[2][2];
Scanner s=new Scanner(System.in);
System.out.println("Enter elements of Matrix A:");
for(int i=0;i<2;i++)
for(int j=0;j<2;j++)
a[i][j]=s.nextInt();
System.out.println("Enter elements of Matrix B:");
for(int i=0;i<2;i++)
for(int j=0;j<2;j++)
a[i][j]=s.nextInt();

//Adding both matrix

for(i=0;i<2;i++)
for(j=0;j<2;j++)
c[i][j]=a[i][j]+b[i][j];

for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
System.out.print("\t"+c[i][j]);
System.out.println(" ");
}
}
}