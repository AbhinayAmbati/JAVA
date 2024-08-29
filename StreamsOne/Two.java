package StreamsOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Two {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);

        Stream<Integer> s1 = l1.stream();

        Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Stream<Integer> s2 = Arrays.stream(a);

        List<Integer> de = l1.stream()
                .map(n -> n * 2)
                .filter(n -> n > 20)
                .collect(Collectors.toList());

        System.out.println(de);
    }
}
