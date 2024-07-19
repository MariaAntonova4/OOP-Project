package bg.tu_varna.sit.b4.f22621705.load.negative;

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
        Set<Map.Entry<Integer, Set<String>>> entries = session.getSession().entrySet();


        for(Map.Entry<Integer, Set<String>>entry:entries){
            Iterator<String> iterator=entry.getValue().iterator();

            String s=iterator.next();
            if (s.contains(".pbm")){
                session.addNewData(s, new NegativePBM().turnPBMnegative(s));
               }
            else if(s.contains(".pgm")){
                session.addNewData(s,new NegativePGM().turnPGMnegative(s));
                }
            else if (s.contains(".ppm")) {
                session.addNewData(s,new NegativePPM().turnPPMnegative(s));
                }

        }
        session.addInHistory("negative");
        return null;

        }
        }
