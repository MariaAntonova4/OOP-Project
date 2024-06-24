package bg.tu_varna.sit.b4.f22621705;

import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.save.SaveInFile;

import java.io.IOException;


public class Save implements Menu {
    private Session session;

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        if (session==null){
            this.session=new Session();
        }else this.session = session;
    }

    @Override
    public Menu execute(Session session2) throws IOException {

        return new SaveInFile(session2).saveFile(session2);
    }
}
