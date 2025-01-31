// PACKAGE
package com.example.onlineBusTicketBookingApp.entity;

// IMPORTS
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

// ANNOTATIONS
@Data // LOMBOK annotation to generate getters, setters, toString, equals, and hashCode methods
@AllArgsConstructor // LOMBOK annotation to generate a constructor with all fields
@NoArgsConstructor // LOMBOK annotation to generate a no-argument constructor

@Entity // Annotation to define this class as a JPA entity (maps to a database table)
@Table(name = "bookings") // Annotation to specify the table name in the database
public class Booking {

    // Primary key for the Booking entity with auto-generation strategy
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // Date Of Booking, cannot be null
    @Column(nullable = false)
    private LocalDateTime dateOfBooking;

    // Date of Departure, cannot be null
    @Column(nullable = false)
    private LocalDateTime dateOfDeparture;

    // Date Of Arrival, cannot be null
    @Column(nullable = false)
    private LocalDateTime dateOfArrival;

    // Number Of Seats, cannot be null
    @Column(nullable = false)
    private Integer noOfSeats;

    // Departure location, cannot be null
    @Column(nullable = false)
    private String departure;

    // Arrival location, cannot be null
    @Column(nullable = false)
    private String destination;

    // Many-to-one relationship with Passenger, the 'fetch' strategy is lazy loading
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "passenger_id", nullable = false) // Foreign key column for Passenger
    private Passenger passenger;

    // Many-to-one relationship with Admin, the 'fetch' strategy is lazy loading
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "admin_id", nullable = false) // Foreign key column for Admin
    private Admin admin;

    // Required CONSTRUCTOR
    public Booking() {

    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDateTime getDateOfBooking() {
		return dateOfBooking;
	}

	public void setDateOfBooking(LocalDateTime dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}

	public LocalDateTime getDateOfDeparture() {
		return dateOfDeparture;
	}

	public void setDateOfDeparture(LocalDateTime dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}

	public LocalDateTime getDateOfArrival() {
		return dateOfArrival;
	}

	public void setDateOfArrival(LocalDateTime dateOfArrival) {
		this.dateOfArrival = dateOfArrival;
	}

	public Integer getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(Integer noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
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