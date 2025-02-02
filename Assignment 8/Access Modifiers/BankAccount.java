class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsDetails() {
        System.out.println("Savings Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("123456789", "Alice Brown", 1500.0);
        acc1.displayAccountDetails();
        acc1.setBalance(2000.0);
        System.out.println("Updated Balance: $" + acc1.getBalance());

        System.out.println();

        SavingsAccount savAcc = new SavingsAccount("987654321", "Bob Smith", 3000.0, 2.5);
        savAcc.displaySavingsDetails();
    }
}
