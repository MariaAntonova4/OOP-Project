package bg.tu_varna.sit.b4.f22621705.load.negative;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.Session;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NegativeFilter implements LoadCommands {
    /**
     *
     * @param session the session in which the files are put
     * @return
     * @throws IOException
     * the function checks for the format of the file and calls the needed function in new class
     */
    @Override
    public LoadCommands executeLoad(Session session) throws IOException {
       Set<Map.Entry<Integer, Set<NetpbmFiles>>> entries = session.getSession().entrySet();


        for(Map.Entry<Integer, Set<NetpbmFiles>>entry:entries){
            Iterator<NetpbmFiles> iterator=entry.getValue().iterator();

            NetpbmFiles s=iterator.next();
            if (s.getFileName().contains(".pbm")){
                new NegativePBM().turnPBMnegative(s);
                //session.addNewData(s, new NegativePBM().turnPBMnegative(s));
               }
            else if(s.getFileName().contains(".pgm")){
               // session.addNewData(s,new NegativePGM().turnPGMnegative(s));
                }
            else if (s.getFileName().contains(".ppm")) {
                //session.addNewData(s,new NegativePPM().turnPPMnegative(s));
                }

        }
        session.addInHistory("negative");
        return null;

        }
        }
