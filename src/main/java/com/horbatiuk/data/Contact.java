package com.horbatiuk.data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * The Contact class contains fields for storing in database for contact objects.
 *
 * @author A.Horbatiuk
 */

@Entity
@Table(name = "Contacts")
public class Contact implements Serializable {
    /**
     * Unique id for storing objects in db. Generates by db.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    /**
     * Stores first name of contact.
     */

    @Column(name = "firstName", nullable = false)
    private String firstName;


    /**
     * Stores last name of contact.
     */

    @Column(name = "lastName", nullable = false)
    private String lastName;


    /**
     * Stores phone of contact.
     */

    @Column(name = "phone", nullable = false)
    private int phone;


    /**
     * Stores age of contact.
     */

    @Column(name = "age", nullable = false)
    private int age;

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public Contact setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Contact setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public int getPhone() {
        return phone;
    }

    public Contact setPhone(int phone) {
        this.phone = phone;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Contact setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone=" + phone +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (phone != contact.phone) return false;
        if (age != contact.age) return false;
        if (!firstName.equals(contact.firstName)) return false;
        return lastName.equals(contact.lastName);

    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + phone;
        result = 31 * result + age;
        return result;
    }
}
