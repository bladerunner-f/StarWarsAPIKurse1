package org.example;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

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
    public StarWarsStarshipsDTO() {
        // пустой конструктор
    }
    @JsonProperty("model")
    public String getModel() {
        return model;
    }
    @JsonProperty("model")
    public void setModel(String model) {
        this.model = model;
    }

    @JsonProperty("starship_class")
    public String getStarship_class() {
        return starship_class;
    }
    @JsonProperty("starship_class")
    public void setStarship_class(String starship_class){
        this.starship_class = starship_class;
    }

    @JsonProperty("manufacturer")
    public String getManufacturer() {
        return manufacturer;
    }
    @JsonProperty("manufacturer")
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @JsonProperty("crew")
    public String getCrew() {
        return crew;
    }
    @JsonProperty("crew")
    public void setCrew(String crew) {
        this.crew = crew;
    }

}

