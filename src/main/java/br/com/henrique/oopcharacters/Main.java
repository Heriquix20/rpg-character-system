package br.com.henrique.oopcharacters;

import br.com.henrique.oopcharacters.model.Character;
import br.com.henrique.oopcharacters.model.Warrior;
import br.com.henrique.oopcharacters.model.Mage;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1️ Instanciando as subclasses
        Warrior warrior = new Warrior("Henrique", 200, 30, 50, 100, "Espada", 25);
        Mage mage = new Mage("Weslley", 100, 60, 25, 100, 100, "Fogo");


        // 2️ Armazenando em uma coleção do tipo da superclasse
        List<Character> characters = new ArrayList<>();
        characters.add(warrior);
        characters.add(mage);


        // 3️ Chamando métodos sobrescritos
        System.out.println("=== Ataques ===");
        for (Character c : characters) {
            c.attack();
        }

        System.out.println("\n=== Defesas ===");
        for (Character c : characters) {
            c.defense();
        }


        // 4️ Chamando métodos exclusivos
        System.out.println("\n=== Ataque Especial do Cavaleiro ===");
        warrior.heavyStrike();

        System.out.println("\n=== Magia Especial do Mago ===");
        mage.castSpell("Fireball", 30);


        // 5 Demonstrando takeDamage e heal
        System.out.println("\n=== Testando dano e cura ===");
        warrior.takeDamage(80); // aplica dano considerando defesa
        mage.takeDamage(80);

        warrior.heal(20); // curando
        mage.heal(20);


        // 6️ Exibindo estado final dos personagens
        System.out.println("\n=== Estado Atual dos Personagens ===");
        for (Character c : characters) {
            System.out.println(c);
        }
    }
}