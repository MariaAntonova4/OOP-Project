package bg.tu_varna.sit.b4.f22621705.load;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;
import sun.nio.ch.Net;

import java.util.*;

public class Session {
    private Map<Integer, Set<NetpbmFiles>>session=new HashMap<>();
    //private ListOfImages listOfImages;
    private int sessionNumber;

    private List<String>commandHistory=new ArrayList<>();

    public List<String> getCommandHistory() {
        return commandHistory;
    }

    /**
     *
     * @param commandName the name of the command which was executed
     */
    public void addInHistory(String commandName){
        commandHistory.add(commandName);
    }

    public void setSessionNumber(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    public Map<Integer, Set<NetpbmFiles>> getSession() {
        return session;
    }

    public void setSession(Map<Integer, Set<NetpbmFiles>> session) {
        this.session = session;
    }
   /* public void getSessionNumber(){
        Set<Map.Entry<Integer, Set<String>>> entries = session.entrySet();

        for(Map.Entry<Integer, Set<String>>entry:entries){
            setSessionNumber(entry.getKey());
        }
    }*/

    /**
     *
     * @param sessionNumber the unique number which will be written in the map of sessions
     * @param fileName the file name which will be written in the map of sessions
     */
        public void createSession(int sessionNumber, NetpbmFiles fileName){
        //listOfImages=new ListOfImages();
        //listOfImages.addImageInSession(fileName);
            Set<NetpbmFiles>images=new HashSet<>();
            images.add(fileName);
            session.put(sessionNumber,images);
        }
}
