import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter(new FileWriter("valjund1.txt"));
        pw.println("Terereterere");
        pw.print(" Juku ");
        pw.println(" Kuku ");
        pw.print("Uus rida");
        pw.close();
        
    }
}