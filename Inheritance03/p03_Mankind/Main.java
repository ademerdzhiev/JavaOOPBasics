package p03_Mankind;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] studentLine = bufferedReader.readLine().split("\\s+");
            String[] workerLine = bufferedReader.readLine().split("\\s+");

            Student student = new Student(studentLine[0], studentLine[1], studentLine[2]);
            Worker woker = new Worker(workerLine[0], workerLine[1],
                    Double.parseDouble(workerLine[2]), Double.parseDouble(workerLine[3]));

            System.out.print(student.toString());
            System.out.print(woker.toString());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

    }
}
