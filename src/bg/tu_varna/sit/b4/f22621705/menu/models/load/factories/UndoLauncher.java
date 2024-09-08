package bg.tu_varna.sit.b4.f22621705.menu.models.load.factories;

import bg.tu_varna.sit.b4.f22621705.menu.models.load.Load;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.LoadMenu;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.undo.Undo;

public class UndoLauncher extends LoadMenuLauncher {
    private Load load;

    public UndoLauncher(Load load) {
        this.load = load;
    }

    @Override
    public LoadMenu executeLoadCommand() {
        return new Undo(load);
    }
}
