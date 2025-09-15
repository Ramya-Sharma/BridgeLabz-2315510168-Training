import java.util.ArrayList;
import java.util.List;

// BankAccount class
class BankAccount {
    private String accountNumber;
    private double balance;
    private Bank bank;  // Associated bank

    public BankAccount(String accountNumber, double initialBalance, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.bank = bank;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Bank getBank() {
        return bank;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into " + accountNumber);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from " + accountNumber);
        } else {
            System.out.println("Insufficient balance in " + accountNumber);
        }
    }
}

// Customer class
class Customer {
    private String name;
    private List<BankAccount> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    // View all balances
    public void viewBalance() {
        System.out.println("Balances for " + name + ":");
        for (BankAccount account : accounts) {
            System.out.println("Bank: " + account.getBank().getBankName() +
                    ", Account No: " + account.getAccountNumber() +
                    ", Balance: " + account.getBalance());
        }
        System.out.println();
    }
}

// Bank class
class Bank {
    private String bankName;
    private List<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    // Associate customer with bank and open an account
    public BankAccount openAccount(Customer customer, String accountNumber, double initialBalance) {
        BankAccount account = new BankAccount(accountNumber, initialBalance, this);
        customer.addAccount(account);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println(customer.getName() + " opened account " + accountNumber + " in " + bankName);
        return account;
    }
}

// Main class
public class main {
    public static void main(String[] args) {
        // Create bank
        Bank bank1 = new Bank("State Bank of India");
        Bank bank2 = new Bank("HDFC Bank");

        // Create customers
        Customer c1 = new Customer("Anushka");
        Customer c2 = new Customer("Rahul");

        // Open accounts in different banks
        bank1.openAccount(c1, "SBI1001", 5000);
        bank1.openAccount(c1, "SBI1002", 10000);

        bank2.openAccount(c2, "HDFC2001", 15000);
        bank2.openAccount(c1, "HDFC2002", 7000);

        // Customers check balances
        c1.viewBalance();
        c2.viewBalance();
    }
}
