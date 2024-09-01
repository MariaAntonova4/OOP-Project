package bg.tu_varna.sit.b4.f22621705.menu;

public enum Commands {
   OPEN("open"),LOAD("load"),SAVE("save"),HELP("help"),EXIT("exit"),
    SAVE_AS("save as"),CLOSE("close");
      private final String command;

    Commands(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}
