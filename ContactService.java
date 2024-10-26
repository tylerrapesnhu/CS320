package Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
	private List<Contact> contacts;
	
	public ContactService() {
		contacts = new ArrayList<>();
	}

	public void addContact(Contact contact) {
		if (contactIndex(contact.getContactID()) != -1) {
			throw new IllegalArgumentException("Contact ID must be unique");
		}
		contacts.add(contact);
	}
	public void deleteContact(String contactID) {
		int index = contactIndex(contactID);
		if (index == -1) {
			throw new IllegalArgumentException("Contact not found");
		}
		contacts.remove(index);
	}
	
	public void updateContact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		int index = contactIndex(contactID);
		if (index == -1) {
			throw new IllegalArgumentException ("Contact not found");
		}
		Contact contact = contacts.get(index);
		if (firstName != null) {
			contact.setFirstName(firstName);
		}
		if (lastName != null) {
			contact.setLastName(lastName);
		}
		if (phoneNumber !=null) {
			contact.setPhoneNumber(phoneNumber);
		}
		if (address != null) {
			contact.setAddress(address);
		}
	}
	
	public Contact getContact(String contactID) {
		int index = contactIndex(contactID);
		if (index == -1) {
			throw new IllegalArgumentException("Contact not found");
		}
		return contacts.get(index);
	}
	
	private int contactIndex(String contactID) {
		for (int i = 0; i <contacts.size(); i++) {
			if (contacts.get(i).getContactID().equals(contactID)) {
				return i;
			}
		}
		return -1;
	}
}
