package bg.tu_varna.sit.b4.f22621705.menu.models.load.factories;

import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.LoadMenu;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.negative.NegativeFilter;

public class ConnectWithNegative extends LoadMenuLauncher {
    @Override
    public LoadMenu aAA() {
        return new NegativeFilter();
    }
}
