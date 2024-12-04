package gr.aueb.cf.ch11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileInOutApp {
    public static void main(String[] args) {
        File inFd = new File("/home/kleidimos/java/lesson files/file7.txt");
        File outFd = new File("/home/kleidimos/java/lesson files/file7-out.txt");
        String line;
        String[] tokens;

        try(Scanner sc = new Scanner(inFd);
            PrintStream ps = new PrintStream(outFd, StandardCharsets.UTF_8)) {
            while (sc.hasNextLine()){
                line = sc.nextLine();
                tokens = line.split("\\s+");

                for (String token : tokens){
                    /*System.out.print(token.trim() + " ");*/
                    ps.printf("%s ", token);
                    ps.flush();
                }
                System.out.println();
                ps.println();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
