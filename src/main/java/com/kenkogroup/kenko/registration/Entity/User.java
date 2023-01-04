package com.kenkogroup.kenko.registration.Entity;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {
    @Id
    @Column(name="user_id",length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userid;

    @Column(name="user_name")
    private String username;

    @Column(name="user_address")
    private String address;

    @Column(name="password")
    private String password;

    public User(int userid, String username, String address, String password) {
        this.userid = userid;
        this.username = username;
        this.address = address;
        this.password = password;
    }

    public User() {
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", mobile=" + password +
                '}';
    }
}
