package com.horbatiuk.data;

import javax.persistence.*;

/**
 * The Contact class contains fields for storing in database for contact objects.
 *
 * @author A.Horbatiuk
 */

@Entity
@Table(name = "Contacts")
public class Contact {
    /**
     * Unique id for storing objects in db. Generates by db.
     *
     * @author A.Horbatiuk
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    /**
     * Stores first name of contact.
     *
     * @author A.Horbatiuk
     */

    @Column(name = "firstName", nullable = false)
    private String firstName;


    /**
     * Stores last name of contact.
     *
     * @author A.Horbatiuk
     */

    @Column(name = "lastName", nullable = false)
    private String lastName;


    /**
     * Stores phone of contact.
     *
     * @author A.Horbatiuk
     */

    @Column(name = "phone", nullable = false)
    private int phone;


    /**
     * Stores age of contact.
     *
     * @author A.Horbatiuk
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
}
