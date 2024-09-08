package bg.tu_varna.sit.b4.f22621705.menu.models.load.models.switchh;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.Load;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.LoadMenu;
import bg.tu_varna.sit.b4.f22621705.files.Session;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Switchh implements LoadMenu {
    private Load load;
    private StringBuilder stringBuilder;

    public Switchh(Load load,StringBuilder stringBuilder) {
        this.load = load;
        this.stringBuilder=stringBuilder;
    }

    /**
     *
     * @param session the session
     * @param sessionNumber the session number
     * @return
     * @throws IOException
     * finds the old session number and sets new session number.If the old number is not
     * founded a message is written. The command name is added in the session history
     */
    @Override
    public LoadMenu executeLoad(Session session, int sessionNumber) throws IOException,SwitchException {
        Set<Map.Entry<Integer, Set<NetpbmFiles>>> entries = session.getSession().entrySet();
        int newSessionNumber= Integer.parseInt(stringBuilder.substring(stringBuilder.indexOf(" ")+1, stringBuilder.length()));

        for(Map.Entry<Integer, Set<NetpbmFiles>>entry:entries){
            if (entry.getKey()==newSessionNumber){
                load.setMapNum(newSessionNumber);
                System.out.println("The session are switched");
                break;
            }
            else {
                throw new SwitchException("There is No such number");
            }
        }session.addInHistory(sessionNumber,"switch");
        return null;
    }

}
