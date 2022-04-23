package combinatorpattern;

import java.time.LocalDate;
import java.util.function.Function;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+0985652654",
                LocalDate.of(2015, 1, 1)
        );

//        System.out.println(new CustomerValidatorService().isValid(customer));

        /**
         * Using combinator pattern
         * Created interface that extends Function interface
         * So that the methods can be chained and pass the parameter in apply method
         */

        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);

        System.out.println(result);

        if (!result.equals(ValidationResult.SUCCESS)) {
            throw new IllegalStateException(result.name());
        }

    }
}
