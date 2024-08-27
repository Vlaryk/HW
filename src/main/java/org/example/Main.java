package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        HashMap<Integer,String> map = new HashMap<>();
        map = coose(rand,map);
        statistic(map);
    }

    public static void statistic (HashMap<Integer,String> map) {
        int count = 0;
        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.printf("Шаг: %s %s\n",entry.getKey(),entry.getValue());
            if (entry.getValue().equals("Выиграл")) {
                count++;
            }
        }
        System.out.printf("Итого выиграл %s из %s\n",count,map.size());
    }

    public  static HashMap<Integer,String> coose (Random rand,HashMap<Integer,String> map) {
        int car;
        int choice;
        for (int i = 1; i < 101; i++) {
            car = rand.nextInt(1,4);
            choice = rand.nextInt(1,4);
            if (choice == car) {
                map.put(i,"Выиграл");
            } else {
                map.put(i,"Прогирал");
            }
        }
        return map;
    }

    public  static HashMap<Integer,String> coose1 (Random rand,HashMap<Integer,String> map) {
        int [] arr = {1,2,3};
        int car;
        int choice;
        int f;
        for (int i = 1; i < 101; i++) {
            car = rand.nextInt(1,4);
            choice = rand.nextInt(1,4);
            for (int el: arr) {
                if (el != car && el != choice) {

                }
            }

            if (choice == car) {
                map.put(i,"Выиграл");
            } else {
                map.put(i,"Прогирал");
            }
        }
        return map;
    }
}