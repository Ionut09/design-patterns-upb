package ionut.training.oop.creational.builder;

public class ConstructionCompany {
	
	public static void main(String... args) {
		Customer customer = new CustomerFluentBuilder()
			                    .withName("Dorel")
			                    .withPhone("0789898989")
			                    .withAddress(new AddressFluentBuilder()
				                                 .withStreetName("Ferentari")
				                                 .withStreetNumber(333)
				                                 .withCity("Bucharest")
				                                 .build())
			                    .build();
		
		customer = Customer.builder()
		                   .name("John Doe")
		                   .phone("07216161")
		                   .address(Address.builder()
		                                   .city("Timisoara")
		                                   .country("RO")
		                                   .build())
		                   .build();
		
//		customer.setName();
		
	}
}
