package srteamhomework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleMain {


    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Борисов", "Антон", 9),
                new Person("Антонов", "Борис", 15),
                new Person("Антонов", "Борис", 12),
                new Person("Антонов", "Виктор", 15)
        );

        System.out.println("Исходно:");
        people.forEach(System.out::println);

        var peopleSorted = people.stream()
                .sorted(Comparator.comparing(Person::getLastname)
                        .thenComparing(Person::getFirstname)
                        .thenComparing(Comparator
                                .comparing(Person::getAge).reversed()))
                // удобно капец, а главное легко найти как сортировать в обратнои порядке угу
                .collect(Collectors.toList());

        System.out.println("После нашей крутой сортировки:");
        peopleSorted.forEach(System.out::println);
    }
}

