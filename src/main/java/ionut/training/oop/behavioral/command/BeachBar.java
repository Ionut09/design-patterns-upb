package ionut.training.oop.behavioral.command;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import static ionut.training.ThreadUtils.sleep;

@Slf4j
public class BeachBar {
    public static void main(String... args) throws ExecutionException, InterruptedException {
        Barman barman = new Barman();

        ExecutorService threadPool = Executors.newFixedThreadPool(2);

        Callable<Beer> beerOrder = () -> barman.purBeer();
        Callable<Vodka> vodkaOrder = barman::purVodka; //method reference

        log.debug("Submitting my orders");
        Future<Beer> futureBeer = threadPool.submit(beerOrder);
        Future<Vodka> futureVodka = threadPool.submit(vodkaOrder);

        log.debug("Waitress went away with my order...");
        Beer beer = futureBeer.get();
        Vodka vodka = futureVodka.get();

        log.debug("Waiting for my drinks..");
        log.debug("Got my drinks!" + beer + "   " + vodka);
    }
}


@Data
@AllArgsConstructor
@Slf4j
class Barman {
    public Beer purBeer() {
        log.debug("Puring beer...");
        sleep(1000);
        return new Beer("Peroni");
    }

    public Vodka purVodka() {
        log.debug("Puring vodka...");
        sleep(1000);
        return new Vodka("Kresokeva");
    }
}

@Data
@AllArgsConstructor
class Beer {
    private String name;

    @Override
    public String toString() {
        return "Beer{" +
                "'" + name + '\'' +
                '}';
    }
}

@Data
@AllArgsConstructor
class Vodka {
    private String name;

    @Override
    public String toString() {
        return "Vodka{" +
                "'" + name + '\'' +
                '}';
    }
}
