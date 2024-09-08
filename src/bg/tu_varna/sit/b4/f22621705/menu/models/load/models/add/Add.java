package bg.tu_varna.sit.b4.f22621705.menu.models.load.models.add;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.LoadMenu;
import bg.tu_varna.sit.b4.f22621705.menu.factories.CloseLauncher;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.Load;
import bg.tu_varna.sit.b4.f22621705.files.Session;
import bg.tu_varna.sit.b4.f22621705.files.OpenedFiles;

import java.io.IOException;
import java.util.*;

public class Add implements LoadMenu {
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

    public Map<Integer, Set<String>> getSession() {
        return session;
    }

    public void setSession(Map<Integer, Set<String>> session) {
        this.session = session;
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
     * @param sessionNumber the number of the current session
     * @throws IOException
     * The function adds new file in the session's set of files and writes the commands name
     * in the session's history and prints message
     */
    @Override
    public LoadMenu executeLoad(Session session, int sessionNumber) throws IOException {

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
