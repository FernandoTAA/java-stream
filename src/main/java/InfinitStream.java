import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class InfinitStream {

    public static void main(String[] args) {
        AtomicInteger count = new AtomicInteger(0);
        ;
        Long total = Stream.generate(count::getAndIncrement)
            .peek(System.out::println)
            .limit(10)
            .count();

        System.out.println();
        System.out.println(total);
    }
}
