package Char;

import Interfaces.Mortal;

public abstract class Hero extends Unit  {
    private String name;

    public Hero (int health, String name){
        super(health);
        this.name=name;
    }

    public String getName() {
        return name;
    }

}
