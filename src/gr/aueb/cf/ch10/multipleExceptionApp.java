package gr.aueb.cf.ch10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class multipleExceptionApp {
    public static void main(String[] args) {
        File file = new File("C:/tmp/file.txt");

        try (Scanner fl = new Scanner(file)){
            char ch = (char) System.in.read();
            int num = fl.nextInt();
        } catch (FileNotFoundException | InputMismatchException e) {
            System.err.println("Error. File not found or Input Mismatch" + e.getMessage() );
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("IO Exception" + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Generic error" + e.getMessage());
            e.printStackTrace();
        }
    }
}
