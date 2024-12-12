package ceshi;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class steam {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("a", "b", "c");
        Stream<String> s2 = Stream.of("d", "e", "f");
        List<String> list = s1.collect(Collectors.toList());
        Set<String> set = s2.collect(Collectors.toSet());
        String[] arr = list.stream().toArray(String[]::new);
    }
}
