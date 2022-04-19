package optionals.crash;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

//        Optional<Object> empty = Optional.empty();
//
//        System.out.println(empty.isPresent());
//        System.out.println(empty.isEmpty());

//        Optional<String> hello = Optional.of("Hello");
//        System.out.println(hello.isPresent());
//        System.out.println(hello.isEmpty());

        Optional<String> hello = Optional.ofNullable("hello");

//        String orElse = hello
//                .map(String::toUpperCase)
//                .orElse("world"); // If Optional values is not present, it will return orElse statement
//
//        System.out.println(orElse);

//        String orElseGet = hello
//                .map(String::toUpperCase)
//                .orElseGet(() -> {
//                    // can do extra computation to retrieve the value
//                    return "world";
//                });

//        String elseThrow = hello
//                .map(String::toUpperCase)
//                .orElseThrow(IllegalStateException::new);// It will throw the illegal state exception, if the Optional value is null

        hello.ifPresent(System.out::println); // It will print the Optional value // hello.ifPresent(word -> System.out.println(word))

        hello.ifPresentOrElse(System.out::println, () -> System.out.println("world")); // It's like if else


    }
}
