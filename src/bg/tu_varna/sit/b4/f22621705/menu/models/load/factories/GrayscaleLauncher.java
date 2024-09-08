package bg.tu_varna.sit.b4.f22621705.menu.models.load.factories;

import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.LoadMenu;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.grayscale.Grayscale;

public class GrayscaleLauncher extends LoadMenuLauncher {

    @Override
    public LoadMenu executeLoadCommand() {
        return new Grayscale();
    }
}
