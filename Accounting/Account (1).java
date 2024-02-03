public class Account {
    private double balance;
    private String ownerName;

    public Account(String name, double balance) {
        this.ownerName = name;
        this.balance = balance;
    }

    public void add(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid amount for adding .");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid amount for withdrawal or insufficient balance.");
        }
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

        myAccount.add(500.0);
        myAccount.withdraw(200.0);

        System.out.println("Updated balance: " + myAccount.getBalance());

        myAccount.setOwnerName("Ironman");
        System.out.println("New owner: " + myAccount.getOwnerName());
    }
}
