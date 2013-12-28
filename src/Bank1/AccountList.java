package Bank1;

public class AccountList {

	private static Account[] accountlist;
	private static int arraycount=0;
	 static
	 {
		 accountlist=new Account[20];
	 }
	 public static void addAccount(Account accobj)
	 {
		 if(arraycount<20)
		 {
			 accountlist[arraycount]= accobj;
			 arraycount++;
		 }
	 }
		public static Account getAccountDetails(int accNum)
		{
			Account accobj=null;
			for(int i = 0 ; i < 20; i++)
			{
				if(accountlist[i].getAccNum()== accNum)
				{
					accobj=accountlist[i];
					break;
				}
				else
				{
					continue;
				}
				
				}
			return accobj;
			}
		}

		
