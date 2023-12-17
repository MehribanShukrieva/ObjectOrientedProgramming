import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {

	public static void main(String[] args) {
		
		Worker[] workers = new Worker[3];
		
		for(int i=0; i<3; i++) {
		try {
			Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=scanner.nextLine();
		System.out.println("Enter your salary: ");
		
		int salary=scanner.nextInt();
		
		workers[i]=new Worker();
		
		if(workers[i].getSalary()<0) {
				throw new Exception ("salary amount must be greater than zero");
			}}catch(Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
		
	}

}
