package bg.tu_varna.sit.b4.f22621705.load.negative;

import bg.tu_varna.sit.b4.f22621705.load.AA;
import bg.tu_varna.sit.b4.f22621705.load.Load;
import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.load.grayscale.Grayscale;
import bg.tu_varna.sit.b4.f22621705.open.OpenPGM;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DD implements AA {

    @Override
    public AA executeLoad(Session session) throws IOException {
        Set<Map.Entry<Integer, Set<String>>> entries = session.getSession().entrySet();


        for(Map.Entry<Integer, Set<String>>entry:entries){
            Iterator<String> iterator=entry.getValue().iterator();

            String s=iterator.next();
            if (s.contains(".pbm")){
                new NegativePBM().turnPBMnegative(s);}
            else if(s.contains(".pgm")){
                new NegativePGM().turnPGMnegative(s);}
            else if (s.contains(".ppm")) {
                new NegativePPM().turnPPMnegative(s);}

        }
        session.addInHistory("negative");
        return null;

        }
        }
