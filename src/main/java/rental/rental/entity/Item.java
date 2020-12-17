package rental.rental.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Item {

//    @OneToMany(mappedBy = "itemsUser")
//    private List<User> userList;

    @OneToOne(mappedBy = "item")
    private Type type;

    @OneToOne(mappedBy = "item")
    private UserItem userList;

    @OneToMany(mappedBy = "item")
    private List<RentHistory> rentHistories;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String author;
    private String description;
    private LocalDate dateAdded;
    private byte[] photo;
    private LocalDate dateOfRent = null;
    private Boolean isAvailable;

    public Item() {
    }

    public Item(String name, String author, String description, LocalDate dateAdded, byte[] photo, LocalDate dateOfRent, Boolean isAvailable) {
        this.name = name;
        this.author = author;
        this.description = description;
        this.dateAdded = dateAdded;
        this.photo = photo;
        this.dateOfRent = dateOfRent;
        this.isAvailable = isAvailable;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public UserItem getUserList() {
        return userList;
    }

    public void setUserList(UserItem userList) {
        this.userList = userList;
    }

    public List<RentHistory> getRentHistories() {
        return rentHistories;
    }

    public void setRentHistories(List<RentHistory> rentHistories) {
        this.rentHistories = rentHistories;
    }

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

    public LocalDate getDateOfRent() {
        return dateOfRent;
    }

    public void setDateOfRent(LocalDate dateOfRent) {
        this.dateOfRent = dateOfRent;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }
}
