package org.example;


import org.example.Humans.Family;
import org.example.Humans.Man;
import org.example.Humans.Woman;
import org.example.Pets.Dog;

public class Main {
    public static void main(String[] args) {
        Dog sharik = new Dog("Sharik");
        Man man = new Man("Yaroslav" , "Kravech" , 19 );
        Woman woman = new Woman("Olya" , "Kravech" , 19);
        Family family = new Family(woman , man);
        System.out.println(family.toString());
    }


}