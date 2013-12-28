package Bank1;

public class Account {
	private int bal;
	public static int accnumbercounter=1000;
	private int accnum;
	private String accHoldername;
	
	 public int getBal(){
		 return this.bal;
	 }
	 
	 public int getAccNum(){
		 return this.accnum;
	 }
	 
	 public String getAccountHolderName(){
		 return this.accHoldername;
	 }
	 public Account(int openBal, String customerName)
	 {
		 accnumbercounter++;
		 bal=openBal;
		 accHoldername=customerName;
		 accnum=accnumbercounter;
	 }
	 public int depositAmount(int amt)
	 {
		 if(amt>0)
		 {
			 bal+=amt;
			 
		 }
		 return bal;
			 
	 }
	 public int withdrawAmount(int amt) 
	 {
        if(amt>0 && bal>0)
        {
        	bal-=amt;
        }
         return bal;
	 }
}
