package bg.tu_varna.sit.b4.f22621705.load.undo;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.load.ConnectWithLoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.open.CheckFile;
import bg.tu_varna.sit.b4.f22621705.open.OpenedFiles;

import java.io.IOException;
import java.util.*;

public class Undo implements LoadCommands {
    private ConnectWithLoadCommands connectWithLoadCommands;
    private OpenedFiles openedFiles=new OpenedFiles();
    private CheckFile checkFile=new CheckFile(openedFiles);

    public Undo(ConnectWithLoadCommands connectWithLoadCommands) {
        this.connectWithLoadCommands = connectWithLoadCommands;
    }

    @Override
    public LoadCommands executeLoad(Session session,int sessionNumber) throws IOException {
        Set<Map.Entry<Integer, Set<NetpbmFiles>>> entries = session.getSession().entrySet();
        Set<Map.Entry<Integer,List<String>>>entrySet=session.getCommandHistory().entrySet();
        for(Map.Entry<Integer,Set<NetpbmFiles>>entry:entries){
            if (entry.getKey()==sessionNumber){
                Iterator<NetpbmFiles> iterator=entry.getValue().iterator();
                while (iterator.hasNext()){
                NetpbmFiles s=iterator.next();
                checkFile.checkIfFileExists(s,s.getFileName());}
                entry.getValue().clear();
            }
        }

        session.addListOfFiles(sessionNumber,openedFiles.getOpenedFiles());
        for (Map.Entry<Integer, List<String>>entry1:entrySet){
            if (entry1.getKey()==sessionNumber){

                Iterator<String> iterator1=entry1.getValue().iterator();
                List<String>newCommands=new ArrayList<>();
                while (iterator1.hasNext()){
                    String s=iterator1.next();

                    newCommands.add(s);
                    entry1.getValue().remove(s);
                }
                    entry1.getValue().clear();
                //newCommands.
                if (!newCommands.isEmpty()){
                    Iterator<String> iteratorCommands=newCommands.iterator();
                    while (iteratorCommands.hasNext()){
                        String b=(String) iteratorCommands.next();
                        if(!b.equals("undo")&&!b.equals("switch")){
                            connectWithLoadCommands.commands(b,session,sessionNumber);
                        }
                        else {session.addInHistory(sessionNumber,b);}
                    }}

            }
        }
        session.addInHistory(sessionNumber,"undo");
        return null;
    }
}
