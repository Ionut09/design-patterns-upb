package ionut.training.oop.creational.builder;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class Customer {
	
	private String name;
	private String phone;
	private List<String> labels = new ArrayList<>();
	private Address address;
	
	
	public Customer() {
	}
}
