package Contact;

public class Contact {

	private final String contactID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		if(contactID == null || contactID.length()>10) {
			throw new IllegalArgumentException("Invalid Contact ID - Cannot be null or longer than 10 characters");
		}
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid first name - Cannot be null or longer than 10 characters");
		}
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid last name - Cannot be null or longer than 10 characters");
		}
		if(phoneNumber == null || phoneNumber.length()>10 || phoneNumber.length()<10) {
			throw new IllegalArgumentException("Invalid phone number - Must be exactly 10 characters and cannot be null");
		}
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address - Cannot be null or longer than 30 characters");
		}
		
				
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	public String getContactID() {
		return contactID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getAddress () {
		return address;
	}
	
	public void setFirstName(String firstName) {
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid first name - Cannot be null or longer than 10 characters");
		}
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid first name - Cannot be null or longer than 10 characters");
		}
		this.lastName = lastName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if(phoneNumber == null || phoneNumber.length()>10 || phoneNumber.length()<10) {
			throw new IllegalArgumentException("Invalid phone number - Must be exactly 10 characters and cannot be null");
		}
		this.phoneNumber = phoneNumber;
	}
	
	public void setAddress(String address) {
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address - Cannot be null or longer than 30 characters");
		}
		this.address = address;
	}
		
}
