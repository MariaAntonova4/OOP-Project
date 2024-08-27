package bg.tu_varna.sit.b4.f22621705.load.session_info;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.Load;
import bg.tu_varna.sit.b4.f22621705.load.Session;
import sun.nio.ch.Net;

import java.io.IOException;
import java.util.Iterator;
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
    public LoadCommands executeLoad(Session session,int sessionNumber) throws IOException {


        session.addInHistory("session info");
        System.out.println(session.getCommandHistory());

        Set<Map.Entry<Integer, Set<NetpbmFiles>>> entries = session.getSession().entrySet();

        for(Map.Entry<Integer, Set<NetpbmFiles>>entry:entries){
            System.out.println("Session Number:"+sessionNumber);
            if (entry.getKey()==sessionNumber){
                Iterator<NetpbmFiles> iterator=entry.getValue().iterator();

                NetpbmFiles s=iterator.next();
                System.out.println("Name of images in the session:");
                System.out.println(s.getFileName());
            }
        }

        return null;
    }
}
