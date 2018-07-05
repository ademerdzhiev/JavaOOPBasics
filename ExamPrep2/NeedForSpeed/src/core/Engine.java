package core;

import io.ConsoleInputReader;
import io.ConsoleOutputWriter;
import utilities.InputParser;

import java.util.ArrayList;

public class Engine {
    private ConsoleInputReader inputReader;
    private ConsoleOutputWriter outputWriter;
    private InputParser inputParser;

    private CarManager carManager;

    public Engine() {
        this.inputReader =new ConsoleInputReader();
        this.outputWriter =  new ConsoleOutputWriter();
        this.inputParser = new InputParser();
        this.carManager = new CarManager();
    }

    public void run() {
        String inputLine = "";

        while (!(inputLine = this.inputReader.readLine()).equals("Cops Are Here")) {
            ArrayList<String> commandParams = this.inputParser.parseInput(inputLine);

            this.dispatchCommand(commandParams);
        }
    }

    private void dispatchCommand(ArrayList<String> commandParams) {
        String command = commandParams.remove(0);

        switch(command) {

        }
    }


}
