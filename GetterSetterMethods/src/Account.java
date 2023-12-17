public class Account {
private String name;
private double balance;

Account(String name, double balance){
this.name=name;
this.balance=balance;
}
public double deposit;
public void depositA(double deposit) {
	balance = balance+deposit;
}
public double getBalance() {
	return balance;
}
public double setBalance(double balance) {
	return this.balance=balance;
}
public String setName(String name) {
	return this.name=name;
}
public String getName() {
	return name;
	}
}