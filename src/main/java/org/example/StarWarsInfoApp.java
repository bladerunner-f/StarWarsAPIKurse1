package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import io.restassured.RestAssured;

import java.io.IOException;
import java.util.Scanner;

/**
 * Класс для получения информации о персонажах, планетах и звездолетах из звездных войн.
 */
public class StarWarsInfoApp {

        /**
         * Метод для ввода категории (персонаж, планета, звездолет)
         * @return введенную категорию
         */
        public static String inputCategory() {
            Scanner category = new Scanner(System.in);
            System.out.print("Введите название категории: ");
            String cat = category.nextLine();
            return cat;
        }

    /**
     * Метод для ввода запроса (название персонажа, планеты, звездолета)
     * @return введенный запрос
     */
        public static String inputName(){
            Scanner name = new Scanner(System.in);
            System.out.print("Введите запрос: ");
            String id = name.nextLine();
            return id;
        }

    /**
     * Метод для получения информации о категории и запросе
     * @param category категория (персонаж, планета, звездолет)
     * @param name запрос (название персонажа, планеты, звездолета)
     * @return информация о категории и запросе в виде объекта DTO
     */
        public static DTO Info(String category, String name){
            String url = "https://swapi.dev/api/" + category + "/" +  name + "/";
            switch (category) {
                case "people":
                    return SWPeople(url);
                case "planets":
                    return SWPlanet(url);
                case "starships":
                    return SWStarship(url);
            }
            return null;
        }


    /**
     * Метод для получения информации о персонаже из API
     * @param url URL для получения информации
     * @return информация о персонаже в виде объекта StarWarsCharacterDTO
     */
        public static StarWarsCharacterDTO SWPeople (String url){
            Response response = RestAssured.get(url);
            String jsonResponse = response.body().asString();
            ObjectMapper objectMapper = new ObjectMapper();
            StarWarsCharacterDTO characterDTO = new StarWarsCharacterDTO();
            try {
                characterDTO = objectMapper.readValue(jsonResponse, StarWarsCharacterDTO.class);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return characterDTO;
        }

    /**
     * Метод для получения информации о планете из API
     * @param url URL для получения информации
     * @return информация о планете в виде объекта StarWarsPlanetDTO
     */
        public static StarWarsPlanetDTO SWPlanet (String url){
            Response response = RestAssured.get(url);
            String jsonResponse = response.body().asString();
            ObjectMapper objectMapper = new ObjectMapper();
            StarWarsPlanetDTO planetDTO = new StarWarsPlanetDTO();
            try {
                planetDTO = objectMapper.readValue(jsonResponse, StarWarsPlanetDTO.class);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return planetDTO;
        }
    /**
     * Метод для получения информации о звездолете из API
     * @param url URL для получения информации
     * @return информация о звездолете в виде объекта StarWarsStarshipsDTO
     */
        public static StarWarsStarshipsDTO SWStarship (String url){
            Response response = RestAssured.get(url);
            String jsonResponse = response.body().asString();
            ObjectMapper objectMapper = new ObjectMapper();
            StarWarsStarshipsDTO starshipDTO = new StarWarsStarshipsDTO();
            try {
                starshipDTO = objectMapper.readValue(jsonResponse, StarWarsStarshipsDTO.class);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return starshipDTO;
        }

}
