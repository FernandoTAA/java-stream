import java.util.List;
import java.util.stream.Stream;

public class ExecuteOnlyTerminatorStream {

    public static void main(String[] args) {
        List<String> names = List.of("João", "José", "Maria");

        final Stream<String> namesTreated = names.stream()
            .peek(nome -> System.out.println("Stream step 1: " + nome))
            .filter(nome -> nome.startsWith("J"))
            .peek(nome -> System.out.println("Stream step 2: " + nome))
            .map(String::toUpperCase)
            .peek(nome -> System.out.println("Stream step 3: " + nome))
            .sorted()
            .peek(nome -> System.out.println("Stream step 4: " + nome))
            .map(String::toLowerCase)
            .peek(nome -> System.out.println("Stream step 5: " + nome));

        System.out.println("Stream waiting for terminator");

        List<String> namesModified = namesTreated
            .toList();

        System.out.println(namesModified);
    }
}
