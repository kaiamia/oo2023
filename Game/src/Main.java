import java.util.Scanner;
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

        Scanner scanner = new Scanner(System.in);

        World world = new World(10, 5);
        Player player = new Player(world.width, world.height);
        Dragon dragon = new Dragon(world.width, world.height);
        Orc orc = new Orc(world.width, world.height);

        world.printMap(world.width, world.height,
                player.xCoordinate, player.yCoordinate, player.symbol,
                dragon.xCoordinate, dragon.yCoordinate, dragon.symbol,
                orc.xCoordinate, orc.yCoordinate, orc.symbol);
        String input = scanner.nextLine();

        while (!input.equals("end")){
            player.move(input, world);
            world.printMap(world.width, world.height,
                    player.xCoordinate, player.yCoordinate, player.symbol,
                    dragon.xCoordinate, dragon.yCoordinate, dragon.symbol,
                    orc.xCoordinate, orc.yCoordinate, orc.symbol);
            System.out.println();
            input = scanner.nextLine();
        }
    }

}