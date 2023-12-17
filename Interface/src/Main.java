import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Please select your degree;\n" +
                "1-Bachelor\n" +
                "2-Masters\n" +
                "3-PhD");
        System.out.print("Your choice: ");
        int selectId=input.nextInt();
        System.out.print("Enter your school Number: ");
        int id=input.nextInt();
        System.out.print("Enter your midterm exam score: ");
        float mid=input.nextFloat();
        System.out.print("Enter your final exam score: ");
        float fin=input.nextFloat();
        switch (selectId){
            case 1:
                Student bachelor=new BachelorStudent(id,mid,fin);
                System.out.println("Score: "+bachelor.computeTotalScore());
                break;
            case 2:
                System.out.print("Enter your number of conf:");
                int confM=input.nextInt();
                Student masters=new MasterStudent(id,mid,fin,confM);
                System.out.println("Score: "+masters.computeTotalScore());
                break;
            case 3:
                System.out.print("Enter your number of conf:");
                int confP=input.nextInt();
                System.out.print("Enter your number of articles");
                int articleP=input.nextInt();
                Student phds=new PhDStudent(id,mid,fin,confP,articleP);
                System.out.println("Score: "+phds.computeTotalScore());
                break;
            default:
                System.out.println("Please enter valid value");
                break;
        }


    }


}

