package bg.tu_varna.sit.b4.f22621705.load.monochrome;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.Session;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MonochromeFilter implements LoadCommands {
    /**
     *
     * @param session the session with the files in it
     * @return
     * @throws IOException
     * the function checks the format of the file and calls the needed function in new class
     */
    @Override
    public LoadCommands executeLoad(Session session) throws IOException {
        Set<Map.Entry<Integer, Set<NetpbmFiles>>> entries = session.getSession().entrySet();


        for(Map.Entry<Integer, Set<NetpbmFiles>>entry:entries){
            Iterator<NetpbmFiles> iterator=entry.getValue().iterator();

            NetpbmFiles s=iterator.next();
            if(s.getFileName().contains(".pgm")){
                //session.addNewData("",new MonochromePGM().turnMonochrome(""));
            }
            else if (s.getFileName().contains(".ppm")) {
               // session.addNewData("",new MonochromePPM().turnMonochrome(""));
            }

        }
        session.addInHistory("monochrome");
        return null;
    }
}
