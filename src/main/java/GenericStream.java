import java.util.List;

public class GenericStream {

    public static void main(String[] args) {
        List<String> nomes = List.of("João", "José", "Maria");

        List<String> nomesModificados = nomes.stream()
            .peek(nome -> System.out.println("Stream step 1: " + nome))
            .filter(nome -> nome.startsWith("J"))
            .peek(nome -> System.out.println("Stream step 2: " + nome))
            .map(String::toUpperCase)
            .peek(nome -> System.out.println("Stream step 3: " + nome))
            .sorted()
            .peek(nome -> System.out.println("Stream step 4: " + nome))
            .map(String::toLowerCase)
            .peek(nome -> System.out.println("Stream step 5: " + nome))
            .toList();

        System.out.println(nomesModificados);
    }

}
