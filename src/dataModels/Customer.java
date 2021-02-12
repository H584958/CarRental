package dataModels;

public class Customer {
	private String firstName;
	private String lastName;
	private Adress adress;
	private int phoneNumber;
	private Reservation reservation;
	
	public Customer () {
		
	}
	
	public Customer (int phoneNumber) {
		
	}
	
	public Customer(String firstName, String lastName, Adress adress, int phoneNumber, Reservation reservation) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
		this.reservation = reservation;
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
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	
	


}
