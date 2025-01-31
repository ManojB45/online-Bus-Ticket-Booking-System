// PACKAGE
package com.example.onlineBusTicketBookingApp.entity;

// IMPORTS
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// ANNOTATIONS
@Data // LOMBOK annotation to generate getters, setters, toString, equals, and hashCode methods
@AllArgsConstructor // LOMBOK annotation to generate a constructor with all fields
@NoArgsConstructor // LOMBOK annotation to generate a no-argument constructor

@Entity // Annotation to define this class as a JPA entity (maps to a database table)
@Table(name = "buses") // Annotation to specify the table name in the database
public class Bus {

    // Primary key for the Bus entity with auto-generation strategy
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // Bus number, cannot be null with a length constraint of 100 characters
    @Column(length = 100, nullable = false)
    private String busNumber;

    // Bus driver name, cannot be null with a length constraint of 100 characters
    @Column(length = 100, nullable = false)
    private String busDriverName;

    // Bus type, cannot be null with a length constraint of 100 characters
    @Column(length = 100, nullable = false)
    private String busType;

    // Routes the bus travels, cannot be null with a length constraint of 100 characters
    @Column(length = 100, nullable = false)
    private String routes;

    @Column(length = 100, nullable = false)
    private Integer availableSeats;

    // Many-to-one relationship with Passenger, the 'fetch' strategy is lazy loading
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "passenger_id", nullable = false) // Foreign key column for Passenger
    private Passenger passenger;

    // Many-to-one relationship with Admin, the 'fetch' strategy is lazy loading
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "admin_id", nullable = false) // Foreign key column for Admin
    private Admin admin;

    // Required CONSTRUCTORS
    public Bus(long l, String updatedBus, String routeC, int i) {

    }

    public Bus() {

    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public String getBusDriverName() {
		return busDriverName;
	}

	public void setBusDriverName(String busDriverName) {
		this.busDriverName = busDriverName;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getRoutes() {
		return routes;
	}

	public void setRoutes(String routes) {
		this.routes = routes;
	}

	public Integer getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(Integer availableSeats) {
		this.availableSeats = availableSeats;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
    
    
}