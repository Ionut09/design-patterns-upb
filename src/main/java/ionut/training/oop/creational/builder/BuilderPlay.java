package ionut.training.oop.creational.builder;

public class BuilderPlay {
    public static void main(String... args) {
        Customer customer = new CustomerBuilder()
                .withName("John Doe")
                .withPhone("0762731727")
                .withAddress(new AddressBuilder()
                        .withStreetName("Ferentari")
                        .withStreetNumber(333)
                        .withCity("Bucharest")
                        .build())
                .build();

        Customer customerWithLombok = Customer.builder()
                                              .name("John Doe")
                                              .phone("08392332232")
                                              .address(Address.builder()
                                                              .streetName("Ferentari")
                                                              .streetNumber(333)
                                                              .city("Bucharest")
                                                              .build())
                                              .build();

    }
}
