import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Circle[] circles= new Circle[3];
		for(int i=0; i<3; i++) {
			Scanner input= new Scanner(System.in);
			System.out.println("Enter the radius of the circle: ");
			int r=input.nextInt();
			circles[i]=new Circle(r);
		}
		for(Circle circle: circles) {
			System.out.println("Area of the circle is: " + circle.computeArea());
		}
	}
}
