package p04_ShoppingSpree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Person> persons = new LinkedHashMap<>();
        Map<String, Product> products = new HashMap<>();

        String[] people = bufferedReader.readLine().split(";");

        try {

        for (String person: people) {
            String[] personInfo = person.split("=");


                Person personBase = new Person(personInfo[0], Double.parseDouble(personInfo[1]));
                persons.putIfAbsent(personInfo[0], personBase);


        }

        String[] productLine = bufferedReader.readLine().split(";");

        for (String prod : productLine) {
            String[] prodInfo = prod.split("=");
            Product product = new Product(prodInfo[0], Double.parseDouble(prodInfo[1]));
            products.putIfAbsent(prodInfo[0], product);
        }



        while (true) {
            String[] whoBuysWhat = bufferedReader.readLine().split(" ");

            if (whoBuysWhat[0].equals("END")) {
                break;
            }

            try {
                persons.get(whoBuysWhat[0]).byuProduct(products.get(whoBuysWhat[1]));
            } catch (NullPointerException npe) {

            }
        }



        persons.entrySet().stream().forEach(person -> person.getValue().getProducts());


        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

    }
}
