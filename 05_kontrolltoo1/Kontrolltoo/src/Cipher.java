public class Cipher {
    static int nihe;
    static String lause;
    public static final String tahestik = "abcdefghijklmnopqrsštuvõäöüwxyzž";

    public Cipher(int nihe, String lause) {
        Cipher.nihe = nihe;
        Cipher.lause = lause;
    }
    public String cipher(){
        lause = lause.toLowerCase();
        String cipheredMessage = "";
        for (int i = 0; i < lause.length(); i++) {
            if(lause.charAt(i) != ' ' && lause.charAt(i) != '.') {
            int asukoht = tahestik.indexOf(lause.charAt(i));
                int cipheredLocation = (nihe + asukoht) % tahestik.length();
                char cipheredCharacter = tahestik.charAt(cipheredLocation);
                cipheredMessage += cipheredCharacter;
            } else {
                if (lause.charAt(i) == ' '){
                    cipheredMessage += ' ';
                } else {
                    if (lause.charAt(i) == '.'){
                        cipheredMessage += '.';
                    }
                }
            }
        }
        return cipheredMessage;
    }

    public static String decipher(int nihe, String cipheredMessage){
        String decipheredMessage = "";
        for (int i = 0; i < cipheredMessage.length(); i++) {
            if(cipheredMessage.charAt(i) != ' ') {
                int asukoht = tahestik.indexOf(cipheredMessage.charAt(i));
                int location = (asukoht - nihe) % tahestik.length();
                if(location < 0){
                    location += tahestik.length();
                }
                char decipheredCharacter = tahestik.charAt(location);
                decipheredMessage += decipheredCharacter;
            } else {
                decipheredMessage += ' ';
            }
        }
        return decipheredMessage;
    }

}
