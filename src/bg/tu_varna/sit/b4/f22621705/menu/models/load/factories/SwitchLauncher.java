package bg.tu_varna.sit.b4.f22621705.menu.models.load.factories;

import bg.tu_varna.sit.b4.f22621705.menu.models.load.Load;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.LoadMenu;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.switchh.Switchh;
import com.sun.org.apache.xpath.internal.operations.String;

public class SwitchLauncher extends LoadMenuLauncher {
    private Load load;
    private StringBuilder stringBuilder;

    public SwitchLauncher(Load load,StringBuilder stringBuilder) {
        this.load = load;
        this.stringBuilder=stringBuilder;
    }

    @Override
    public LoadMenu executeLoadCommand() {
        return new Switchh(load,stringBuilder);
    }
}
