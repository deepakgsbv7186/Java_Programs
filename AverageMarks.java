import java.util.Scanner;
class AverageMarks
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int[] paper=new int[5];
float avg=0;
System.out.println("Enter marks of five Subjects");
for(int i=0;i<5;i++)
{
System.out.print("Subject"+(i+1)+" Marks"+":");
paper[i]=in.nextInt();
}
for(int i=0;i<5;i++)
avg+=paper[i];
System.out.println("Avergae Marks of Student: "+avg/5);
}
}

