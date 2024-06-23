package bg.tu_varna.sit.b4.f22621705.load;

import java.util.*;

public class Session {
    private Map<Integer, Set<String>>session=new HashMap<>();
    private Map<String,StringBuilder>newData=new HashMap<>();
    private ListOfImages listOfImages;
    private int sessionNumber;

    public Map<String, StringBuilder> getNewData() {
        if (newData.isEmpty()){setNewData(new HashMap<>());}
        return newData;
    }
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

    public void addInHistory(String commandName){
        commandHistory.add(commandName);
    }

    public void setSessionNumber(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    public Map<Integer, Set<String>> getSession() {
        return session;
    }

    public void setSession(Map<Integer, Set<String>> session) {
        this.session = session;
    }
    public void getSessionNumber(){
        Set<Map.Entry<Integer, Set<String>>> entries = session.entrySet();

        for(Map.Entry<Integer, Set<String>>entry:entries){
            setSessionNumber(entry.getKey());
        }
    }
        public void createSession(int sessionNumber,String fileName){
        listOfImages=new ListOfImages();
        listOfImages.addImageInSession(fileName);
            session.put(sessionNumber,listOfImages.getImagesInSession());
        }
    public void addNewData(String fileName,StringBuilder stringBuilder){
        getNewData();

        newData.put(fileName,stringBuilder);
    }
}
