package bg.tu_varna.sit.b4.f22621705.menu;

import bg.tu_varna.sit.b4.f22621705.open.OpenedFiles;

public class ConnectWithOpen extends MapClass {
    public ConnectWithOpen() throws CommandException {
    }

    @Override
    public Menu aaa() {
        return new Open();
    }
}
