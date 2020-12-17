package rental.rental.entity;

import javax.persistence.*;

@Entity
public class Type {

    @OneToOne
    @JoinColumn(name = "ITEM_ID")
    private Item item;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Boolean isAvailable;

    public Type() {
    }

    public Type(String name, Boolean isAvailable) {
        this.name = name;
        this.isAvailable = isAvailable;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
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

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }
}
