package srteamhomework;

public class Person {
    private final String lastname;
    private final String firstname;
    private final Byte age;
    public Person(String lastname, String firstname, int age) {
        this.lastname = lastname;
        this.firstname = firstname;
        if (age < 0 || age > 127) {
            throw new IllegalArgumentException("Age should be between 0 and 127");
        }
        this.age = (byte) age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Byte getAge() {
        return age;
    }

    @Override
    public String toString() {
        return lastname + " " + firstname + " " + age;
    }
}
