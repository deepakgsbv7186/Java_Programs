import java.util.*;

class account
{
	String name;
	int balance=10000;
	int withdraw;
	int cbalance;
	double interest;
	account()
	{
		System.out.print("Enter the Account Holder Name: ");
		Scanner in=new Scanner(System.in);

		name=in.next();

		System.out.print("Enter the Withdraw Amount: ");
		withdraw=in.nextInt();

		if(withdraw>0&&withdraw<=10000){
			cbalance=balance-withdraw;
			System.out.println("Trancaction Successful");
		}
		else
			System.out.println("Amount is insufficiant");
	}

	void AccountDetails()
	{
		System.out.println("Account Holder Name: "+name);
		System.out.println("After transaction balance: "+cbalance);
	}

	void RateInterest()
	{
		interest=cbalance * 0.05;
		System.out.println("Transcation Bouns: 5%");
		System.out.println("Current Balance: "+(interest+cbalance));
	}
}
class account1
{
	public static void main(String args[])
	{
		account obj=new account();
		obj.AccountDetails();
		//obj.CurrentBalance();
		obj.RateInterest();
	}
}