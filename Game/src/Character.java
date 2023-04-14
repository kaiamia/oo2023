public class Character implements  WorldObject {
    int xCoordinate;
    int yCoordinate;
    char symbol;
    public Character(int worldWidth, int worldHeight, char symbol) {
        this.symbol = 'O';
        this.xCoordinate = getRandomCoordinate(worldWidth);
        this.yCoordinate = getRandomCoordinate(worldHeight);
        this.symbol = symbol;
    }
    public int getRandomCoordinate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);
    }
}
