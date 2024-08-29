package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        statistic(way1());
        statistic(way2());
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
        System.out.println("Процент побед " + count/10 + "%");
    }

    public  static HashMap<Integer,String> way1 () {
        Random rand = new Random();
        HashMap<Integer,String> map = new HashMap<>();
        int car;
        int choice;
        for (int i = 1; i <= 1000; i++) {
            car = rand.nextInt(3);
            choice = rand.nextInt(3);
            if (choice == car) {
                map.put(i,"Выиграл");
            } else {
                map.put(i,"Прогирал");
            }
        }
        return map;
    }

    public  static HashMap<Integer,String> way2 () {
        Random rand = new Random();
        HashMap<Integer,String> map = new HashMap<>();
        int car;
        int choice;
        for (int i = 1; i <= 1000; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(0);
            list.add(1);
            list.add(2);
            car = rand.nextInt(3);
            choice = rand.nextInt(3);
            for (int j = 0; true; j++) {
                if ( j != choice && j != car) {
                    list.remove(j);
                    break;
                }
            }

            for (Integer k: list) {
                if (k != choice) {
                    choice = k;
                    break;
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