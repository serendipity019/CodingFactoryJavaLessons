package gr.aueb.cf.ch11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PdfBufferedCopyApp {
    public static void main(String[] args) {
        int b = 0;
        int counter = 0;
        long start;
        long end;
        double elapsedTime = 0.0;
        byte[] buffer = new byte[8192]; // 8KB

        try (FileInputStream fis = new FileInputStream("/home/kleidimos/java/lesson files/dummy.pdf");
             FileOutputStream fos = new FileOutputStream("/home/kleidimos/dummyC.pdf")){

            start =System.currentTimeMillis();
            while ((b = fis.read(buffer)) != -1){
                fos.write(buffer,0, b);
                counter++;

            }
            end = System.currentTimeMillis();
            elapsedTime = (end -start) / 1000.0;

            System.out.printf("The file with size %.1fKB (%d bytes) success copy\n", (counter/1024.0), counter);
            System.out.println("Elapsed Time: " + elapsedTime + " seconds");

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
