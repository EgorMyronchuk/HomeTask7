package org.example.Humans;

import java.util.Map;

public final class Man extends Human{

    public Man(String name, String surname, int year) {
        super(name , surname , year);
    }

    public Man(String name, String surname, int year, int iq) {
        super(name , surname , year , iq);
    }

    public Man(String name, String surname, int year, int iq, Map<String,String> schedule) {
        super(name , surname , year , iq , schedule);
    }
    @Override
    public void greetPet() {
        System.out.printf("О привіт друже , як в тебе справи  %s \n", getFamily().getPet().getNickname());
    }
    public void repairCar (){
        System.out.println("Мені потрібно полагодити автомобіль");
    }
}
