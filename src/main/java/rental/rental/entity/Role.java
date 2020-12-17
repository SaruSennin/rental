package rental.rental.entity;

import javax.persistence.*;

@Entity
public class Role {

    @OneToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String roleName;
    private Boolean isAvailable;

    public Role() {
    }

    public Role(String roleName, Boolean isAvailable) {
        this.roleName = roleName;
        this.isAvailable = isAvailable;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }
}
