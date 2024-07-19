package bg.tu_varna.sit.b4.f22621705.menu;

public class ConnectWithLoad extends MapClass {
    public ConnectWithLoad() throws CommandException {
    }

    @Override
    public Menu aaa() {
        return new LoadCommand();
    }
}
