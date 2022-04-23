package imperative;

import java.util.Optional;

public class Main1 {
    public static void main(String[] args) {
        // Email may be null. So Optional can be used
        Person person = new Person("James", null);
//        System.out.println(person.getEmail().toLowerCase());
//        System.out.println(person.getEmail().map(String::toLowerCase).orElse("Email not provided"));
        String email = person
                .getEmail()
                .map(String::toLowerCase)
                .orElse("Email not provided");
        System.out.println(email);

//        Or u can use like below
        if (person.getEmail().isPresent()) {

            String email1 = person.getEmail().get();
            System.out.println(email1.toLowerCase());
        } else {
            System.out.println("email not provided");
        }
    }
}

class Person {
    private final String name;
    private final String email;

    Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}
