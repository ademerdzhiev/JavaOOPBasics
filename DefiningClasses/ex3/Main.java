package ex3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//
//        Class<?> personClass = Person.class;
//        Field[] fields = personClass.getDeclaredFields();
//
//        Constructor emptyCtor = personClass.getDeclaredConstructor();
//        Constructor ageCtor = personClass.getDeclaredConstructor(int.class);
//        Constructor nameAgeCtor = personClass.getConstructor(String.class, int.class);
//
//        String name = bufferedReader.readLine();
//        int age = Integer.valueOf(bufferedReader.readLine());
//
//        Person basePerson = (Person) emptyCtor.newInstance();
//        Person personWithAge = (Person) ageCtor.newInstance(age);
//        Person personFull = (Person) nameAgeCtor.newInstance(name, age);
//
//        System.out.printf("%s %s%n", basePerson.getName(), basePerson.getAge());
//        System.out.printf("%s %s%n", personWithAge.getName(), personWithAge.getAge());
//        System.out.printf("%s %s%n", personFull.getName(), personFull.getAge());


        int n = Integer.parseInt(bufferedReader.readLine());

        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = bufferedReader.readLine().split("\\s");
            String name = input[0];
            int age = Integer.valueOf(input[1]);

            persons.add(new Person(name, age));
        }

        persons.stream().filter(p -> p.getAge() > 30)
                .sorted(Comparator.comparing(Person::getName))
                .forEach(person -> System.out.println(person.getName() + " - " + person.getAge()));

    }
 }
