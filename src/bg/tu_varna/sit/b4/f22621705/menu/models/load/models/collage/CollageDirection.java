package bg.tu_varna.sit.b4.f22621705.menu.models.load.models.collage;

public enum CollageDirection {
    HORIZONTAL("horizontal"),VERTICAL("vertical");
    private final String collageDirection;

    CollageDirection(String collageDirection) {
        this.collageDirection = collageDirection;
    }

    public String getCollageDirection() {
        return collageDirection;
    }
}
