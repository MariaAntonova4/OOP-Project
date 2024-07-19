package bg.tu_varna.sit.b4.f22621705.menu;

import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.open.CheckFile;

import java.io.IOException;
import java.util.Scanner;

public class Open implements Menu {
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
    public Menu execute(Session session) throws IOException {
            String fileName;
            //System.out.println("Please enter the name of the file which you want to open: ");
            Scanner scanner=new Scanner(System.in);
            fileName=scanner.nextLine();

            return new CheckFile().checkIfFileExists(fileName);
        }
    }

