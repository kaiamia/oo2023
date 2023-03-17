import java.io.*;

public class Main {
    //variant: Šifreerija/dešifreerija (cipher, decipher)
    //* Luua klass, mis muudaks ette antava lause tähestiku ulatuses mingisuguse nihkega arusaamatuks (näiteks nihe 1, kus kõik “a”-d muudetakse “b”-deks, “d”-d muudetakse “e”-deks jne)
    //* Samuti eksisteeriks ka dešifreerija, et võimalik nihke ette andmisel funktsiooni selle sama sisendi tagasi muutma arusaadavaks
    //* Lugeda failist esimesel real oleva nihke numbri ning ülejäänud read selle nihke abil šifreerida ning salvestada šifreeritud kujul teise faili.
    public static void main(String[] args)  throws IOException {
        Cipher cipherMessage = new Cipher(2, "talv");

        //Punkt 1:
        String cipheredMessage = cipherMessage.cipher();
        System.out.println("Originaal: " + Cipher.lause);
        System.out.println("Šifreeritud lause: " + cipheredMessage);

        //Punkt 2:
        String decipheredMessage = Cipher.decipher(2,  cipheredMessage);
        System.out.println("Šifreeritud lause: " + cipheredMessage);
        System.out.println("Dešifreeritud lause: " + decipheredMessage);

        //Punkt 3:
        BufferedReader br = new BufferedReader(new FileReader("lugemine.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("valjund.txt"));

        String nihe = br.readLine();
        int uusNihe = Integer.parseInt(nihe);
        System.out.println("Failist loetud teksti šifreerime nihkega: " + nihe);

        String rida = br.readLine();
        pw.println("Šifreeritud tekst:");

        while (rida != null) {
            Cipher faili = new Cipher(uusNihe, rida);
            String cipheredRida = faili.cipher();
            pw.println(cipheredRida);
            rida = br.readLine();
        }
        pw.close();
    }
}