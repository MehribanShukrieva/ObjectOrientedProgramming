import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter an integer value: ");
		try {
			int a=input.nextInt();
			
		}catch(InputMismatchException e){
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
