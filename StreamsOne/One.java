package StreamsOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class One {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> s1 = l.stream();
        Integer[] a = {1,2,3,4,5,6,7,8,9,0};
        Stream<Integer> s2 = Arrays.stream(a);
        List<Integer> de = l.stream().filter(n-> n%2==0).map(n->n*2).collect(Collectors.toList());
        System.out.println(de);
    }
}
