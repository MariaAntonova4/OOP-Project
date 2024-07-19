package bg.tu_varna.sit.b4.f22621705.save;

import bg.tu_varna.sit.b4.f22621705.menu.Menu;
import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.ConnectWithLoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.Session;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SaveInFile{
    private Session session;
    private ConnectWithLoadCommands ee;
    private LoadCommands aa;

    public LoadCommands getAa() {
        return aa;
    }

    public void setAa(LoadCommands aa) {
        this.aa = aa;
    }

    public ConnectWithLoadCommands getEe() {
        return ee;
    }

    public void setEe(ConnectWithLoadCommands ee) {
        this.ee = ee;
    }

    public SaveInFile(Session session) {
        this.session = session;
    }

    /**
     *
     * @param session the session with the files
     * @return
     * @throws IOException
     * The function checks the format of the file and calls save method for the file format
     */
    public Menu saveFile(Session session) throws IOException {
        Iterator<String>iterator=session.getCommandHistory().iterator();
        while (iterator.hasNext()){
            String s= iterator.next();

            Set<Map.Entry<Integer, Set<String>>> entries = session.getSession().entrySet();

            for(Map.Entry<Integer, Set<String>>entry:entries){
                Iterator<String>iterator2=entry.getValue().iterator();
                String str=iterator2.next();
        if (str.contains(".pbm")){
            SaveInPBMFile saveInPBMFile=new SaveInPBMFile();
            saveInPBMFile.saveFile(str,session.saveData(str));
        }
        else if (str.contains(".pgm")) {
            SaveInPGMFile saveInPGMFile=new SaveInPGMFile();
            saveInPGMFile.saveFile(str,session.saveData(str));
        } else if (str.contains(".ppm")) {
            SaveInPPMFile saveInPPMFile=new SaveInPPMFile();
            saveInPPMFile.saveFile(str,session.saveData(str));
        }}}
        return null;
    }
}
