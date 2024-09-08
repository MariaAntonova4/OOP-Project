package bg.tu_varna.sit.b4.f22621705.menu.models.load.models;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.PixelException;
import bg.tu_varna.sit.b4.f22621705.files.Session;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.switchh.SwitchException;

import java.io.IOException;

public interface LoadMenu {
    LoadMenu executeLoad(Session session, int sessionNumber) throws IOException, PixelException, SwitchException, DirectionException;

}
