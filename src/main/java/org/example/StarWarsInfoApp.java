package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import io.restassured.RestAssured;

import java.io.IOException;
import java.util.Scanner;

public class StarWarsInfoApp {


        public static String inputCategory() {
            Scanner category = new Scanner(System.in);
            System.out.print("Введите название категории: ");
            String cat = category.nextLine();
            return cat;
        }

        public static String inputName(){
            Scanner name = new Scanner(System.in);
            System.out.print("Введите запрос: ");
            String id = name.nextLine();
            return id;
        }


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
