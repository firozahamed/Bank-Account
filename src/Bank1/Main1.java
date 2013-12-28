package Bank1;

public class Main1
{
public static void main(String[] args)
{
	Account acc1=new Account(1000,"firoz");
	AccountList.addAccount(acc1);
	ATM1 atm=new ATM1(1001);
	System.out.println("your balance deduced to:"+atm.withdrawAmount(500));
	
}
}
