package bg.tu_varna.sit.b4.f22621705.menu.models.load.factories;

import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.LoadMenu;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.rotate.Rotate;

public class RotationLauncher extends LoadMenuLauncher {
    private StringBuilder stringBuilder;

    public RotationLauncher(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    @Override
    public LoadMenu executeLoadCommand() {
        return new Rotate(stringBuilder);
    }
}
