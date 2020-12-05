package rental.rental.entity;


import org.hibernate.mapping.Join;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class User {

    @OneToMany(mappedBy="user")
    private List<Role> roles;

    @OneToMany
    @JoinTable(name = "USER_ITEM",
            joinColumns =@JoinColumn(name = "id_user"),
            inverseJoinColumns = @JoinColumn(name = "id_item"))
    private List<Item> itemsUser;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private Boolean locked;
    private byte[] photo;
    private LocalDate dateOfRegistration;

    public User() { }

    public User(Long id, String name, String surname, Boolean locked, byte[] photo, LocalDate dateOfRegistration) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.locked = locked;
        this.photo = photo;
        this.dateOfRegistration = dateOfRegistration;
    }

    public List<Item> getItemsUser() {
        return itemsUser;
    }

    public void setItemsUser(List<Item> itemsUser) {
        this.itemsUser = itemsUser;
    }

    public List<Role> getRoles() { return roles; }

    public void setRoles(List<Role> roles) { this.roles = roles; }

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
}
