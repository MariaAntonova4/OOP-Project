package bg.tu_varna.sit.b4.f22621705.menu.models.load.factories;

import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.LoadMenu;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.negative.Negative;

public class NegativeLauncher extends LoadMenuLauncher {
    @Override
    public LoadMenu executeLoadCommand() {
        return new Negative();
    }
}
