package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        Object hello = Optional.ofNullable(null)
//                .orElseGet(() -> "default value");
//        System.out.println(hello);

        /**
         * orElseThrow() method can be used to throw an exception
         */
        Object s = Optional.ofNullable("Hello")
                .orElseThrow(() -> new IllegalStateException("Exception occurred"));
        System.out.println(s);

        /**
         * ifPresent() method to write some logic, if the value is present
         * if the value is not present, it does nothing
         */
        Optional.ofNullable("murali4neo@gmail")
                .ifPresent(email -> {
                    String s1 = email.toLowerCase();
                    System.out.println(s1);
                });

        Optional.ofNullable("murali4neo@gmail.com")
                .ifPresent(email -> System.out.println("Sending email to " + email));

        /**
         * ifPresentOrElse() method is to handle, if the value is not present
         */
        Optional.ofNullable(null)
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to " + email),
                        () -> {
                            System.out.println("Cannot send email");
                        }
                );
    }
}
