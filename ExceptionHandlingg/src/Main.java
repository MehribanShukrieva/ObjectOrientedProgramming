
public class Main {

	public static void main(String[] args) {
		try {
			Time1 time = new Time1(10, 59, 41);
			System.out.println(time.printTime());
		}catch(Exception e) {
			System.out.println( e.getMessage());
		}
		finally {
			System.out.println("Done");
		}
		System.out.println("The end of the program!");
		
	}

}
