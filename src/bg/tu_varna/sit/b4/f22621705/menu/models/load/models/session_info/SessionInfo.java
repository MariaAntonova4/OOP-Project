package bg.tu_varna.sit.b4.f22621705.menu.models.load.models.session_info;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.LoadMenu;
import bg.tu_varna.sit.b4.f22621705.files.Session;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SessionInfo implements LoadMenu {
    /**
     *
     * @param session gets the session in which are the files
     * @param sessionNumber the number of the current session
     * @throws IOException
     * finds the current's session history and prints it. Prints the number of the
     * session number. Finds the session and prints all the images in it
     */
    @Override
    public LoadMenu executeLoad(Session session, int sessionNumber) throws IOException {
        session.addInHistory(sessionNumber,"session info");
        Set<Map.Entry<Integer,List<String>>>entrySet=session.getCommandHistory().entrySet();
        for (Map.Entry<Integer, List<String>>entry1:entrySet){
            if (entry1.getKey()==sessionNumber){
                Iterator<String> iteratorCommand=entry1.getValue().iterator();
                while (iteratorCommand.hasNext()){
                    String commandName=iteratorCommand.next();
                    System.out.println(commandName);
                }
            }
        }
        Set<Map.Entry<Integer, Set<NetpbmFiles>>> entries = session.getSession().entrySet();
        System.out.println("Session Number:"+sessionNumber);
        for(Map.Entry<Integer, Set<NetpbmFiles>>entry:entries){

            if (entry.getKey()==sessionNumber){
                Iterator<NetpbmFiles> iterator=entry.getValue().iterator();
                System.out.println("Name of images in the session:");
                while (iterator.hasNext()){
                NetpbmFiles netpbmFiles=iterator.next();
                System.out.println(netpbmFiles.getFileName());}
            }
        }

        return null;
    }
}
