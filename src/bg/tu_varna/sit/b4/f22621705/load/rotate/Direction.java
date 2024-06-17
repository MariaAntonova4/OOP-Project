package bg.tu_varna.sit.b4.f22621705.load.rotate;

public enum Direction {
    LEFT("left"),RIGHT("right");
    private final String direction;
    Direction(String direction){
        this.direction=direction;
    }
    public String getDirection(){return direction;}
}
