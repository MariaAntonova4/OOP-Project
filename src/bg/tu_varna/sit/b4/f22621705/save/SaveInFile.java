package bg.tu_varna.sit.b4.f22621705.save;

import bg.tu_varna.sit.b4.f22621705.Menu;
import bg.tu_varna.sit.b4.f22621705.load.AA;
import bg.tu_varna.sit.b4.f22621705.load.EE;
import bg.tu_varna.sit.b4.f22621705.load.Session;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SaveInFile{
    private Session session;
    private EE ee;
    private AA aa;

    public SaveInFile(Session session) {
        this.session = session;
    }

    public Menu saveFile(String fileName) throws IOException {
        Iterator<String>iterator=session.getCommandHistory().iterator();
        while (iterator.hasNext()){
            String s= iterator.next();
            ee.commands(s,session);

            Set<Map.Entry<Integer, Set<String>>> entries = session.getSession().entrySet();

            for(Map.Entry<Integer, Set<String>>entry:entries){
                Iterator<String>iterator2=entry.getValue().iterator();
                String str=iterator2.next();
        if (s.contains(".pbm")){
            SaveInPBMFile saveInPBMFile=new SaveInPBMFile();
            saveInPBMFile.saveFile(str,aa.result());
        }
        else if (s.contains(".pgm")) {
            SaveInPGMFile saveInPGMFile=new SaveInPGMFile();
            saveInPGMFile.saveFile(str,aa.result());
        } else if (s.contains(".ppm")) {
            SaveInPPMFile saveInPPMFile=new SaveInPPMFile();
            saveInPPMFile.saveFile(str,aa.result());
        }}}
        return null;
    }
}
