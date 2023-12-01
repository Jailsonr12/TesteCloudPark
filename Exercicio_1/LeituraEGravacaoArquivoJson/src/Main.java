import enums.RunConfiguration;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RunConfiguration runConfiguration = RunConfiguration.STOP;

        do {
            System.out.println("1 - Read configuration - (Escrever no arquivo)");
            System.out.println("2 - Write configuration - (Ler arquivo)");
            System.out.println("0 - Exit - (Sair)");
            runConfiguration = RunConfiguration.toRunConfiguration(scanner.nextInt());

            switch (runConfiguration) {
                case READ -> {
                    Read read = new Read();
                    read.readConfiguration();
                    break;
                }
                case WRITE -> {
                    Write write = new Write();
                    write.writerConfiguration();
                    break;
                }
            }

        } while (runConfiguration != RunConfiguration.STOP);

        scanner.close();
    }
}
