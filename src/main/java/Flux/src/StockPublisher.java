package Flux.src;

import reactor.core.publisher.Flux;
import Flux.src.utils;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicInteger;

public class StockPublisher {
    public static Flux<Integer> getPrice()
    {
        AtomicInteger atomicInteger = new AtomicInteger(100);
        return Flux.interval(Duration.ofSeconds(1)).map(i->atomicInteger.getAndAccumulate(utils.faker().random().nextInt(-5,5),Integer::sum));
    }
}
