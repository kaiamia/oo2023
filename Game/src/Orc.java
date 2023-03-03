public class Orc {
    int xCoordinate;
    int yCoordinate;
    char symbol;
    public Orc(int worldWidth, int worldHeight) {
        this.symbol = 'O';
        this.xCoordinate = getRandomCoordinate(worldWidth);
        this.yCoordinate = getRandomCoordinate(worldHeight);
    }
    private static int getRandomCoordinate(int worldWidth) {
        return (int) (Math.random() * (worldWidth - 2) + 1);
    }
}
