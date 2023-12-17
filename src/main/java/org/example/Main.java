package org.example;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * The Main class for querying the Star Wars API.
 */
public class Main {
    //private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {

        //logger.info("Starting program...");

        boolean running = true;

        Map<String, String> reqRes = new HashMap<String, String>();
        reqRes.put("Luke Skywalker", "1");
        reqRes.put("Luke", "1");
        //reqRes.put("Люк", "1");
        reqRes.put("Darth Vader", "4");
        //reqRes.put("Дарт Вейдер", "4");
        reqRes.put("R2-D2", "3");
        //reqRes.put("Урна на колёсиках", "3");
        //reqRes.put("Оби-Ван Кеноби", "10");
        //reqRes.put("Оби-Ван", "10");
        reqRes.put("Obi-Wan Kenobi", "10");
        reqRes.put("Dagobah", "5");
        //reqRes.put("дагоба", "5");
        //reqRes.put("Дагоба", "5");
        reqRes.put("Bespin", "6");
        //reqRes.put("Беспин", "6");
        //reqRes.put("беспин", "6");
        //reqRes.put("Звезда смерти", "9");
        reqRes.put("Death Star", "9");

        do {
            System.out.println("\n\n          Star Wars API Query Console");
            System.out.println("-------------------------------------------------------------------");
            System.out.println("1 - Show available categories");
            System.out.println("2 - Show available queries");
            System.out.println("3 - Perform a query");
            System.out.println("4 - Exit");
            try {
                Scanner name = new Scanner(System.in);
                System.out.print(": ");
                String input = name.nextLine();


                switch (input){
                    case "1":
                        System.out.println("Available categories: " + "people, planets, starships");
                        break;
                    case "2":
                        System.out.println("Available queries: " + reqRes.keySet());
                        break;
                    case "3":

                        String category = StarWarsInfoApp.inputCategory();
                        String i1 = StarWarsInfoApp.inputName();
                        if (!reqRes.containsKey(i1)) {
                            System.out.print("Invalid input");
                            break;
                        }
                        switch (category) {
                            case "planets":
                                StarWarsPlanetDTO planet = (StarWarsPlanetDTO) StarWarsInfoApp.Info(category, reqRes.get(i1));
                                System.out.println("Name: " + planet.getName());
                                System.out.println("Population: " + planet.getPopulation());
                                System.out.println("Gravity (g): " + planet.getGravity());
                                System.out.println("Terrain: " + planet.getTerrain());
                                System.out.println("Diameter: " + planet.getDiameter());
                                break;
                            case "people":
                                StarWarsCharacterDTO hero = (StarWarsCharacterDTO) StarWarsInfoApp.Info(category, reqRes.get(i1));
                                System.out.println("Name: " + hero.getName());
                                System.out.println("Height: " + hero.getHeight());
                                System.out.println("Mass: " + hero.getMass());
                                System.out.println("Gender: " + hero.getGender());
                                System.out.println("Birth year: " + hero.getBirth_year());
                                break;
                            case "starships":
                                StarWarsStarshipsDTO starship = (StarWarsStarshipsDTO) StarWarsInfoApp.Info(category, reqRes.get(i1));
                                System.out.println("Model: "+ starship.getModel());
                                System.out.println("Manufacturer: "+ starship.getManufacturer());
                                System.out.println("Starship class: " + starship.getStarship_class());
                                System.out.println("Crew: " + starship.getCrew());
                                break;
                        }
                        break;
                    case "4":
                        running = false;
                        break;
                }

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        while (running);
    }
}