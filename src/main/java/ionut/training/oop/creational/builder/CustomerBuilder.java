package ionut.training.oop.creational.builder;

public class CustomerBuilder {

    private final Customer customer = new Customer();

    public CustomerBuilder withName(String name) {
        customer.setName(name);
        return this;
    }

    public CustomerBuilder withPhone(String phone) {
        customer.setPhone(phone);
        return this;
    }

    public CustomerBuilder withAddress(Address address) {
        customer.setAddress(address);
        return this;
    }

    //..

    public Customer build() {
        return customer;

    }
}
