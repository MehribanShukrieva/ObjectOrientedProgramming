

public class Employee {
String name;
int socialSecurityNumber;
float Wage;
int workingHours;
Employee(String name, int socialSecurityNumber, float Wage, int workingHours){
	this.name=name;
	this.socialSecurityNumber=socialSecurityNumber;
	this.Wage=Wage;
	this.workingHours=workingHours;
}
void displayInfo() {
	System.out.println("name: "+ name + "Social security number: " + socialSecurityNumber);
}
void displaySalary() {
	System.out.println("Salary: " + Wage*workingHours);
}

	
}