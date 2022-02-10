package ro.fasttrackit.temacurs17;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PersonService {
    public static void main(String[] args) {



  /*  private final List<Person> person;

    public PersonService(Collection<Person> person) {
        this.person = person == null
                ? new ArrayList<>()
                : new ArrayList<>(person);*/


        List<Person> persons = List.of(
                new Person("Popescu ", "Ion ", 32, "Oradea"),
                new Person("Alb ", "Maria ", 31, "Cluj"),
                new Person("Ionescu ", "Mihai ", 30, "Timisoara"),
                new Person("Iacobut ", "Nicoleta ", 28, "Cluj"),
                new Person("Negrea ", "Teodora ", 24, "Oradea"),
                new Person("Sava ", "Matei ", 17, "Cluj")
        );

      List<String> prs = persons.stream()
                .map(person1 -> person1.getFirstName() + person1.getLastName())
                .collect(toList());
                 System.out.println(prs);

      List<Person> toAge = persons.stream()
              .filter(person1-> person1.getAge() > 18)
              .collect(toList());
               System.out.println(toAge);

      List<Person> toCity = persons.stream()
              .filter(person1-> "Oradea".equals(person1.getCity()))
              .collect(toList());
               System.out.println(toCity);
        List<Person> cityToAnotherCity = persons.stream()
               .filter(person1 -> "Oradea".equals(person1.getCity()))
                .collect(toList())
                .stream().filter(person1-> "Cluj".equals(person1.getCity()))
                .collect(toList());
                 System.out.println(cityToAnotherCity);

;
        persons.stream()
               .map(person1 -> person1.getFirstName().toUpperCase())
                .forEach(System.out::println);
         List<Person> persStart = persons.stream()
                 .filter(person1 -> person1.getFirstName().startsWith("A"))
                 .collect(toList());
                System.out.println(persStart);

        persons.stream()
                .map(person1 -> person1.getLastName() + person1.getFirstName().substring(0, 1) + ".")
                .forEach(System.out::println);

        persons.stream()
                 .map(person1 -> "first name : " + person1.getFirstName())
                  .collect(Collectors.toSet())
                  .forEach(System.out::println);
          persons.stream()
                  .map(person1 ->"first name : " + person1.getFirstName())
                  .collect(toList())
                  .forEach(System.out::println);
          persons.stream()
                  .map(person1 ->"last name : "+  person1.getLastName())
                  .collect(toList())
                  .forEach(System.out::println);
          persons.stream()
                  .map(person1 ->"first name : " + person1.getFirstName() + "last name : " +person1.getLastName() + "age : " + person1.getAge())
                  .collect(Collectors.toSet())
                  .forEach(System.out::println);






    }

}

