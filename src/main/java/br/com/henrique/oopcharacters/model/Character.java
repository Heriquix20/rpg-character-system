package br.com.henrique.oopcharacters.model;

public abstract class Character {

    protected String name;
    protected int health;
    protected int attack;
    protected int defense;
    protected int level;


    // Construtor
    public Character(String name, int health, int attack, int defense, int level) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.level = level;
    }

    // ToString
    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                ", defense=" + defense +
                ", level=" + level +
                '}';
    }

    // Métodos Principais (Ataque, Defesa, Dar dano e Curar)
    public void attack() {
        System.out.println(name + " attacks!");
    }
    public void defense() {
        System.out.println(name + " defenses!");
    }
    public void takeDamage(int damage) {
        int finalDamage = damage - defense;

        if (finalDamage < 0) {
            finalDamage = 0;
        }
        health -= finalDamage;
        System.out.println(name + " took " + finalDamage + " damage!");
    }
    public void heal(int amount) {
        health += amount;
        System.out.println(name + " healed " + amount + " HP!");
    }

    // Gets e Sets
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public int getDefense() {
        return defense;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}