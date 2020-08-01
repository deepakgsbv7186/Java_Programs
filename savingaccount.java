import java.util.*;

class savingaccount{
String name;
long acc;
int bal=10000,widraw;
double cbal;
final double interest=0.05;
Scanner sc=new Scanner(System.in);

savingaccount(){
System.out.print("Enter your Full Name: ");
name=sc.nextLine();
System.out.print("Enter your account number: ");
acc=sc.nextLong();
}

void withdrawAmount(){
System.out.print("Enter withdrawl amount: ");
widraw=sc.nextInt();
if(widraw>2000 && widraw<=10000){
bal=bal-widraw;
System.out.println("Transaction Successful");
}
else
System.out.println("Insufficient Balance");
}

void accountDetails(){
cbal=interest*bal + bal;
System.out.println("Account Holder Name: "+name);
System.out.println("Account Number: "+acc);
System.out.println("Balance: "+bal);
System.out.println("Interest + Balance: "+cbal);
}

public static void main(String args[]){
//account ac=new account();
savingaccount sa=new savingaccount();
sa.withdrawAmount();
sa.accountDetails();
}
}
