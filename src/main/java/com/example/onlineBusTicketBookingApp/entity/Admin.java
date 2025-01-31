// PACKAGE
package com.example.onlineBusTicketBookingApp.entity;

// IMPORTS
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// ANNOTATIONS
// Lombok annotations to generate constructors, getters, and setters,
// improving code readability and reducing boilerplate code
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "admins")
public class Admin {

    // Primary key for Admin entity
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // Admin name with a maximum length of 50 characters, cannot be null
    @Column(length = 50, nullable = false)
    private String name;

    // Admin unique email
    @Column(unique = true)
    private String email;

    // Admin phone number with a maximum length of 20 characters
    @Column(length = 20)
    private String phoneNumber;

    // Admin address with a maximum length of 200 characters
    @Column(length = 200)
    private String address;

    // Required CONSTRUCTORS
    public Admin(long l, String john, String doe, String mail) {

    }

    public Admin(long l, String admin1, String mail) {

    }

    public Admin() {

    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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