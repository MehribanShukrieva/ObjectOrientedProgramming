import java.util.Scanner;

public class ToolStore extends NormalLocation{
    Scanner scan= new Scanner(System.in);
    ToolStore(Player player) {
        super(player, "Store");
    }

    public boolean getLocation() {
        System.out.println("Money: " + player.getMoney() );
        System.out.println("1: Weapons.");
        System.out.println("2: Armors.");
        System.out.println("3: Back.");
        System.out.println("Your choice is:");
        int selTool=scan.nextInt();
        int selItemID;
        switch (selTool){
            case 1:
                selItemID=weaponMenu();
                buyWeapon(selItemID);
                break;
            case 2:
                selItemID=armorMenu();
                buyArmor(selItemID);
                break;
            default:
                break;
        }
        return true;
    }
    public int armorMenu(){
        System.out.println("1: Light\t Damage: 1\t Money: 15");
        System.out.println("2: Medium\t Damage: 3\t Money: 25 ");
        System.out.println("3: Heavy\t Damage: 5\t Money: 40");
        System.out.println("4: Back");
        System.out.println("Choose your armor.");
        int selArmorID = scan.nextInt();
        return selArmorID;
    }
    public int weaponMenu(){
        System.out.println("1: Revolver\t Damage: 2\t Money: 5");
        System.out.println("2: Sword\t Damage: 3\t Money: 10 ");
        System.out.println("3: Rifle\t Damage: 7\t Money: 15");
        System.out.println("4: Back");
        System.out.println("Choose your weapon.");
        int selWeaponID = scan.nextInt();
        return selWeaponID;
    }
    public void buyArmor(int itemID){
        int avoid=0, price=0;
        String aName=null;
        switch (itemID){
            case 1:
                avoid=1;
                price=15;
                aName="Light armor";
                break;
            case 2:
                avoid=3;
                price=25;
                aName="Medium armor";
                break;
            case 3:
                avoid=5;
                price=40;
                aName="Heavy armor";
                break;
            case 4:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
        if ( player.getMoney() >= price ) {
            player.getInv().setArmor(avoid);
            player.getInv().setaName(aName);
            player.setMoney(player.getMoney()-price);
            System.out.println("You bought " + aName + " Damage blocked: " + player.getInv().getArmor()+ " New damage: "+  player.getTotalDamage() );
            System.out.println("Money left: " + player.getMoney());
        }else {
            System.out.println("Not enough amount of money");
        }
    }
    public void buyWeapon(int itemID){
        int damage=0, price=0;
        String wName=null;
            switch (itemID){
                case 1:
                    damage=2;
                    price=5;
                    wName="Revolver";
                    break;
                case 2:
                    damage=3;
                    price=10;
                    wName="Sword";
                    break;
                case 3:
                    damage=7;
                    price=15;
                    wName="Rifle";
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid operation");
                    break;
        }

        if ( player.getMoney() >= price ) {
            player.getInv().setDamage(damage);
            player.getInv().setwName(wName);
            player.setMoney(player.getMoney()-price);
            System.out.println("You bought " + wName + " Previous damage: " + player.getDamage()+ " New damage: "+  player.getTotalDamage() );
            System.out.println("Money left: " + player.getMoney());
        }else {
            System.out.println("Not enough amount of money");
        }


    }
}
