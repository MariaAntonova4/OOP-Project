package bg.tu_varna.sit.b4.f22621705.load.session_info;

import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.Load;
import bg.tu_varna.sit.b4.f22621705.load.Session;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class ShowSessionInfo implements LoadCommands {
    /**
     *
     * @param session gets the session in which are the files
     * @return
     * @throws IOException
     */
    @Override
    public LoadCommands executeLoad(Session session) throws IOException {


        session.addInHistory("session info");
        System.out.println(session.getCommandHistory());

        Set<Map.Entry<Integer, Set<String>>> entries = session.getSession().entrySet();

        for(Map.Entry<Integer, Set<String>>entry:entries){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        return null;
    }
}
