package home.research.hellojavastreams;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        Supplier<Stream<String>> streamSupplier = () -> Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> s.startsWith("a"));

        System.out.println(streamSupplier.get().anyMatch(s -> true)); // ok
        System.out.println(streamSupplier.get().noneMatch(s -> true)); // ok
        
        final Function<Integer, Integer> plus10 = sum.apply(10);
        System.out.println("\n### plus10.apply(5) \n\t" + plus10.apply(5));
        
    }

    public static Function<Integer, Integer> adder(Integer x) {
        return y -> x + y;
    }

    public static Function<Integer, UnaryOperator<Integer>>sum = x -> y -> x + y;

}