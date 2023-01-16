package ionut.training.oop.creational.builder;

public class CustomerFluentBuilder {
	
	private final Customer customer = new Customer();
	
	public CustomerFluentBuilder withName(String name) {
		customer.setName(name);
		return this;
	}
	
	public CustomerFluentBuilder withPhone(String phone) {
		customer.setPhone(phone);
		return this;
	}
	
	public CustomerFluentBuilder withAddress(Address address) {
		customer.setAddress(address);
		return this;
	}
	
	public CustomerFluentBuilder addLabel(String label) {
		customer.getLabels()
		        .add(label);
		return this;
	}
	
	public Customer build() {
		return customer;
		
	}
}
