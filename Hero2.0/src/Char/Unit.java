package Char;

import Interfaces.Mortal;

public class Unit implements Mortal {
    private int health;

    public Unit(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isAlive(){
        return health>0;
    }
    public void takeDamage(int damage){
        health-=damage;
        if (health < 0) {
            health = 0;
        }
        System.out.println("Как написать какой герой получил урон?"+" получил "+damage+". Осталось "+health+" здоровья");
    }
    public void attack (int attackBoost, Unit opponent) {
        opponent.setHealth(opponent.getHealth()- attackBoost);
//        System.out.println(name + " атакует " + opponent.name + " и наносит " + takeDamage + " урона.");
//        System.out.println(opponent.name + " осталось " + opponent.health + " здоровья.");
    }
}
