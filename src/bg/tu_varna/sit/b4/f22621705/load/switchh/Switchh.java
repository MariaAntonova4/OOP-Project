package bg.tu_varna.sit.b4.f22621705.load.switchh;

import bg.tu_varna.sit.b4.f22621705.load.AA;
import bg.tu_varna.sit.b4.f22621705.load.Session;

import java.io.IOException;

public class Switchh implements AA {
    private Session newSession;

    public Session getNewSession() {
        return newSession;
    }

    public void setNewSession(Session newSession) {
        this.newSession = newSession;
    }

    @Override
    public AA executeLoad(Session session) throws IOException {
        newSession=new Session();

        return null;
    }
    @Override
    public StringBuilder result() {
        return result();
    }

    @Override
    public void setResult(StringBuilder result) {
        this.result();
    }
}
