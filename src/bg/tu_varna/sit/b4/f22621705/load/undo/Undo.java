package bg.tu_varna.sit.b4.f22621705.load.undo;

import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.Session;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class Undo implements LoadCommands {
    @Override
    public LoadCommands executeLoad(Session session,int sessionNumber) throws IOException {
       // Set<Map.Entry<String,StringBuilder>> entries = session.getNewData().entrySet();

       // for(Map.Entry<String,StringBuilder>entry:entries){
            //entries.remove(entry.getValue());
        //}
        return null;
    }
}
