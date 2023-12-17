package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data Transfer Object (DTO) для получения информации о персонажах Звёздных войн.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class StarWarsCharacterDTO extends DTO{

    @JsonProperty ("name")
    private String name;
    @JsonProperty ("height")
    private String height;
    @JsonProperty ("mass")
    private String mass;

    @JsonProperty ("gender")
    private String gender;

    @JsonProperty ("birth_year")
    private String birth_year;

    /**
     * Пустой конструктор, необходим для создания объекта класса
     */
    public StarWarsCharacterDTO() {
    }
    /**
     * Получает поле имени персонажа.
     * @return Имя персонажа.
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    /**
     * Сеттер имени персонажа
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получает поле роста персонажа.
     * @return Рост персонажа.
     */
    @JsonProperty("height")
    public String getHeight() {
        return height;
    }
    /**
     * Сеттер роста персонажа
     */
    @JsonProperty("height")
    public void setHeight() {
        this.height = height;
    }
    /**
     * Получает поле массы персонажа.
     * @return Масса персонажа.
     */
    @JsonProperty("mass")
    public String getMass() {
        return mass;
    }

    /**
     * Сеттер массы персонажа
     */
    @JsonProperty("mass")
    public void setMass() {
        this.mass = mass;
    }

    /**
     * Получает поле гендера персонажа.
     * @return Гендер персонажа.
     */
    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    /**
     * Сеттер гендера персонажа
     */
    @JsonProperty("gender")
    public void setGender() {
        this.gender = gender;
    }

    /**
     * Получает поле года рождения персонажа.
     * @return Год рождения персонажа.
     */
    @JsonProperty("birth_year")
    public String getBirth_year() {
        return birth_year;
    }

    /**
     * Сеттер года рождения персонажа
     */
    @JsonProperty("birth_year")
    public void setBirth_year() {
        this.birth_year = birth_year;
    }

}

