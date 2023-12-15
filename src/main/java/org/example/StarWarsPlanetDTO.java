package org.example;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

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


    public StarWarsPlanetDTO() {
        // пустой конструктор
    }
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("diameter")
    public String getDiameter() {
        return diameter;
    }
    @JsonProperty("diameter")
    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    @JsonProperty("population")
    public String getPopulation() {
        return population;
    }
    @JsonProperty("population")
    public void setPopulation(String population) {
        this.population = population;
    }

    @JsonProperty("gravity")
    public String getGravity() {
        return gravity;
    }
    @JsonProperty("gravity")
    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    @JsonProperty("terrain")
    public String getTerrain() {
        return terrain;
    }
    @JsonProperty("terrain")
    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }
}

