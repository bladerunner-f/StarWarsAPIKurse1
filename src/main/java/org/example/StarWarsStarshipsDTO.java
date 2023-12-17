package org.example;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Data Transfer Object (DTO) для получения информации о звездолётах из вселенной Звёздных войн.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class StarWarsStarshipsDTO extends DTO{
    @JsonProperty ("model")
    private String model;
    @JsonProperty ("starship_class")
    private String starship_class;

    @JsonProperty ("manufacturer")
    private String manufacturer;

    @JsonProperty ("crew")
    private String crew;
    /**
     * Пустой конструктор, необходим для создания объекта класса
     */
    public StarWarsStarshipsDTO() {
    }
    /**
     * Получает поле модели звездолёта.
     * @return Модель звездолёта.
     */
    @JsonProperty("model")
    public String getModel() {
        return model;
    }
    /**
     * Сеттер модели звездолёта.
     */
    @JsonProperty("model")
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Получает поле класса звездолёта.
     * @return Класс звездолёта.
     */
    @JsonProperty("starship_class")
    public String getStarship_class() {
        return starship_class;
    }
    /**
     * Сеттер класса звездолёта.
     */
    @JsonProperty("starship_class")
    public void setStarship_class(String starship_class){
        this.starship_class = starship_class;
    }

    /**
     * Получает поле производителя звездолёта.
     * @return Производитель звездолёта.
     */
    @JsonProperty("manufacturer")
    public String getManufacturer() {
        return manufacturer;
    }
    /**
     * Сеттер производителя звездолёта.
     */
    @JsonProperty("manufacturer")
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Получает поле количества экипажа звездолёта.
     * @return Количество экипажа на борту звездолёта.
     */
    @JsonProperty("crew")
    public String getCrew() {
        return crew;
    }
    /**
     * Сеттер количества экипажа звездолёта.
     */
    @JsonProperty("crew")
    public void setCrew(String crew) {
        this.crew = crew;
    }

}

