package bg.tu_varna.sit.b4.f22621705.menu.models.load.factories;

import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.LoadMenu;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.session_info.ShowSessionInfo;

public class SessionConnection extends LoadMenuLauncher {
    @Override
    public LoadMenu aAA() {
        return new ShowSessionInfo();
    }
}
