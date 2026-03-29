package br.com.henrique.oopcharacters.model;


public class Warrior extends Character {

    private String weapon;
    private int armor;


    // Construtor
    public Warrior(String name, int health, int attack, int defense, int level, String weapon, int armor) {
        super(name, health, attack, defense, level);
        this.weapon = weapon;
        this.armor = armor;
    }



    // to String
    @Override
    public String toString() {
        return "Cavaleiro - " + "Nome: " + name +
                " - Level: " + level +
                " - Defesa: " + defense +
                " - Ataque: " + attack +
                " - Vida: " + health +
                " - Armadura: " + armor +
                " - Armamento: " + weapon;
    }



    // Métodos
    public void heavyStrike() {
        int damage = attack * 2;
        int totalDefense = defense + armor;
        System.out.println(name + " realiza um Heavy Strike com " + weapon + "! Dano: " + damage + ". Defesa atual: " + totalDefense);
    }

    @Override
    public void attack() {
        int damage = attack; // ataque normal simples
        int totalDefense = defense + armor;
        System.out.println(name + " ataca o adversário com " + weapon + "! Dano: " + damage + ". Defesa atual: " + totalDefense);
    }

    @Override
    public void defense() {
        int totalDefense = defense + armor;
        System.out.println(name + " defende com armadura! Defesa Total: " + totalDefense);
    }



    // Gets e Sets
    public String getWeapon() {
        return weapon;
    }
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    public int getArmor() {
        return armor;
    }
    public void setArmor(int armor) {
        this.armor = armor;
    }
}