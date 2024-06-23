package bg.tu_varna.sit.b4.f22621705;

import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.save.SaveInFile;
import bg.tu_varna.sit.b4.f22621705.save.SaveInNewFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Save implements Menu {
    private Session session;

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        if (session==null){
            session=new Session();
        }else this.session = session;
    }

    @Override
    public Menu execute(Session session2) throws IOException {

        /*System.out.println("Please enter the name of the file which you want to save: ");
        */
        //File file=new File(fileName);
        //if (file.exists()){}
        return new SaveInFile(session2).saveFile(session2);
    }
}
