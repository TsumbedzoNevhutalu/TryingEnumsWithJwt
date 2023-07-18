package com.example.EnumJwt.model;


import javax.management.relation.Role;
import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "username"),
                @UniqueConstraint(columnNames = "email")
        })
public class User {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY.AUTO)
    private  Long id;
    //    private String firstName;
    private String username;
    //    private String lastName;
    private String email;
    private String password;
//    private String role;
//    private  Date createdDate;
//    private Date updateDate;

    @ManyToMany(fetch = FetchType.EAGER, cascade =  CascadeType.ALL)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name ="role_id"))

    private Set<Role> roles = new HashSet<>();

    public User(){}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User(String username, String email, String password){
        this.username = username;
//        this.firstName = firstName;
//        this.lastName = lastName;
        this.email = email;
        this.password = password;
//        this.createdDate = createdDate;
//        this.updateDate = updateDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }

//    public String getLastName() {
//        return lastName;
//    }

//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }

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

//    public Date getCreatedDate() {
//        return createdDate;
//    }
//
//    public void setCreatedDate(Date createdDate) {
//        this.createdDate = createdDate;
//    }

//    public Date getUpdateDate() {
//        return updateDate;
//    }

//    public void setUpdateDate(Date updateDate) {
//        this.updateDate = updateDate;
//    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
