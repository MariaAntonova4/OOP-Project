package bg.tu_varna.sit.b4.f22621705;

import bg.tu_varna.sit.b4.f22621705.load.Session;

import java.io.IOException;

public interface Menu {
    Menu execute(Session session)throws IOException;
}
