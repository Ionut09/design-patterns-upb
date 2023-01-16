package ionut.training.oop.behavioral.command;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BeachBar {
	
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		
		Barman barman = new Barman(); //receiver
		
		ExecutorService invoker = Executors.newFixedThreadPool(2);
		
		// Beer call()
		Callable<Beer> beerCommand = () -> barman.purrBeer();
		Callable<Vodka> vodkaCommand = barman::purrVodka; //method reference
		
		log.debug("Submitting my beer order");
		Future<Beer> beerFuture = invoker.submit(beerCommand);
		
		log.debug("Submitting my vodka order");
		Future<Vodka> vodkaFuture = invoker.submit(vodkaCommand);
		
		log.debug("Waitress went away with my orders");
		log.debug("Waiting for my orders.");
		Beer beer = beerFuture.get();
		Vodka vodka = vodkaFuture.get();
		log.debug("Got my beer {} and vodka: {}", beer, vodka);
		
	}
	
}

@Slf4j
class Barman {
	//	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Barman.class);
	
	public Beer purrBeer() {
		log.debug("Purring beer");
		return new Beer("Becks");
	}
	
	public Vodka purrVodka() {
		log.debug("Purring vodka");
		return new Vodka("Kreskova");
	}
}

@AllArgsConstructor
@ToString
class Beer {

//	@Override
//	public String toString() {
//		return "Beer{" +
//			       "name='" + name + '\'' +
//			       '}';
//	}
	
	private String name;
}

@AllArgsConstructor
@ToString
class Vodka {
	
	private String name;
}