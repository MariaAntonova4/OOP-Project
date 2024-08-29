package bg.tu_varna.sit.b4.f22621705.load.switchh;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.Session;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Switchh implements LoadCommands {
    private int sessionNumber;
    private Session newSession;

    public Switchh(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    public int getSessionNumber() {
        return sessionNumber;
    }

    public void setSessionNumber(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    public Session getNewSession() {
        return newSession;
    }

    public void setNewSession(Session newSession) {
        this.newSession = newSession;
    }

    @Override
    public LoadCommands executeLoad(Session session,int sessionNumber) throws IOException {
        Set<Map.Entry<Integer, Set<NetpbmFiles>>> entries = session.getSession().entrySet();


        int newSessionNumber;
        Scanner scanner=new Scanner(System.in);
        newSessionNumber= Integer.parseInt(scanner.nextLine());
        for(Map.Entry<Integer, Set<NetpbmFiles>>entry:entries){
            if (entry.getKey()==newSessionNumber){
                setSessionNumber(newSessionNumber);
                break;
            }
            else {
                System.out.println("There is No such number");
            }
        }session.addInHistory(sessionNumber,"switch");
        return null;
    }

}
