package gr.aueb.cf.ch11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Read from a file data that separated with comma and gaps.
 */
public class NamesScanning {
    public static void main(String[] args) {
        String inFilePath = "/home/kleidimos/java/lesson files/names.txt";
        String outFilePath = "/home/kleidimos/java/lesson files/names-formated.txt";
        String line;
        String[] tokens;

        try(BufferedReader reader = new BufferedReader(new FileReader(inFilePath));
            PrintStream ps = new PrintStream(outFilePath, StandardCharsets.UTF_8) ){

            while ((line = reader.readLine()) != null){
                tokens = line.split(",+\\s*");
                //ps.printf("{ \"Firstname\": \"%s\", \"Lastname\": \"%s\", \"City\": \"%s\" }, \n", tokens[0], tokens[1], tokens[2]);
                printFormated(ps, tokens);
                printFormated(System.out, tokens);
            }

        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }

    public static void printFormated(PrintStream ps, String[] tokens) {
        ps.printf("{ \"Firstname\": \"%s\", \"Lastname\": \"%s\", \"City\": \"%s\" }, \n", tokens[0], tokens[1], tokens[2]);
    }
}
