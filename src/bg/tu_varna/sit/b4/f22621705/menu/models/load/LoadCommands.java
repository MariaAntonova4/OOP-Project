package bg.tu_varna.sit.b4.f22621705.menu.models.load;
public enum LoadCommands {
    NEGATIVE("negative"),ROTATE("rotate"),GRAYSCALE("grayscale"),
    MONOCHROME("monochrome"),UNDO("undo"),ADD("add"),
    SESSION_INFO("session info"),SWITCH("switch"),COLLAGE("collage");
    private final String loadCommand;
    LoadCommands(String loadCommand) {
        this.loadCommand=loadCommand;
    }

    public String getLoadCommand() {
        return loadCommand;
    }
}