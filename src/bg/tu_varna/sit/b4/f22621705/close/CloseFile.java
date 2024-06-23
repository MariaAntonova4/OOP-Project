package bg.tu_varna.sit.b4.f22621705.close;

import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.save.SaveInPBMFile;
import bg.tu_varna.sit.b4.f22621705.save.SaveInPGMFile;
import bg.tu_varna.sit.b4.f22621705.save.SaveInPPMFile;

import java.io.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CloseFile {
    public void closeFile(Session session) throws IOException {
            Set<Map.Entry<Integer, Set<String>>> entries = session.getSession().entrySet();

            for(Map.Entry<Integer, Set<String>>entry:entries){
                Iterator<String>iterator2=entry.getValue().iterator();
                String str=iterator2.next();
                FileReader fileReader=new FileReader(str);
                fileReader.close();
                System.out.println("Successfully closed "+str);
    }
    }
}
