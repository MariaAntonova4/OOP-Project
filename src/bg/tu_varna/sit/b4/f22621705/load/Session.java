package bg.tu_varna.sit.b4.f22621705.load;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;

import java.util.*;

public class Session {
    private Map<Integer, Set<NetpbmFiles>>session=new HashMap<>();
    private Map<String,StringBuilder>newData=new HashMap<>();
    private ListOfImages listOfImages;
    private int sessionNumber;

    public Map<String, StringBuilder> getNewData() {
        if (newData.isEmpty()){setNewData(new HashMap<>());}
        return newData;
    }

    /**
     *
     * @param fileName the name of the file
     * @return the modified data
     */
    public StringBuilder saveData(String fileName){
        Set<Map.Entry<String, StringBuilder>>entries = getNewData().entrySet();

        for(Map.Entry<String,StringBuilder>entry:entries){
            if (entry.getKey().equals(fileName)){
                return entry.getValue();}
        }

        return null;
    }
    public void setNewData(Map<String, StringBuilder> newData) {

        this.newData = newData;
    }

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
        listOfImages=new ListOfImages();
        listOfImages.addImageInSession(fileName);
            session.put(sessionNumber,listOfImages.getImagesInSession());
        }

    /**
     *
     * @param fileName the name of the file which was modified
     * @param stringBuilder the new data which was modified
     */
    public void addNewData(String fileName,StringBuilder stringBuilder){
        getNewData();

        newData.put(fileName,stringBuilder);
    }
}
