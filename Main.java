package ru.mirea;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String>states = new ArrayList<String>();
        states.add("Земля");
        states.add("Марс");
        states.add("Юпитер");
        states.add("Сатурн");
        states.add(1, "Уран");

        System.out.println(states.get(1));
        states.set(1, "Плутон");

        System.out.printf("В списке %d элементов \n", states.size());
        for (String state: states){
            System.out.println(state);
        }

        if (states.contains("Земля")){
            System.out.println("Список содержит планету Земля");
        }

        states.remove("Земля");
        states.remove(0);

        Object[] countries = states.toArray();
        for (Object country : countries){
            System.out.println(country);
        }
    }
}
