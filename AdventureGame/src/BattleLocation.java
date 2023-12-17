import java.util.Scanner;

public abstract class BattleLocation extends Location {
    Scanner scan= new Scanner(System.in);
    protected Obstacle obstacle;
    protected String award;
    BattleLocation(Player player, String name, Obstacle obstacle, String award){
        super(player);
        this.name=name;
        this.obstacle=obstacle;
        this.award=award;
    }
    public boolean getLocation() {
        int obsCount = obstacle.obsCount();
        System.out.println("Now you are in " + this.getName());
        System.out.println("Warning! " + obsCount +" " + obstacle.getName() + " around!");
        System.out.println("Press <F> to fight or <R> to run");
        String selCase = scan.next();
        selCase = selCase.toUpperCase();
        if (selCase.equals("F")) {
            if (Combat(obsCount)) {
                System.out.println("You killed all the enemies in the " + this.getName() + "!");
                if (this.award.equals("Food") && player.getInv().isFood() == false) {
                    System.out.println("You won " + this.award);
                    player.getInv().setFood(true);
                } else if (this.award.equals("Water") && player.getInv().isWater() == false) {
                    System.out.println("You won " + this.award);
                    player.getInv().setWater(true);
                } else if (this.award.equals("Firewood") && player.getInv().isFirewood() == false) {
                    System.out.println("You won " + this.award);
                    player.getInv().setFirewood(true);
                }
                    return true;
                }
                if(player.getHealth() <= 0) {
                    System.out.println("You have died!");
                    return false;
                }
            }
            return true;
    }
        public boolean Combat ( int obsCount){
            int defObsHealth = obstacle.getHealth();
            for (int i = 0; i < obsCount; i++) {
                playerStats();
                enemyStats();
                while (player.getHealth() > 0 && obstacle.getHealth() > 0) {
                    System.out.println("Press <H> to hit or <R> to run ");
                    String selase = scan.next();
                    selase = selase.toUpperCase();
                    if (selase.equals("H")) {
                        System.out.println("You hit!");
                        obstacle.setHealth(obstacle.getHealth() - player.getTotalDamage());
                        afterHit();
                        if (obstacle.getHealth() > 0) {
                            System.out.println();
                            System.out.println("Enemy hit you!");
                            player.setHealth(player.getHealth() - (obstacle.getDamage() - player.getInv().getArmor()));
                            afterHit();
                        }
                    } else {
                        return false;
                    }
                }
                if (obstacle.getHealth() < player.getHealth() ) {
                    System.out.println("You killed all the enemies!");
                    player.setMoney(player.getMoney() + obstacle.getAward());
                    System.out.println("Current amount of money: " + player.getMoney());
                    obstacle.setHealth(defObsHealth);
                } else {
                    return false;
                }
                System.out.println(("------------------------------"));
            }
            return true;
        }

        public void afterHit () {
            System.out.println("Player's remained life: " + player.getHealth());
            System.out.println("Enemy's remained life: " + obstacle.getHealth());
        }

        public void enemyStats () {
            System.out.println("---------------------------------------------------\n" + obstacle.getName() + " information\n");
            System.out.println("Life: " + obstacle.getHealth());
            System.out.println("Damage: " + obstacle.getDamage());
            System.out.println("Award: " + obstacle.getAward());
        }

        public void playerStats () {
            System.out.println("---------------------------------------------------\nPlayer information:\n");
            System.out.println("Life: " + player.getHealth());
            System.out.println("Damage: " + player.getTotalDamage());
            System.out.println("Money: " + player.getMoney());
            if (player.getInv().getDamage() > 0) {
                System.out.println("Weapon: " + player.getInv().getwName());
            }
            if (player.getInv().getArmor() > 0) {
                System.out.println("Armor: " + player.getInv().getaName());
            }
        }
    }

