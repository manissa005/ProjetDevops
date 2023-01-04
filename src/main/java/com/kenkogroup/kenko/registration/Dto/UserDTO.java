package com.kenkogroup.kenko.registration.Dto;

public class UserDTO {


    private int userid;
    private String username;
    private String address;
    private String password;

    public UserDTO(int userid, String username, String address, String password) {
        this.userid = userid;
        this.username = username;
        this.address = address;
        this.password = password;
    }

    public UserDTO() {
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
        return "UserDTO{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", mobile=" + password +
                '}';
    }
}
