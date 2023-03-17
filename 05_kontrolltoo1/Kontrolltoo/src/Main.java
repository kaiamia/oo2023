public class Main {
    //variant: Šifreerija/dešifreerija (cipher, decipher)
    //* Luua klass, mis muudaks ette antava lause tähestiku ulatuses mingisuguse nihkega arusaamatuks (näiteks nihe 1, kus kõik “a”-d muudetakse “b”-deks, “d”-d muudetakse “e”-deks jne)
    //* Samuti eksisteeriks ka dešifreerija, et võimalik nihke ette andmisel funktsiooni selle sama sisendi tagasi muutma arusaadavaks
    //* Lugeda failist esimesel real oleva nihke numbri ning ülejäänud read selle nihke abil šifreerida ning salvestada šifreeritud kujul teise faili.
    public static void main(String[] args) {
        Cipher  cipher = new Cipher(2, "Luua klass");

        String šifeeritudS6num = cipher.šifreeri();
        System.out.println(šifeeritudS6num);


    }
}