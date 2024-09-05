package bg.tu_varna.sit.b4.f22621705.menu.models.load.models.session_info;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.LoadMenu;
import bg.tu_varna.sit.b4.f22621705.files.Session;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ShowSessionInfo implements LoadMenu {
    /**
     *
     * @param session gets the session in which are the files
     * @return
     * @throws IOException
     */
    @Override
    public LoadMenu executeLoad(Session session, int sessionNumber) throws IOException {


        session.addInHistory(sessionNumber,"session info");
        //System.out.println(session.getCommandHistory());
        Set<Map.Entry<Integer,List<String>>>entrySet=session.getCommandHistory().entrySet();
        for (Map.Entry<Integer, List<String>>entry1:entrySet){
            if (entry1.getKey()==sessionNumber){

                Iterator<String> iterator1=entry1.getValue().iterator();

                while (iterator1.hasNext()){
                    String s=iterator1.next();
                    System.out.println(s);
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
                NetpbmFiles s=iterator.next();
                System.out.println(s.getFileName());}
            }
        }

        return null;
    }
}
