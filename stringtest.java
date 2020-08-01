import java.util.Scanner;
class stringtest{
String str="Program to test the String";
Scanner sc=new Scanner(System.in);
public void test(){
System.out.println("String Length: "+str.length());
System.out.println("In UpperCase: "+str.toUpperCase());
}
public void palindrome(){
int count=0;
System.out.print("Enter the string: ");
str=sc.next();
int size=str.length();
byte b[]=str.getBytes();
byte b1[]=new byte[size];

for(int i=size-1;i>=0;i--){
int x=size-(i+1);
b1[x]=b[i];
}

for(int i=0;i<size;i++)
if(b1[i]==b[i]);
count++;

if(count==size)
System.out.println(str+" is a plaindrome");
else
System.out.println(str+" is not plaindrom");
}
public static void main(String args[]){
stringtest st=new stringtest();
st.test();
st.palindrome();
}
}