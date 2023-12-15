package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {



        boolean a = true;

        Map<String, String> reqRes = new HashMap<String, String>();
        reqRes.put("Luke Skywalker", "1");
        reqRes.put("Luke", "1");
        reqRes.put("Люк", "1");
        reqRes.put("Darth Vader", "4");
        reqRes.put("Дарт Вейдер", "4");
        reqRes.put("R2-D2", "3");
        reqRes.put("Урна на колёсиках", "3");
        reqRes.put("Оби-Ван Кеноби", "10");
        reqRes.put("Оби-Ван", "10");
        reqRes.put("Obi-Wan Kenobi", "10");
        reqRes.put("Tatooine", "1");
        reqRes.put("DS-1 Orbital Battle Station", "9");
        reqRes.put("Звезда смерти", "9");
        reqRes.put("Death Star", "9");
        reqRes.put("Сокол Тысячелетия", "10");
        reqRes.put("Millennium Falcon", "10");

        do {
            System.out.println("\n\n          Консоль запросов к сервису Star Wars API");
            System.out.println("-------------------------------------------------------------------");
            System.out.println("1 - Вывести список доступных категорий");
            System.out.println("2 - Вывести список доступных запросов");
            System.out.println("3 - Выполнить запрос");
            System.out.println("4 - Выход");
            try {
                Scanner name = new Scanner(System.in);
                System.out.print(": ");
                String input = name.nextLine();


                switch (input){
                    case "1":
                        System.out.println("Список доступных категорий : " + "people, planets, vehicles, starships");
                        break;
                    case "2":
                        System.out.println("Список доступных запросов: " + reqRes.keySet());
                        break;
                    case "3":

                        String category = StarWarsInfoApp.inputCategory();
                        String i1 = StarWarsInfoApp.inputName();
                        if (!reqRes.containsKey(i1)) {
                            System.out.print("Неверный ввод");
                            break;
                        }
                        switch (category) {
                            case "planets":
                                StarWarsPlanetDTO planet = (StarWarsPlanetDTO) StarWarsInfoApp.Info(category, reqRes.get(i1));
                                System.out.println("Название: " + planet.getName());
                                break;
                            case "people":
                                StarWarsCharacterDTO hero = (StarWarsCharacterDTO) StarWarsInfoApp.Info(category, reqRes.get(i1));
                                System.out.println("Имя: " + hero.getName());
                                System.out.println("Рост: " + hero.getHeight());
                                System.out.println("Вес: " + hero.getMass());
                                break;
                            case "starships":
                                StarWarsStarshipsDTO starship = (StarWarsStarshipsDTO) StarWarsInfoApp.Info(category, reqRes.get(i1));
                                System.out.println("Модель: "+ starship.getModel());
                                System.out.println("Производитель: "+ starship.getManufacturer());
                                System.out.println("Класс корабля: " + starship.getStarship_class());
                                System.out.println("Кол-во экипажа: " + starship.getCrew());
                                break;
                        }
                        break;
                    case "4":
                        a = false;
                        break;
                }

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        while (a);
    }
}