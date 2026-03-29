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
        if (mana >= 10) { // custo base de mana para ataque normal
            mana -= 10;
            int damage = attack + 10; // ataque mágico básico
            System.out.println(name + " attacks the enemy with " + magicType + " magic! Damage: " + damage + ". Mana left: " + mana);
        } else {
            System.out.println(name + " tries to attack with magic, but doesn't have enough mana!");
        }
    }

    @Override
    public void defense() {
        int magicDefense = defense + (mana / 5); // defesa aumentada pelo mana restante
        System.out.println(name + " defends with a magical barrier! Total defense: " + magicDefense);
    }

    public void castSpell(String spellName, int manaCost) {
        if (mana >= manaCost) {
            mana -= manaCost;
            int damage = attack + (manaCost * 2); // dano proporcional à mana gasta
            System.out.println(name + " casts " + spellName + " (" + magicType + ")! Damage: " + damage + ". Mana left: " + mana);
        } else {
            System.out.println(name + " tried to cast " + spellName + " but doesn't have enough mana!");
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