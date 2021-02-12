package dataModels;

public class Adress {

	private String streetAddress;
	private int postalCode;
	private String postPlace;
	
	
	public Adress() {
		
	}
	
	public Adress(String streetAddress, int postalCode, String postPlace) {
		this.streetAddress = streetAddress;
		this.postalCode = postalCode;
		this.postPlace = postPlace;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getPostPlace() {
		return postPlace;
	}
	public void setPostPlace(String postPlace) {
		this.postPlace = postPlace;
	}
	
	
	
}
