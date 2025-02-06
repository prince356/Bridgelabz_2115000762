import java.util.*;
//bank class
class Bank {

    private String name;
    private List<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void openAccount(Customer customer, double initialBalance) {
        Account newAccount = new Account(this, customer, initialBalance);
        accounts.add(newAccount);
        customer.addAccount(newAccount);
        System.out.println("Account opened for " + customer.getName() + " with balance: $" + initialBalance);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public String getName() {
        return name;
    }
}

//bank account class
class BankAccount{
    private String accountNumber;
    private String name;
    private double balance;
    public BankAccount(){
        
    }
}

class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Balances for " + name + ":");
        for (Account account : accounts) {
            System.out.println("Account in " + account.getBank().getName() + " - Balance: $" + account.getBalance());
        }
    }
}


//account class
class Account {
    private Bank bank;
    private Customer customer;
    private double balance;

    public Account(Bank bank, Customer customer, double initialBalance) {
        this.bank = bank;
        this.customer = customer;
        this.balance = initialBalance;
    }

    public Bank getBank() {
        return bank;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        
        Bank bank = new Bank("Global Bank");
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        bank.openAccount(customer1, 1000);
        bank.openAccount(customer2, 500);

        customer1.viewBalance();
        customer2.viewBalance();
    }
}