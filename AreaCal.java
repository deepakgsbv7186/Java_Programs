import java.util.Scanner;
class AreaCal
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int a,b;
System.out.print("Enter Height: ");
a=in.nextInt();
System.out.print("Enter Width: ");
b=in.nextInt();
System.out.println("Area: "+a*b);
}
}