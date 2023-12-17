import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);	
		System.out.println("Please enter your name:");
		String name = input.nextLine();
		System.out.println("Please enter your social security number: ");
		int socialSecurityNumber = input.nextInt();
		System.out.println("Please enter your wage: ");
		float Wage = input.nextFloat();
		System.out.println("Please enter your working hours: ");
		int workingHours=input.nextInt();
		Employee employee = new Employee("name", socialSecurityNumber, Wage, workingHours );;
		employee.displayInfo();
		employee.displaySalary();
}
}
