package bg.tu_varna.sit.b4.f22621705.load.add;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.close.Close;
import bg.tu_varna.sit.b4.f22621705.load.Load;
import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.open.OpenedFiles;

import java.io.IOException;
import java.util.*;

public class Add implements LoadCommands {
    private Load load;
    private String fileName;
    private OpenedFiles openedFiles;
    private StringBuilder stringBuilder;
    public Add(OpenedFiles openedFiles,StringBuilder stringBuilder) {
        this.openedFiles = openedFiles;
        this.stringBuilder=stringBuilder;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    private Map<Integer, Set<String>> session=new HashMap<>();
    private int mapNumber;
    private Close listOfImages;

    public Map<Integer, Set<String>> getSession() {
        return session;
    }

    public void setSession(Map<Integer, Set<String>> session) {
        this.session = session;
    }

    public int getMapNumber() {
        return mapNumber;
    }

    public void setMapNumber(int mapNumber) {
        this.mapNumber = mapNumber;
    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    public String fileName(String fileName){
        if (fileName==null){
            return getStringBuilder().substring((getStringBuilder().indexOf(" ")+1),getStringBuilder().length());
        }
        else return fileName;
        }
    /**
     *
     * @param session the session with the needed files
     * @return
     * @throws IOException
     * The function adds new file in the session's set for files
     */
    @Override
    public LoadCommands executeLoad(Session session,int sessionNumber) throws IOException {

        Set<Map.Entry<Integer, Set<NetpbmFiles>>> entries = session.getSession().entrySet();

        for(Map.Entry<Integer, Set<NetpbmFiles>>entry:entries){
            if (entry.getKey()==sessionNumber){
                if (openedFiles.CheckNamesOfOpenedFiles(fileName(fileName))){
                    entry.getValue().add(openedFiles.NamesOfOpenedFiles(fileName(fileName)));
                }
            }

        }session.addInHistory(sessionNumber,"add "+fileName(fileName));
        System.out.println("Image "+fileName(fileName)+" added");
        fileName=null;
        return null;}

}
