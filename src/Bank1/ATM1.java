package Bank1;

public class ATM1 {
	private int accountNumber;
	private Account customerAccount;
	
	public ATM1(int accNum){
		this.accountNumber = accNum;
		customerAccount = AccountList.getAccountDetails(accountNumber);
	}
	
	public int getCustomerAccountbalance(){
		return customerAccount.getBal();
	}
	
	public int withdrawAmount(int amount){
		return customerAccount.withdrawAmount(amount);
	}


}
