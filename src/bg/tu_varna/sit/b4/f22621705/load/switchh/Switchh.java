package bg.tu_varna.sit.b4.f22621705.load.switchh;

import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.Session;

import java.io.IOException;

public class Switchh implements LoadCommands {
    private Session newSession;

    public Session getNewSession() {
        return newSession;
    }

    public void setNewSession(Session newSession) {
        this.newSession = newSession;
    }

    @Override
    public LoadCommands executeLoad(Session session) throws IOException {
        newSession=new Session();

        return null;
    }

}
