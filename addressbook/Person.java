package addressbook;

public class Person {

	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String mail;
	private String address;

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", mail="
				+ mail + ", address=" + address + "]";
	}

	public String getFirstnNme() {
		return firstName;
	}

	public void setFirstnNme(String firstnNme) {
		this.firstName = firstnNme;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
