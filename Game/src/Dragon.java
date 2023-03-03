public class Dragon {
    int xCoordinate;
    int yCoordinate;
    char symbol;
    public Dragon(int worldWidth, int worldHeight) {
        this.symbol = 'D';
        this.xCoordinate = getRandomCoordinate(worldWidth);
        this.yCoordinate = getRandomCoordinate(worldHeight);
    }
    private static int getRandomCoordinate(int worldWidth) {
        return (int) (Math.random() * (worldWidth - 2) + 1);
    }
}
