class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public String displayAccountType() {
        return "Bank Account";
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public String displayAccountType() {
        return "Savings Account";
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= withdrawalLimit && amount <= getBalance()) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal amount exceeds the limit or insufficient balance.");
        }
    }

    @Override
    public String displayAccountType() {
        return "Checking Account";
    }
}

class FixedDepositAccount extends BankAccount {
    private int depositTerm;

    public FixedDepositAccount(int accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    public int getDepositTerm() {
        return depositTerm;
    }

    @Override
    public String displayAccountType() {
        return "Fixed Deposit Account";
    }
}

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(101, 5000.0, 2.5);
        System.out.println("Account Type: " + savings.displayAccountType());
        System.out.println("Account Number: " + savings.getAccountNumber());
        System.out.println("Balance: " + savings.getBalance());
        System.out.println("Interest Rate: " + savings.getInterestRate());

        CheckingAccount checking = new CheckingAccount(102, 3000.0, 1000.0);
        System.out.println("Account Type: " + checking.displayAccountType());
        System.out.println("Account Number: " + checking.getAccountNumber());
        System.out.println("Balance: " + checking.getBalance());
        System.out.println("Withdrawal Limit: " + checking.getWithdrawalLimit());
        checking.withdraw(800);

        FixedDepositAccount fixedDeposit = new FixedDepositAccount(103, 10000.0, 12);
        System.out.println("Account Type: " + fixedDeposit.displayAccountType());
        System.out.println("Account Number: " + fixedDeposit.getAccountNumber());
        System.out.println("Balance: " + fixedDeposit.getBalance());
        System.out.println("Deposit Term: " + fixedDeposit.getDepositTerm());
    }
}
