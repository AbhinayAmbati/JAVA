package StreamsOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NameOne {
    public static void main(String[] args) {
        List<String> n = Arrays.asList("Ram","Pawan","Kalyan","Charan","Ram","Pawan");
        Stream<String> s = n.stream();
        List<String> l = n.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(l);
    }
}
