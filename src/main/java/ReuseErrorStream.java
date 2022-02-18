import java.util.stream.IntStream;

public class ReuseErrorStream {

    public static void main(String[] args) {
        IntStream stream = IntStream.of(1, 2, 3, 5, 8, 13);

        final IntStream streamFiltered = stream
            .filter(numero -> numero % 2 != 0);

        Integer sum = streamFiltered
            .sum();
        System.out.println(sum);

        Long total = streamFiltered
            .count();
        System.out.println(total);

    }

}
