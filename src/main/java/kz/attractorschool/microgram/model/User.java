package kz.attractorschool.microgram.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Objects;
@Document
public class User {
    public static final User EMPTY = new User("0", null, null);
    @Id
    private String idUser;
    private String name;
    private String email;
    private String password;
    private int publications = 0;
    private int subscriber = 0;
    private int subscription = 0;
    private int likes=0;

    public User(String idUser, String name, String email, String password) {
        this.idUser= idUser;
        this.name = name;
        this.email = email;
        this.password=password;
    }
    public User(String idUser, String name) {
        this(idUser,name, null, null);
    }

    public User(String idUser, String name, String email) {
        this(idUser, name, email, null);
    }
    public User() {

    }
    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPublications() {
        return publications;
    }

    public void setPublications(int publications) {
        this.publications = publications;
    }

    public int getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(int subscriber) {
        this.subscriber = subscriber;
    }

    public int getSubscription() {
        return subscription;
    }

    public void setSubscription(int subscription) {
        this.subscription = subscription;
    }
    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(idUser, user.idUser);
    }
    @Override
    public int hashCode() {
        return Objects.hash(idUser, name);
    }
    @Override
    public String toString() {
        return "User{" +
                "id='" + idUser + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", publications=" + publications +
                ", subscriber=" + subscriber+
                ", subscription=" + subscription+
                ", likes=" + likes+
                '}';
    }

    public void likes() {
    }
}
