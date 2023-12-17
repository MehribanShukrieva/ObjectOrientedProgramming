import java.util.Scanner;
public class Player {
    private int damage, health, money, rHealth;
    private String name, cName;
    Inventory inv;
    Scanner scan = new Scanner(System.in);
    public Player(String name) {
        this.name = name;
        this.inv=new Inventory();
    }
    public int  chaMenu() {
        System.out.println("Select your character: ");
        System.out.println("1: Samurai\t damage: 5\t health: 21\t money: 15");
        System.out.println("2: Archer\t damage: 7\t health: 18\t money: 20");
        System.out.println("3: Knight\t damage: 8\t health: 24\t money: 5");
        System.out.println("Which one do you choose?\t ");
        int chaId = scan.nextInt();

        while (chaId < 1 || chaId > 3) {
            System.out.println("Please enter a valid character number!");
            chaId = scan.nextInt();
        }
        System.out.println("Your choice is: " + chaId);
        return chaId;
    }
    public void selectCha() {
        switch(chaMenu()) {
            case 1: //Samurai
                initPlayer("Samurai", 5, 21, 15);
                break;
            case 2: //Archer
                initPlayer("Archer", 7, 18, 20);
                break;
            case 3: //Knight
                initPlayer("Knight", 8, 24, 5);
                break;
            default:
                initPlayer("Samurai", 5, 21, 15);
                break;
        }
        System.out.println("Your character is: " + getcName()+"\tDamage: " + getDamage()+ "\tHealth: " + getHealth() + "\tMoney: " + getMoney());
    }
    public void initPlayer(String cName, int damage, int health, int money ){
        setcName(cName);
        setDamage(damage);
        setHealth(health);
        setMoney(money);
        setrHealth(health);
    }
    public int getTotalDamage(){
        return this.getDamage()+this.getInv().getDamage();
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public int getHealth() {
        return health;
    }
    public String getcName() {
        return cName;
    }
    public void setcName(String cName) {
        this.cName = cName;
    }
    public Inventory getInv() {
        return inv;
    }

    public int getrHealth() {
        return rHealth;
    }

    public void setrHealth(int rHealth) {
        this.rHealth = rHealth;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHealth(int health) {
        this.health = health;
    }
}
