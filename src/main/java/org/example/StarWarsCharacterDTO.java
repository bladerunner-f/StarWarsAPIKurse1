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

    @JsonProperty ("gender")
    private String gender;

    @JsonProperty ("birth_year")
    private String birth_year;
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

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender() {
        this.gender = gender;
    }

    @JsonProperty("birth_year")
    public String getBirth_year() {
        return birth_year;
    }

    @JsonProperty("birth_year")
    public void setBirth_year() {
        this.birth_year = birth_year;
    }

}

