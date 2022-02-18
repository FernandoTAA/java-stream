import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.IntStream;

public class LikeAForStream {

    public static void main(String[] args) {
        IntStream.range(1, 10)
            .peek(nome -> System.out.println("Stream step 1: " + nome))
            .limit(7)
            .forEach(nome -> System.out.println("Stream result: " + nome));

        System.out.println("\n");

        IntStream.range(1, 10)
            .peek(nome -> System.out.println("Stream step 1: " + nome))
            .skip(3)
            .forEach(nome -> System.out.println("Stream result: " + nome));
    }
}
