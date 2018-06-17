package ex2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        Class<?> personClass = Person.class;
        Field[] fields = personClass.getDeclaredFields();

        Constructor emptyCtor = personClass.getDeclaredConstructor();
        Constructor ageCtor = personClass.getDeclaredConstructor(int.class);
        Constructor nameAgeCtor = personClass.getConstructor(String.class, int.class);

        String name = bufferedReader.readLine();
        int age = Integer.valueOf(bufferedReader.readLine());

        Person basePerson = (Person) emptyCtor.newInstance();
        Person personWithAge = (Person) ageCtor.newInstance(age);
        Person personFull = (Person) nameAgeCtor.newInstance(name, age);

        System.out.printf("%s %s%n", basePerson.getName(), basePerson.getAge());
        System.out.printf("%s %s%n", personWithAge.getName(), personWithAge.getAge());
        System.out.printf("%s %s%n", personFull.getName(), personFull.getAge());

    }
 }
