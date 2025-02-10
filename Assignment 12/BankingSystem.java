abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return 0; 
    }
}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

class PersonalLoanAccount extends SavingsAccount implements Loanable {
    private double loanAmount;

    public PersonalLoanAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance, interestRate);
    }

    @Override
    public void applyForLoan(double amount) {
        loanAmount = amount;
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000;
    }
}

public class BankingSystem {
    public static void calculateAndPrintInterest(BankAccount[] accounts) {
        for (BankAccount account : accounts) {
            double interest = account.calculateInterest();
            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Interest: $" + interest);
            System.out.println("------------------------------");
        }
    }

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA123", "Alice", 10000, 5);
        CurrentAccount currentAccount = new CurrentAccount("CA123", "Bob", 2000);
        PersonalLoanAccount loanAccount = new PersonalLoanAccount("LA123", "Charlie", 8000, 4);

        BankAccount[] accounts = {savingsAccount, currentAccount, loanAccount};
        calculateAndPrintInterest(accounts);
    }
}