public class BankAccount{

	static String bankName = "Indian Overseas Bank";
	private String accountHolderName;
	private final int accountNumber;

	static int TotalAccounts =0;

	public BankAccount(String accountHolderName, int accountNumber){
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		TotalAccounts++;
	}
	public static void getTotalAccounts(){
		System.out.println("The total number of accounts are: "+ TotalAccounts);
	}

	public void displayDetails(){
		if(this instanceof BankAccount){
			System.out.println("The name of bank is "+ bankName);
			System.out.println("The name of account holder is: "+ accountHolderName);
			System.out.println("The account number is: "+ accountNumber);
		}
	}

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount("Rahul", 12345);
		BankAccount account2 = new BankAccount("Rohan", 67890);
		account1.displayDetails();
		account2.displayDetails();
		BankAccount.getTotalAccounts();
	}
}
