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

    /**
     *
     * @param numberSession - the number of yhe current session
     * @param newListOfFiles- set of new files
     *                      the method adds set of files in the current session
     */
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
     * @param numberSession - shows the number of the current session
     * @param commandName- shows the name of the command that has to be added
     *                   the method adds the name of the last executed command. If there
     *                   is not a created list for the session yet, a list is created
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

    /**
     *
     * @param sessionNumber- the session number
     * @param newFile- the new file that has to be addedd
     *               the method adds a new file in the set of images in the current session
     *               if there is not such session, one is created
     */
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
     *                 it creates session by creating new set of images, adds the file in it
     *                 and then the set is put in the session
     */
        public void createSession(int sessionNumber, NetpbmFiles fileName){
            Set<NetpbmFiles>images=new HashSet<>();
            images.add(fileName);
            session.put(sessionNumber,images);
        }
        public Set<NetpbmFiles> currentSession(Session session,int mapKey){
            Set<Map.Entry<Integer, Set<NetpbmFiles>>> entries = session.getSession().entrySet();

            for(Map.Entry<Integer, Set<NetpbmFiles>>entry:entries){
                if (entry.getKey()==mapKey){
                    return entry.getValue();
                }}return null;
        }
}
