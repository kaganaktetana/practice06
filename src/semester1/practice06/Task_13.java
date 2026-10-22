package semester1.practice06;

public class Task_13 {
    public static void main(String[] args) {
        Player player = new Player();

        player.nickname = "Dragon";

        player.takeDamage(30);
        System.out.println("Здоров'я: " + player.health);

        player.heal(20);
        System.out.println("Здоров'я після лікування: " + player.health);

        player.takeDamage(100);
        System.out.println("Здоров'я: " + player.health);
    }
}

class Player {
    String nickname;
    int health = 100;

    public void takeDamage(int damage) {
        health -= damage;

        if (health < 0) {
            health = 0;
        }

        if (health == 0) {
            System.out.println(nickname + " загинув!");
        }
    }

    public void heal(int amount) {
        health += amount;

        if (health > 100) {
            health = 100;
        }
    }
}