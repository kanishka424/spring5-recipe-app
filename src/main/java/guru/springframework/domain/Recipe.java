package guru.springframework.domain;

import javax.persistence.*;
import java.util.Set;


@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer serving;
    private String url;
    private String direction;


    @Lob
    private Byte[] image;
    @OneToOne(cascade= CascadeType.ALL)
    private Notes notes;

    @OneToMany(cascade= CascadeType.ALL,mappedBy = "recipe")//mappedBy indicate the target property in Ingridient classpo
    private Set<Ingredient> Ingredient;

    @Enumerated(value=EnumType.STRING)
    private Difficulty difficulty;



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(Integer prepTime) {
        this.prepTime = prepTime;
    }

    public Integer getCookTime() {
        return cookTime;
    }

    public void setCookTime(Integer cookTime) {
        this.cookTime = cookTime;
    }

    public Integer getServing() {
        return serving;
    }

    public void setServing(Integer serving) {
        this.serving = serving;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }
}
