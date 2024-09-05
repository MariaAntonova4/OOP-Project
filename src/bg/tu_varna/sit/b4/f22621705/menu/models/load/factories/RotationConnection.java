package bg.tu_varna.sit.b4.f22621705.menu.models.load.factories;

import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.LoadMenu;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.rotate.ChooseDirection;

public class RotationConnection extends LoadMenuLauncher {
    private StringBuilder stringBuilder;

    public RotationConnection(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    @Override
    public LoadMenu aAA() {
        return new ChooseDirection(stringBuilder);
    }
}
