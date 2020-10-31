package rental.rental.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy="item")
    private List<UserItem> userItems;

    private String name;
    private String author;
    private String description;
    private LocalDate dateAdded;
    private byte[] photo;

    public Item() {  }

    public Item(Long id, String name, String author, String description, LocalDate dateAdded, byte[] photo) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.description = description;
        this.dateAdded = dateAdded;
        this.photo = photo;
    }

    public Item(Long id, List<UserItem> userItems, String name, String author, String description, LocalDate dateAdded, byte[] photo) {
        this.id = id;
        this.userItems = userItems;
        this.name = name;
        this.author = author;
        this.description = description;
        this.dateAdded = dateAdded;
        this.photo = photo;
    }

    public List<UserItem> getUserItems() { return userItems; }

    public void setUserItems(List<UserItem> userItems) { this.userItems = userItems; }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
}
