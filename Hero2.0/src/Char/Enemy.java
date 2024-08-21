package Char;

import Interfaces.Mortal;

public abstract class Enemy extends Unit  {

    private String name;

    public Enemy (int health, String name){
        super(health);
        this.name=name;
    }

    public String getName() {
        return name;
    }

}
