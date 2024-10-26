package Contact;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

class ContactTest {

	@Test
	public void testCorrectContact() {
		Contact contact = new Contact("a123456789", "Tyler", "Rape", "7045555555", "123 Test St");
		assertAll("Verify correct contact",
				() -> assertTrue(contact.getContactID().equals("a123456789")),
				() -> assertTrue(contact.getFirstName().equals("Tyler")),
				() -> assertTrue(contact.getLastName().equals("Rape")),
				() -> assertTrue(contact.getPhoneNumber().equals("7045555555")),
				() -> assertTrue(contact.getAddress().equals("123 Test St"))
		);
	}
	
	@Test
	public void testLongContactID() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("a1234567890", "Tyler", "Rape", "7045555555", "123 Test St");
		}); }
		
	@Test
	public void testNullContactID() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Tyler", "Rape", "7045555555", "123 Test St");
		}); }
	
	@Test
	public void testLongFirstName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("a1234567890", "TylerTylerT", "Rape", "7045555555", "123 Test St");
		}); }
		
	@Test
	public void testNullFirstName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("a1234567890", null, "Rape", "7045555555", "123 Test St");
		}); }
	
	@Test
	public void testLongLastName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("a1234567890", "Tyler", "RapeRapeRape", "7045555555", "123 Test St");
		}); }
		
	@Test
	public void testNullLastName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("a1234567890", "Tyler", null, "7045555555", "123 Test St");
		});	}
	
	@Test
	public void testLongPhoneNumber() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("a1234567890", "Tyler", "Rape", "70455555555", "123 Test St");
		}); }
	
	@Test
	public void testNullPhoneNumber() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("a1234567890", "Tyler", "Rape", null, "123 Test St");
		}); }
	
	@Test
	public void testLongAddress() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("a1234567890", "Tyler", "Rape", "7045555555", "123 Test St123 Test St123 Test St");
		});}
	
	@Test
	public void testNullAddress() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("a1234567890", "Tyler", "Rape", "7045555555", null);
		});	}
}
