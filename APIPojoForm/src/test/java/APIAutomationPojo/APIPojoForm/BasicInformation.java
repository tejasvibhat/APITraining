package APIAutomationPojo.APIPojoForm;

public class BasicInformation {
	private String FirstName;
	private String LastName;
	private String id;
	private String Role;
	
	private AddressInformation Address;
	
	public String getFirstName() {
		return FirstName;
	}
	public AddressInformation getAddress() {
		return Address;
	}
	public void setAddress(AddressInformation address) {
		Address = address;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
}
