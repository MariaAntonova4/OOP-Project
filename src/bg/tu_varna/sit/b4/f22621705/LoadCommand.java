package bg.tu_varna.sit.b4.f22621705;

import bg.tu_varna.sit.b4.f22621705.load.Load;
import bg.tu_varna.sit.b4.f22621705.load.Session;

import java.io.IOException;
import java.util.Scanner;

public class LoadCommand implements Menu {
    private Session session;

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public Menu execute(Session session) throws IOException {
        String fileName;
        System.out.println("Please enter the name of the file which you want to load: ");
        Scanner scanner=new Scanner(System.in);
        fileName=scanner.nextLine();
        return new Load(session).exe(fileName,session);
    }
}
