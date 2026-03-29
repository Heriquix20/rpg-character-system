package br.com.henrique.oopcharacters.model;

public class Mage extends Character {

    private int mana;
    private String magicType;


    // Construtor
    public Mage(String name, int health, int attack, int defense, int level, int mana, String magicType) {
        super(name, health, attack, defense, level);
        this.mana = mana;
        this.magicType = magicType;
    }



    // toString
    @Override
    public String toString() {
        return "Mage{" +
                "level=" + level +
                ", defense=" + defense +
                ", attack=" + attack +
                ", health=" + health +
                ", name='" + name + '\'' +
                ", mana=" + mana +
                ", magicType='" + magicType + '\'' +
                '}';
    }



    // Métodos sobrescritos
    @Override
    public void attack() {
        if (mana >= 10) {
            mana -= 10;
            int damage = attack + 10;
            System.out.println(name + " ataca o inimigo com magia de " + magicType + damage + ". Mana restante: " + mana);
        } else {
            System.out.println(name + " tenta atacar com magia mas não tem mana suficiente!");
        }
    }

    @Override
    public void defense() {
        int magicDefense = defense + (mana / 5);
        System.out.println(name + " defende com barreira mágica! Defesa Total: " + magicDefense);
    }

    public void castSpell(String spellName, int manaCost) {
        if (mana >= manaCost) {
            mana -= manaCost;
            int damage = attack + (manaCost * 2);
            System.out.println(name + " lança " + spellName + " (" + magicType + ")! Dano: " + damage + ". Mana restante: " + mana);
        } else {
            System.out.println(name + " tentou lançar " + spellName + " mas não tem mana suficiente!");
        }
    }


    // Gets e Sets
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getMagicType() {
        return magicType;
    }

    public void setMagicType(String magicType) {
        this.magicType = magicType;
    }
}