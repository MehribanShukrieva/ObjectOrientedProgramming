import java.util.Scanner;

public class Account {
    private double balance;
    private String ownerName;
    private final int PASSWORD = 2401;
    private int remainingAttempts = 3;

    public Account(String name, double balance) {
        this.ownerName = name;
        this.balance = balance;
    }

    public void add(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid amount for adding funds.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount for withdrawal.");
            return;
        }

        Scanner scanner = new Scanner(System.in);

        while (remainingAttempts > 0) {
            System.out.print("Please enter the 4-digit pass: ");
            int enteredPassword = scanner.nextInt();

            if (enteredPassword == PASSWORD) {
                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("Withdrawal successful. Updated balance: " + balance);
                    return;
                } else {
                    System.out.println("Insufficient balance for withdrawal.");
                    return;
                }
            } else {
                remainingAttempts--;
                if (remainingAttempts > 0) {
                    System.out.println("Wrong password. " + remainingAttempts + " attempts remaining.");
                } else {
                    System.out.println("Your account has been blocked. Please try again later.");
                }
            }
        }
        scanner.close();
    }

    public double getBalance() {
        return balance;
    }

    public void setOwnerName(String name) {
        ownerName = name;
    }

   
    public String getOwnerName() {
        return ownerName;
    }

    public static void main(String[] args) {
        Account myAccount = new Account("Tony Stark", 1000.0);

        System.out.println("Account owner: " + myAccount.getOwnerName());
        System.out.println("Initial balance: " + myAccount.getBalance());

        myAccount.withdraw(500);

        System.out.println("Updated balance: " + myAccount.getBalance());
    }
}
