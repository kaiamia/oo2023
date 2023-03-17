public class Cipher {
    int nihe;
    String lause;
    public static final String tahestik = "abcdefghijklmnopqrsštuvõäöüwxyzž";

    public Cipher(int nihe, String lause) {
        this.nihe = nihe;
        this.lause = lause;
    }
    public String šifreeri(){
        lause = lause.toLowerCase();
        String šifeeritudLause = "";
        for (int i = 0; i < lause.length(); i++) {
            int asukoht = tahestik.indexOf(lause.charAt(i));
            int šifeeritudAsukoht = (nihe + asukoht) % tahestik.length();
            char šifeeritudTaht = tahestik.charAt(šifeeritudAsukoht);
            šifeeritudLause += šifeeritudTaht;
        }
        return šifeeritudLause;
    }
}
