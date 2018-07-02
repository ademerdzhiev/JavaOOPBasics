package p04_Telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        SmartPhone smartPhone = new SmartPhone();


        String[] phoneNumbers = bufferedReader.readLine().split("\\s+");
        String[] urls = bufferedReader.readLine().split("\\s+");

        for (String phoneNumber : phoneNumbers) {
            try {
                System.out.println(smartPhone.call(phoneNumber));
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }

        for (String url : urls) {
            try {
                System.out.println(smartPhone.browsing(url));
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
         }

    }
}
