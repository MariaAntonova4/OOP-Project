package bg.tu_varna.sit.b4.f22621705.load;

import java.util.*;

public class Session {
    private Map<Integer, Set<String>>session=new HashMap<>();
    private ListOfImages listOfImages;
    private int sessionNumber;

    public ListOfImages getListOfImages() {
        return listOfImages;
    }

    public void setListOfImages(ListOfImages listOfImages) {
        this.listOfImages = listOfImages;
    }

    // private Map<Integer, List<String>>sessionHistory=new HashMap<>();
    private List<String>commandHistory=new ArrayList<>();

    public List<String> getCommandHistory() {
        return commandHistory;
    }

    public void setCommandHistory(List<String> commandHistory) {
        this.commandHistory = commandHistory;
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
}
