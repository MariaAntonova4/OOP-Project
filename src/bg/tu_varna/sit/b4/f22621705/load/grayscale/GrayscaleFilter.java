package bg.tu_varna.sit.b4.f22621705.load.grayscale;

import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.Session;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GrayscaleFilter implements LoadCommands {

    @Override
    public LoadCommands executeLoad(Session session) throws IOException {


        Set<Map.Entry<Integer, Set<String>>> entries = session.getSession().entrySet();

        for(Map.Entry<Integer, Set<String>>entry:entries){
            Iterator<String> iterator=entry.getValue().iterator();
                String s=iterator.next();

                if (s.contains(".ppm")){
                    session.addNewData(s,new Grayscale().turnGrayscale(s));

                }
            }
        return null;}
    }

