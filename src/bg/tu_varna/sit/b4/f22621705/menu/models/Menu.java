package bg.tu_varna.sit.b4.f22621705.menu.models;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.PixelException;
import bg.tu_varna.sit.b4.f22621705.menu.CommandException;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.DirectionException;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.switchh.SwitchException;

import java.io.IOException;

public interface Menu {
    Menu execute() throws IOException, CommandException, PixelException, SwitchException, DirectionException;
}
