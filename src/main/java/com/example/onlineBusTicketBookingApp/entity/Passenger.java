// PACKAGE
package com.example.onlineBusTicketBookingApp.entity;

// IMPORTS
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// ANNOTATIONS
// Lombok annotations to generate constructors, getters, setters, toString, equals, and hashCode methods
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity // Annotation to define this class as a JPA entity (maps to a database table)
@Table(name = "passengers") // Annotation to specify the table name in the database
public class Passenger {

    // Primary key for the Passenger entity with auto-generation strategy
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // Passenger's first name, cannot be null with a maximum length of 50 characters
    @Column(length = 50, nullable = false)
    private String firstName;

    // Passenger's last name, cannot be null with a maximum length of 50 characters
    @Column(length = 50, nullable = false)
    private String lastName;

    // Passenger's unique email
    @Column(unique = true)
    private String email;

    // Passenger's phone number with a maximum length of 20 characters
    @Column(length = 20)
    private String phoneNumber;

    // Passenger's address with a maximum length of 100 characters
    @Column(length = 100)
    private String address;

    // Required CONSTRUCTORS
    public Passenger(long l, String john, String doe, String mail) {

    }

    public Passenger() {

    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
    
    
}