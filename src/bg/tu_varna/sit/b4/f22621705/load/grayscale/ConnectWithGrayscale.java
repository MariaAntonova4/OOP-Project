package bg.tu_varna.sit.b4.f22621705.load.grayscale;

import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.ConnectWithLoadCommands;

public class ConnectWithGrayscale extends ConnectWithLoadCommands {

    @Override
    public LoadCommands aAA() {
        return new GrayscaleFilter();
    }
}
