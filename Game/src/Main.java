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

        int worldWidth = 10;
        int worldHeigth = 5;

        int playerXCoordinate = getRandomCoordinate(worldWidth);
        int playerYCoordinate = getRandomCoordinate(worldHeigth); //castimine ehk teisendamine ühest tüübist teise
        char playerSymbol = 'X';
        int dragonXCoordinate = getRandomCoordinate(worldWidth);
        int dragonYCoordinate = getRandomCoordinate(worldHeigth);
        char dragonSymbol = 'D';
        int orcXCoordinate = getRandomCoordinate(worldWidth);
        int orcYCoordinate = getRandomCoordinate(worldHeigth);
        char orcSymbol = 'O';
        
        // algväärtus    kuni   iga tsükkel
        for (int y = 0; y < worldHeigth; y++) {
            System.out.println();
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeigth-1) {
                    System.out.print("-");
                } else if (x == 0 || x == worldWidth-1) {
                    System.out.print("|");
                } else {
                    // ctrl + alt + m
                    // parem klõps -> refractor -> extract method
                    printCharacters(playerXCoordinate, playerYCoordinate, playerSymbol,
                            dragonXCoordinate, dragonYCoordinate, dragonSymbol,
                            orcXCoordinate, orcYCoordinate, orcSymbol, y, x);
                }
            }
        }
    }

    private static int getRandomCoordinate(int worldWidth) {
        return (int) (Math.random() * (worldWidth - 2) + 1);
    }

    // void on tagastustüüp ehk mis tüüp järgneb return kirjele
    // tähendab, et ei tagastata midagi
    private static void printCharacters(int playerXCoordinate, int playerYCoordinate, char playerSymbol,
                                        int dragonXCoordinate, int dragonYCoordinate, char dragonSymbol,
                                        int orcXCoordinate, int orcYCoordinate, char orcSymbol, int mapY, int mapX) {
        if (playerXCoordinate == mapX && playerYCoordinate == mapY) {
            System.out.print(playerSymbol);
        } else if (dragonXCoordinate == mapX && dragonYCoordinate == mapY) {
            System.out.print(dragonSymbol);
        } else if (orcXCoordinate == mapX && orcYCoordinate == mapY) {
            System.out.print(orcSymbol);
        } else {
            System.out.print(" ");
        }
    }
}