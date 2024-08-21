package Battle;

import Char.Enemy;
import Char.Hero;
import Hero.Archer;
import Hero.War;
import Hero.Mage;
import Enemy.Dog;
import Enemy.Zombi;

import java.util.*;

public class TestBattle {
    public static void main(String[] args) {
        Random random = new Random();
        int cho = random.nextInt(1,3);
        System.out.println("Добро пожаловать в игру 'Подземелье и драконы'! Выбери игрока: 1 - War, 2 - Mage, 3 - Archer");
        Scanner scanner = new Scanner(System.in);
        Enemy enemy = new Dog(60, "Чарли");
        Enemy enemy2 = new Zombi(60, "Зуза");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                War war = new War(55, "Борис");
                System.out.println("Вы выбрали игрока : Борис, у него 55 Хп и урон от 10 до 20");
                if (cho == 1) {
                    battle(war, enemy);
                }else {
                    battle(war, enemy2);
                }
                break;
            case 2:
                Mage mage = new Mage(47, "ОЗЗ");
                System.out.println("Вы выбрали игрока : ОЗЗ, у него 47 Хп и урон от 14 до 16");
                if (cho == 1) {
                    battle(mage, enemy);
                }else {
                    battle(mage, enemy2);
                }
                break;
            case 3:
                Archer archer = new Archer(50, "Робин Гуд");
                System.out.println("Вы выбрали игрока : Робин Гуд, у него 50 Хп и урон от 15 до 18");
                if (cho == 1) {
                    battle(archer, enemy);
                }else {
                    battle(archer, enemy2);
                }
                break;
        }

    }

    public static void battle(Hero hero, Enemy enemy) {

        Random random = new Random();
        int turn = random.nextInt(1, 3);
        ; // 1 - герои, 2 - враги

        while (hero.isAlive() && enemy.isAlive()) {
            int attackBoost = 0;

            if (turn == 1) {
                if (hero instanceof Archer) {
                    attackBoost = random.nextInt(15, 19);
                }
                if (hero instanceof War) {
                    attackBoost = random.nextInt(10, 21);
                }
                if (hero instanceof Mage) {
                    attackBoost = random.nextInt(14, 17);
                }
                hero.attack(attackBoost, enemy);
                if (enemy.getHealth() <= 0) {
                    enemy.setHealth(0) ;
                }
                if (hero.getHealth() <= 0) {
                    hero.setHealth(0) ;
                }
                System.out.println("Ваш герой нанес " + attackBoost + " урона" + " у врага остало хп - " + enemy.getHealth());

                if (enemy.isAlive()) {
                    if (enemy instanceof Dog) {
                        attackBoost = random.nextInt(5, 10);
                    }
                    enemy.attack(attackBoost, hero);
                    if (enemy instanceof Zombi) {
                        attackBoost = random.nextInt(5, 10);
                    }
                    enemy.attack(attackBoost, hero);
                    if (enemy.getHealth() <= 0) {
                        enemy.setHealth(0) ;
                    }
                    if (hero.getHealth() <= 0) {
                        hero.setHealth(0) ;
                    }
                    System.out.println("Противник нанес " + attackBoost + " урона" + " у вас остало хп - " + hero.getHealth());
                } else {
                    if (enemy instanceof Dog) {
                        attackBoost = random.nextInt(5, 10);
                    }
                    enemy.attack(attackBoost, hero);
                    if (enemy instanceof Zombi) {
                        attackBoost = random.nextInt(5, 10);
                    }
                    enemy.attack(attackBoost, hero);
                    if (enemy.getHealth() <= 0) {
                        enemy.setHealth(0) ;
                    }
                    if (hero.getHealth() <= 0) {
                        hero.setHealth(0) ;
                    }
                    System.out.println("Противник нанес " + attackBoost + " урона" + " у вас остало хп - " + hero.getHealth());
                    if (hero instanceof Archer) {
                        attackBoost = random.nextInt(15, 19);
                    }
                    if (hero instanceof War) {
                        attackBoost = random.nextInt(10, 21);
                    }
                    if (hero instanceof Mage) {
                        attackBoost = random.nextInt(14, 17);
                    }
                    hero.attack(attackBoost, enemy);
                    if (enemy.getHealth() <= 0) {
                        enemy.setHealth(0) ;
                    }
                    if (hero.getHealth() <= 0) {
                        hero.setHealth(0) ;
                    }
                    System.out.println("Ваш герой нанес " + attackBoost + " урона" + " у врага остало хп - " + enemy.getHealth());
                }
            }

        }
        if (hero.isAlive()) {
            System.out.println(hero.getName() + " победил!");
        } else {
            System.out.println(enemy.getName() + " победил!");
        }
    }
}


