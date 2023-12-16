package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {

        logger.info("Starting program...");

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
        reqRes.put("Dagobah", "5");
        reqRes.put("дагоба", "5");
        reqRes.put("Дагоба", "5");
        reqRes.put("Bespin", "6");
        reqRes.put("Беспин", "6");
        reqRes.put("беспин", "6");
        reqRes.put("Звезда смерти", "9");
        reqRes.put("Death Star", "9");

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
                        System.out.println("Список доступных категорий : " + "people, planets, starships");
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
                                System.out.println("Численность населения: " + planet.getPopulation());
                                System.out.println("Гравитация (g): " + planet.getGravity());
                                System.out.println("Местность: " + planet.getTerrain());
                                System.out.println("Диаметр: " + planet.getDiameter());
                                break;
                            case "people":
                                StarWarsCharacterDTO hero = (StarWarsCharacterDTO) StarWarsInfoApp.Info(category, reqRes.get(i1));
                                System.out.println("Имя: " + hero.getName());
                                System.out.println("Рост: " + hero.getHeight());
                                System.out.println("Вес: " + hero.getMass());
                                System.out.println("Пол: " + hero.getGender());
                                System.out.println("Год рождения: " + hero.getBirth_year());
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