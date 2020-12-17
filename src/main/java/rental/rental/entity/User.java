package rental.rental.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class User {

    @OneToOne(mappedBy = "user")
    private Role roles;

    @OneToMany(mappedBy = "user")
    private List<RentHistory> rentHistories;

    @OneToMany(mappedBy = "user")
    private List<UserItem> userItems;

//    @OneToMany
//    @JoinTable(name = "USER_ITEM",
//            joinColumns = @JoinColumn(name = "id_user"),
//            inverseJoinColumns = @JoinColumn(name = "id_item"))
//    private List<Item> itemsUser;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String login;
    private String password;
    private String name;
    private String surname;
    private Boolean locked;
    private byte[] photo;
    private LocalDate dateOfRegistration;
    private Boolean isAvailable;

    public User() {
    }

    public User(String login, String password, String name, String surname, Boolean locked, byte[] photo, LocalDate dateOfRegistration, Boolean isAvailable) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.locked = locked;
        this.photo = photo;
        this.dateOfRegistration = dateOfRegistration;
        this.isAvailable = isAvailable;
    }

    public Role getRoles() {
        return roles;
    }

    public void setRoles(Role roles) {
        this.roles = roles;
    }

    public List<RentHistory> getRentHistories() {
        return rentHistories;
    }

    public void setRentHistories(List<RentHistory> rentHistories) {
        this.rentHistories = rentHistories;
    }

    public List<UserItem> getUserItems() {
        return userItems;
    }

    public void setUserItems(List<UserItem> userItems) {
        this.userItems = userItems;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public LocalDate getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(LocalDate dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }
}
