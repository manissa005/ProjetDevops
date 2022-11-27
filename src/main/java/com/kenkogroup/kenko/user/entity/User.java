/*package com.kenkogroup.kenko.user.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;


@Entity
@Table(name = "user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id",nullable = false)
    private int id;
    @Column(name = "firstname",nullable = false, columnDefinition = "varchar(50)")
    private String lastname;
    @Column(name = "lastname",nullable = false, columnDefinition = "varchar(50)")
    private String firstname;

    @Column(name = "role",nullable = false, columnDefinition = "varchar(50)")
    private Role role;

    @Column(name = "age",nullable = false)
    private int age;

    @Enumerated(EnumType.STRING)
    @Column(name = "sexe",nullable = false, columnDefinition = "varchar(50)")
    private Sexe sexe;

    @Column(name = "weight",nullable = false)
    private float weight;

    @Column(name = "size",nullable = false, columnDefinition = "varchar(50)")
    private float size;

    @Enumerated(EnumType.STRING)
    @Column(name="user_cat",nullable = false)
    private UserCategory userCat;

    @CreationTimestamp
    @Column(name = "crated_at")
    private LocalDateTime created_at;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updated_at;


    public User() {super();}

    public User (String lastname, String firstname, int age, Sexe sexe, float weight, float size, UserCategory userCat) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
        this.sexe = sexe;
        this.weight = weight;
        this.size = size;
        this.userCat = userCat;
    }
    public User(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public UserCategory getUserCat() {
        return userCat;
    }

    public void setUserCat(UserCategory userCat) {
        this.userCat = userCat;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                '}';
    }

    public enum UserCategory {
        TEEN("Teen"), ADULT("Adult"),OLD("Old"),PREGNANT("Pregnant");
        private final String name;
        UserCategory(String name) {
            this.name = name;
        }

        public String getName(){
            return name;
        }
    }

    public enum Sexe {
        FEMME("Femme"), HOMME("Homme");
        private final String name;
        Sexe(String name) {
            this.name = name;
        }

        public String getName(){
            return name;
        }
    }

    public enum Role {
        ADMIN("Admin"), USER("User"),VISITOR("Visitor");
        private final String name;
        Role(String name) {
            this.name = name;
        }

        public String getName(){
            return name;
        }
    }
}
*/