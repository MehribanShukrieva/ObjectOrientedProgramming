import java.util.Scanner;

public class Game {
    Player player;
    Location location;
    Scanner scan = new Scanner(System.in);
    public void login(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Adventure Game!");
        System.out.println("Enter your name before starting the game: ");
        String playerName = scan.nextLine();
        player=new Player(playerName);
        player.selectCha();
        start();
        }
        public void start(){
            while(true){
                System.out.println();
                System.out.println("/--/--/--/--/--/--/--/--/--/--/--/--/--/--/--/--/--/--/--/--/--/--/");
                System.out.println("Please choose your game arena!  ");
                System.out.println("1: Safe house --> It is your private place. There are no enemies.");
                System.out.println("2: Cave --> You may come across zombies.");
                System.out.println("3: Forest --> You may come across vampires.");
                System.out.println("4: River --> You may come across bears.");
                System.out.println("5: Store --> Buy weapon and armor.");
                int selectLoc =scan.nextInt();
                while (selectLoc<0 || selectLoc>5){
                    System.out.println("Please enter a valid Location number!");
                    selectLoc=scan.nextInt();
                }
                switch (selectLoc){
                    case 1:
                        location = new SafeHouse(player);
                        break;
                    case 2:
                        location = new Cave(player);
                        break;
                    case 3:
                        location = new Forest(player);
                        break;
                    case 4:
                        location = new River(player);
                        break;
                    case 5:
                        location = new ToolStore(player);
                        break;
                    default:
                        location = new SafeHouse(player);
                }
                if(location.getClass().getName().equals("Safehouse")){
                    if((player.getInv().isFirewood()) && (player.getInv().isFood()) && (player.getInv().isWater())){
                        System.out.println("Congratulations! You won the game! ");
                        break;
                    }
                }
                if(!location.getLocation()){
                    System.out.println("Game is over.");
                    break;
                }
            }
        }
}