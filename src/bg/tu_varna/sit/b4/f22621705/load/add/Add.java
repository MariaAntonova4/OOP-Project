package bg.tu_varna.sit.b4.f22621705.load.add;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.ListOfImages;
import bg.tu_varna.sit.b4.f22621705.load.Load;
import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.open.OpenedFiles;

import java.io.IOException;
import java.util.*;

public class Add implements LoadCommands {
    private Load load;
    private OpenedFiles openedFiles;

    public Add(OpenedFiles openedFiles) {
        this.openedFiles = openedFiles;
    }

    private Map<Integer, Set<String>> session=new HashMap<>();
    private int mapNumber;
    private ListOfImages listOfImages;

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


        String fileName;
        Scanner scanner=new Scanner(System.in);
        fileName=scanner.nextLine();
        for(Map.Entry<Integer, Set<NetpbmFiles>>entry:entries){
            if (entry.getKey()==sessionNumber){
                if (openedFiles.CheckNamesOfOpenedFiles(fileName)){
                    entry.getValue().add(openedFiles.NamesOfOpenedFiles(fileName));
                }
            }

        }session.addInHistory("add");
        System.out.println("Image "+fileName+" added");
        return null;}

}
