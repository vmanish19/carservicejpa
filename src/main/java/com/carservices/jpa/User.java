package com.carservices.jpa;

import com.group9.truckshippingsystem.security.Group;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Manish
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "User.findUserByUsername", query = "select u from User u where u.userName= :username")
})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String userName;

    private String password;

    private String userType;

    @ManyToMany
    @JoinTable(name = "sec_user_groups",
            joinColumns = @JoinColumn(name = "USERNAME"),
            inverseJoinColumns = @JoinColumn(name = "GROUPNAME"))
    private List<Group> groups = new ArrayList<>();

    /**
     * Add new group.
     *
     * @param g new group object
     */
    public void addGroups(Group g) {
        this.groups.add(g);
        g.getUsers().add(this);
    }
    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    /**
     * Get the value of userType
     *
     * @return the value of userType
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Set the value of userType
     *
     * @param userType new value of userType
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Get the value of password
     *
     * @return the value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the value of password
     *
     * @param password new value of password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get the value of userName
     *
     * @return the value of userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Set the value of userName
     *
     * @param userName new value of userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

}
