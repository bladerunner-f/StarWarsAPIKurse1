package org.example;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data Transfer Object (DTO) для получения информации о планетах из вселенной Звёздных войн.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class StarWarsPlanetDTO extends DTO{
    @JsonProperty ("name")
    private String name;

    @JsonProperty ("diameter")
    private String diameter;

    @JsonProperty ("population")
    private String population;

    @JsonProperty ("gravity")
    private String gravity;

    @JsonProperty ("terrain")
    private String terrain;


    /**
     * Пустой конструктор, необходим для создания объекта класса
     */
    public StarWarsPlanetDTO() {
    }
    /**
     * Получает поле названия планеты.
     * @return Название планеты.
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    /**
     * Сеттер названия планеты.
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получает поле диаметра планеты.
     * @return Диаметр планеты.
     */
    @JsonProperty("diameter")
    public String getDiameter() {
        return diameter;
    }
    /**
     * Сеттер диаметра планеты.
     */
    @JsonProperty("diameter")
    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    /**
     * Получает поле населения планеты.
     * @return Население планеты.
     */
    @JsonProperty("population")
    public String getPopulation() {
        return population;
    }
    /**
     * Сеттер населения планеты.
     */
    @JsonProperty("population")
    public void setPopulation(String population) {
        this.population = population;
    }

    /**
     * Получает поле гравитации планеты.
     * @return Гравитация планеты.
     */
    @JsonProperty("gravity")
    public String getGravity() {
        return gravity;
    }
    /**
     * Сеттер гравитации планеты..
     */
    @JsonProperty("gravity")
    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    /**
     * Получает поле типа местности планеты.
     * @return Тип местности планеты.
     */
    @JsonProperty("terrain")
    public String getTerrain() {
        return terrain;
    }
    /**
     * Сеттер типа местности планеты.
     */
    @JsonProperty("terrain")
    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }
}

