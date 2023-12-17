import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Account account = new Account("Derya", 10000);
		Account account2= new Account("Mary", 10000);
		System.out.println( "Name: " + account.getName() + "\nBalance: " + account.getBalance() );
		System.out.println( "Name: " + account2.getName() + "\nBalance: " + account2.getBalance() );
		account.setName("Derya Telli");
		account.setBalance(50000);
		System.out.println( "Name: " + account.getName() + "\nBalance: " + account.getBalance() );
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the amount of deposit for the first account: ");
		double deposit=input.nextDouble();
		account.depositA(deposit);
		System.out.println( "Name: " + account.getName() + "\nBalance: " + account.getBalance() );
	}
}
