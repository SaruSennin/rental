package rental.rental.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class UserItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="USER_ID")
    private User user;

    @ManyToOne
    @JoinColumn(name="ITEM_ID")
    private Item item;

    private LocalDate dateOfRent;
    private LocalDate dateOfReturn;

    public UserItem() { }

    public UserItem(Long id, LocalDate dateOfRent, LocalDate dateOfReturn) {
        this.id = id;
        this.dateOfRent = dateOfRent;
        this.dateOfReturn = dateOfReturn;
    }

    public UserItem(Long id, User user, Item item, LocalDate dateOfRent, LocalDate dateOfReturn) {
        this.id = id;
        this.user = user;
        this.item = item;
        this.dateOfRent = dateOfRent;
        this.dateOfReturn = dateOfReturn;
    }

    public User getUser() { return user; }

    public void setUser(User user) { this.user = user; }

    public Item getItem() { return item; }

    public void setItem(Item item) { this.item = item; }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateOfRent() {
        return dateOfRent;
    }

    public void setDateOfRent(LocalDate dateOfRent) {
        this.dateOfRent = dateOfRent;
    }

    public LocalDate getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(LocalDate dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }



}
