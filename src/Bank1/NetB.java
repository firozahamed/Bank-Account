package Bank1;

public class NetB 
{
	
	private int accountNumber;
	private Account customerAccount;
	
	public NetB(int accountNumber){
		this.accountNumber = accountNumber;
		customerAccount = AccountList.getAccountDetails(this.accountNumber);
	}
	
	public int getCustomerAccountbalance(){
		return customerAccount.getBal();
	}
	
	public int withdrawAmount(int amount){
		return customerAccount.withdrawAmount(amount);
	}
	
	public int depositAmount(int amount){
		return customerAccount.depositAmount(amount);
	}
}
