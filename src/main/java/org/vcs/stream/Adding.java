package org.vcs.stream;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Adding {
    public static void main(String[] args) {
        Stream<String> s1= Stream.of("ram","12","14","raj");
        int sum = s1.filter(s -> s.matches("\\d+")).mapToInt(i -> Integer.parseInt(i)).sum();
        System.out.println("sum="+sum);
    }
}
