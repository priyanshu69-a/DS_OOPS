package com.chitkara.day52;

class BankAccount {
    private double balance;
    private String accountNumber;
    public String ownerName;

    public BankAccount(String owner, String accNum, double initialBalance) {
        this.ownerName = owner;
        this.accountNumber = accNum;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    private void updateAccountNumber(String newNumber) {
        this.accountNumber = newNumber;
    }

    public String getAccountInfo() {
        return "Owner: " + ownerName + ", Balance: $" + balance;
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", "ACC12345", 1000.0);

        System.out.println("=== PUBLIC ACCESS - Works Fine ===");
        System.out.println("Owner Name: " + account.ownerName);
        account.ownerName = "Jane Doe";
        System.out.println("Updated Name: " + account.ownerName);

        account.deposit(500);
        System.out.println("Balance via public method: $" + account.getBalance());

        System.out.println("\n=== PRIVATE ACCESS - Would Cause Errors ===");
        System.out.println("The following lines are commented out because they cause compilation errors:");
        System.out.println("// account.balance = 999999;  // ERROR: balance is private");
        System.out.println("// account.accountNumber = \"HACKED\";  // ERROR: accountNumber is private");
        System.out.println("// account.updateAccountNumber(\"NEW123\");  // ERROR: method is private");

        System.out.println("\n=== CORRECT WAY - Use Public Methods ===");
        System.out.println(account.getAccountInfo());
    }
}

class SecurityDemo {
    public static void demonstrateEncapsulation() {
        BankAccount acc = new BankAccount("Alice", "SEC001", 5000);

        System.out.println("\n=== Why Private Matters ===");
        System.out.println("Without private, anyone could do:");
        System.out.println("// acc.balance = -1000000;  // Make balance negative!");
        System.out.println("// acc.accountNumber = \"\";  // Delete account number!");

        System.out.println("\nWith private, we control access:");
        acc.deposit(100);
        System.out.println("Controlled deposit successful!");
        System.out.println("Current balance: $" + acc.getBalance());
    }
}