public class Main {

    //fori
    //sout
    //println teeb uue rea; print jätkab samal
    //println() tühjana teeb lihtsalt uue rea
    // || - või
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //String sonaline = "Sõnaline muutuja";
        //char taheline = 's'; //üks täht
        //double komakohaga = 4213.234424131;
        //float komakohaga2 = 313.1232212F;
        //boolean kahendv22rtus = true; // 0 ja 1  "y" "n"
        //byte pisikeNumber = 100;
        //short lyhikeNumber = 312;
        //long pikkNumber = 31313131313L;

        int playerXCoordinate = 3;
        int playerYCoordinate = 3;
        int dragonXCoordinate = 6;
        int dragonYCoordinate = 2;
        int orcXCoordinate = 5;
        int orcYCoordinate = 1;


        // algväärtus    kuni   iga tsükkel
        for (int y = 0; y < 5; y++) {
            System.out.println();
            for (int x = 0; x < 10; x++) {
                if (y == 0 || y == 4) {
                    System.out.print("-");
                } else if (x == 0 || x == 9) {
                    System.out.print("|");
                } else {
                    if (playerXCoordinate == x && playerYCoordinate == y) {
                        System.out.print("X");
                    } else if (dragonXCoordinate == x && dragonYCoordinate == y) {
                        System.out.print("D");
                    } else if (orcXCoordinate == x && orcYCoordinate == y) {
                        System.out.print("O");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}