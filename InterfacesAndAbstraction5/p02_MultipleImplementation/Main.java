package p02_MultipleImplementation;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Class[] citizenInterfaces = Citizen.class.getInterfaces();

        if (Arrays.asList(citizenInterfaces).contains(I_Birthable.class) &&
                Arrays.asList(citizenInterfaces).contains(I_Identifiable.class)) {
            Method[] methods = I_Birthable.class.getDeclaredMethods();
            methods = I_Identifiable.class.getDeclaredMethods();

            String name = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            String id = scanner.nextLine();
            String birthdate = scanner.nextLine();

            I_Identifiable identifiable = new Citizen(name, age, id, birthdate);
            I_Birthable birthable = new Citizen(name,age,id,birthdate);

            System.out.println(methods.length);
            System.out.println(methods[0].getReturnType().getSimpleName());
            System.out.println(methods.length);
            System.out.println(methods[0].getReturnType().getSimpleName());
        }
    }

}
