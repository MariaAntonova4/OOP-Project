package bg.tu_varna.sit.b4.f22621705.files;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.NetpbmFiles;

import java.util.*;

public class Session {
    private Map<Integer, Set<NetpbmFiles>>session=new HashMap<>();
    private Map<Integer,List<String>>commandHistory=new HashMap<>();

    public Map<Integer,List<String>> getCommandHistory() {
        return commandHistory;
    }

    public Map<Integer, Set<NetpbmFiles>> getSession() {
        return session;
    }

    public void setSession(Map<Integer, Set<NetpbmFiles>> session) {
        this.session = session;
    }
    public void addListOfFiles(int numberSession,Set<NetpbmFiles>newListOfFiles){
        Set<Map.Entry<Integer, Set<NetpbmFiles>>> entries = this.getSession().entrySet();
        for(Map.Entry<Integer,Set<NetpbmFiles>>entry:entries){
            if (entry.getKey()==numberSession){
                entry.setValue(newListOfFiles);
            }
        }
    }

    /**
     *
     * @param commandName the name of the command which was executed
     */
    public void addInHistory(int numberSession,String commandName){
        Set<Map.Entry<Integer,List<String>>>entries=this.commandHistory.entrySet();
        if (commandHistory.keySet().contains(numberSession)){
        for (Map.Entry<Integer,List<String>>entry:entries){
            if (entry.getKey()==numberSession){
            entry.getValue().add(commandName);
            }
        }}else {
            List<String>commands=new ArrayList<>();
            commands.add(commandName);
            commandHistory.put(numberSession,commands);
        }
    }

    public void addFile(int sessionNumber,NetpbmFiles newFile){
        Set<Map.Entry<Integer, Set<NetpbmFiles>>> entries = session.entrySet();
        if (session.keySet().contains(sessionNumber)) {
        for(Map.Entry<Integer, Set<NetpbmFiles>>entry:entries){
            if (entry.getKey()==sessionNumber){
                    entry.getValue().add(newFile);
            }
        }}
        else createSession(sessionNumber,newFile);
    }
    /**
     *
     * @param sessionNumber the unique number which will be written in the map of sessions
     * @param fileName the file name which will be written in the map of sessions
     */
        public void createSession(int sessionNumber, NetpbmFiles fileName){
            Set<NetpbmFiles>images=new HashSet<>();
            images.add(fileName);
            session.put(sessionNumber,images);
        }
}
