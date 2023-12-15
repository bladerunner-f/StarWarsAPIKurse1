package org.example;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.example.StarWarsInfoApp;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StarWarsCharacterDTO extends DTO{
    @JsonProperty ("name")
    private String name;
    @JsonProperty ("height")
    private String height;
    @JsonProperty ("mass")
    private String mass;
    public StarWarsCharacterDTO() {
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

    @JsonProperty("height")
    public String getHeight() {
        return height;
    }
    @JsonProperty("height")
    public void setHeight() {
        this.height = height;
    }
    @JsonProperty("mass")
    public String getMass() {
        return mass;
    }

    @JsonProperty("mass")
    public void setMass() {
        this.mass = mass;
    }

}

