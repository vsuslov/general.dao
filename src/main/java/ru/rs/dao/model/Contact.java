package ru.rs.dao.model;

import javax.persistence.*;

/**
 * Created by Admin on 27.10.2014.
 */
@Entity
@Table
@NamedQueries({
        @NamedQuery(name = "allContacts", query = "SELECT c FROM Contact c")
})
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String name;

    private String email;

    //=============================


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
