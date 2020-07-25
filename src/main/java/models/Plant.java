package models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "plants")
public class Plant
    extends Auditable {
    @Id
    @GeneratedValue
    private long plantId;

    private String name;
    private String species;
    private String h2ofrequency;
    private String plantimage;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    @JsonIgnoreProperties(value = "plants", allowSetters = true)
    public User user;


    public Plant() {
    }

    public Plant(String name, String species, String h2ofrequency, String plantimage, User user) {
        this.name = name;
        this.species = species;
        this.h2ofrequency = h2ofrequency;
        this.plantimage = plantimage;
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getH2ofrequency() {
        return h2ofrequency;
    }

    public void setH2ofrequency(String h2ofreq) {
        this.h2ofrequency = h2ofreq;
    }

    public String getPlantimage() {
        return plantimage;
    }

    public void setPlantimage(String plantimage) {
        this.plantimage = plantimage;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
