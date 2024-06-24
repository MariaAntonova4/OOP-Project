package bg.tu_varna.sit.b4.f22621705;

public class ConnectWithSave extends MapClass {
    public ConnectWithSave() throws CommandException {
    }

    @Override
    public Menu aaa() {
        return new Save();
    }
}
