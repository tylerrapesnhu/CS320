package Contact;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ContactSerivceTest {

	@Test
	void testAddContact() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("a123456789", "Tyler", "Rape", "7045555555", "123 Test St");
		contactService.addContact(contact);
		assertTrue(contact.getContactID().equals("a123456789"));
	}
	
	@Test
	void testUniqueContact() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("a123456789", "Tyler", "Rape", "7045555555", "123 Test St");
		contactService.addContact(contact);
		assertThrows(IllegalArgumentException.class, () -> contactService.addContact(contact));
	}

	@Test
	void testDeleteContact() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("a123456789", "Tyler", "Rape", "7045555555", "123 Test St");
		contactService.addContact(contact);
		contactService.deleteContact("a123456789");
		assertThrows(IllegalArgumentException.class, () -> contactService.getContact("a123456789"));
	}
	
	@Test
	void testUpdateContact() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("a123456789", "Tyler", "Rape", "7045555555", "123 Test St");
		contactService.addContact(contact);
		contactService.updateContact("a123456789", "John", "Smith", "7045555556", "456 Test St.");
		
		assertAll("Test updated contact",
		() -> assertEquals("John", contactService.getContact("a123456789").getFirstName()),
		() -> assertEquals("Smith", contactService.getContact("a123456789").getLastName())
		);
	}
}
