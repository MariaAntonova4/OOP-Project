package bg.tu_varna.sit.b4.f22621705.load;
public enum LoadCommand {
    NEGATIVE("negative"),ROTATE("rotate"),GRAYSCALE("grayscale"),
    MONOCHROME("monochrome"),UNDO("undo"),ADD("add"),
    SESSION_INFO("session info"),SWITCH("switch"),COLLAGE("collage");
    private final String loadCommand;
    LoadCommand(String loadCommand) {
        this.loadCommand=loadCommand;
    }

    public String getLoadCommand() {
        return loadCommand;
    }
}