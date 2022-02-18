import java.util.stream.IntStream;

public class NumericStream {

    public static void main(String[] args) {
        IntStream stream = IntStream.of(1, 2, 3, 5, 8, 13);

        Integer sum = stream
            .filter(numero -> numero % 2 != 0)
            .sum();
        System.out.println(sum);
    }

}
