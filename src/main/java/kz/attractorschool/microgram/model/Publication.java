package kz.attractorschool.microgram.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;
@Document
public  class Publication {

    private int idPublic;
    private String imageLink;
    private LocalDateTime timePub;
    private String description;
    User author;

    public Publication() {

    }
    public Publication(int idPublic, String imageLink, LocalDateTime timePub, String description, User user) {
        this.idPublic= idPublic;
        this.author=user;
        this.imageLink = imageLink;
        this.timePub = timePub;
        this.description=description;
    }



    public int getIdPublic() {
        return idPublic;
    }

    public void setIdPublic(int idPublic) {
        this.idPublic = idPublic;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public LocalDateTime getTimePub() {
        return timePub;
    }

    public void setTimePub(LocalDateTime timePub) {
        this.timePub = timePub;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

}