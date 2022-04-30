package finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
        // Function interface
        Function<String, String> upperCaseName = name -> {
            // Logic
            if (name.isBlank()) throw new IllegalArgumentException("");
            return name.toUpperCase();
        };

        String upperCasedName = upperCaseName.apply("Alex");
        System.out.println(upperCasedName);

        // BiFunction interface
        BiFunction<String, Integer, String> upperCaseNameBiFunction = (name, age) -> {
            // Logic
            if (name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };

        String upperCasedNameBi = upperCaseNameBiFunction.apply("Alex", 20);
        System.out.println(upperCasedNameBi);
    }
}
