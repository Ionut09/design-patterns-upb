package ionut.training.oop.creational.builder;

public class AddressFluentBuilder {
	
	private final Address address = new Address();
	
	public AddressFluentBuilder withStreetName(String streetName) {
		address.setStreetName(streetName);
		return this;
	}
	
	public AddressFluentBuilder withCity(String city) {
		address.setCity(city);
		return this;
	}
	
	public AddressFluentBuilder withStreetNumber(int streetNumber) {
		address.setStreetNumber(streetNumber);
		return this;
	}
	
	//...
	public Address build() {
		return address;
	}
	
}
