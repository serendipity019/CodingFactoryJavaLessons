package gr.aueb.cf.ch11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PrintStreamWithMethod {
    public static void main(String[] args) {

        //try(PrintStream ps = new PrintStream("/home/kleidimos/java/lesson files/file7-ps.txt", StandardCharsets.UTF_8)) {
        try(PrintStream ps = new PrintStream(new FileOutputStream("/home/kleidimos/java/lesson files/file7-ps.txt",true ), true, StandardCharsets.UTF_8)) {
            /*Sti kenouria methodo vazoume pragmata se ena arxeio xoris
            * na diagrafoume ta proigoumena dedomena pou eixame mesa.(synexizei na prosthetei dedomena)  */
            printMessage(ps, "Hello Coding Factory!");
            printMessage(System.out, "Hello CF!");
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * Generic PrintStream method.
     * @param ps the input PrintStream
     * @param message the input message.
     */
    public static void printMessage(PrintStream ps, String message){
        ps.println(message);
    }
}
