package com.pboreg;

import java.util.HashMap;

class  Hero {

    String name;
    double defencePower;

    Hero(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    Hero(String name){
        this.name = name;
    }

    void display(){
        System.out.println("Name = " + this.name);
    }
}

public class Main {

    public static void main(String[] args) {
	Hero hero1 = new Hero("esmeralda");
	hero1.display();

	    HeroStrength hero2 = new HeroStrength("Ucup", 10);
	    hero2.display();

	    HeroStrength hero3 = new HeroStrength("otong");
	    hero3.display();
    }
}
