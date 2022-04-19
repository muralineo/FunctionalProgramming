package imperative;

public class Main1 {
    public static void main(String[] args) {

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

    public String getEmail() {
        return email;
    }
}
