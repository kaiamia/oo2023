public class Item implements WorldObject {
    int xCoordinate;
    int yCoordinate;
    int strength;
    int durability;
    String name;
    public Item(int strength, int durability, String name, int worldWidth, int worldHeight) {
        this.xCoordinate = getRandomCoordinate(worldWidth);
        this.yCoordinate = getRandomCoordinate(worldHeight);
        this.strength = strength;
        this.durability = durability;
        this.name = name;
    }
    public int getRandomCoordinate(int worldWidth) {
        //castimine ehk teisendamine ühest tüübist teise
        return (int) (Math.random() * (worldWidth - 2) + 1);
    }
}
