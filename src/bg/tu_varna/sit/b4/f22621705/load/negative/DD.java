package bg.tu_varna.sit.b4.f22621705.load.negative;

import bg.tu_varna.sit.b4.f22621705.load.AA;
import bg.tu_varna.sit.b4.f22621705.load.Load;
import bg.tu_varna.sit.b4.f22621705.open.OpenPGM;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DD implements AA {
    private Load load;

    @Override
    public AA executeLoad(Map<Integer, Set<String>> session) throws IOException {
      /*  load=new Load();
        Set<Map.Entry<Integer, Set<String>>> entries = load.getLoadMap().entrySet();

        //entries.int mapNumber=1;
        Iterator<String> iterator=session.get(load.getMapNumber()).iterator();
        while (iterator.hasNext()){
            System.out.println("Negative!:)");
            //fileOpen=new FileOpen();
            String s=iterator.next();
            if (s.contains(".pbm")){
                new NegativePBM().turnPBMnegative(s);}
            else if(s.contains(".pgm")){
                new NegativePGM().turnPGMnegative(s);}
            else if (s.contains(".ppm")) {
                new NegativePPM().turnPPMnegative(s);}
        }*/return null;
        }


    }
