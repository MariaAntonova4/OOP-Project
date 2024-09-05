package bg.tu_varna.sit.b4.f22621705.menu.models.load.models.undo;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.Load;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.LoadMenu;
import bg.tu_varna.sit.b4.f22621705.files.Session;
import bg.tu_varna.sit.b4.f22621705.menu.models.open.ReadFile;
import bg.tu_varna.sit.b4.f22621705.files.OpenedFiles;

import java.io.IOException;
import java.util.*;

public class Undo implements LoadMenu {
    private Load load;
    private OpenedFiles openedFiles=new OpenedFiles();
    private ReadFile checkFile=new ReadFile(openedFiles);

    public Undo(Load load) {
        this.load = load;
    }
    public void undoFiles(Session session,int sessionNumber,StringBuilder stringBuilder) throws IOException {
        Set<Map.Entry<Integer, Set<NetpbmFiles>>> entries = session.getSession().entrySet();
        for(Map.Entry<Integer,Set<NetpbmFiles>>entry:entries){
            if (entry.getKey()==sessionNumber){
                Iterator<NetpbmFiles> iterator=entry.getValue().iterator();
                while (iterator.hasNext()){
                    NetpbmFiles s=iterator.next();
                    if (stringBuilder!=null&&stringBuilder.toString().contains(s.getFileName())){
                        //undoHistory();
                        continue;
                    }
                    checkFile.checkIfFileExists(s,s.getFileName());}
                entry.getValue().clear();
            }
        }
        session.addListOfFiles(sessionNumber,openedFiles.getOpenedFiles());
    }

    public void undoHistory(NetpbmFiles netpbmFiles,String name){

    }

    @Override
    public LoadMenu executeLoad(Session session, int sessionNumber) throws IOException {
        Set<Map.Entry<Integer,List<String>>>entrySet=session.getCommandHistory().entrySet();
        for (Map.Entry<Integer, List<String>>entry1:entrySet){
            if (entry1.getKey()==sessionNumber){
                StringBuilder addFileName=new StringBuilder();
                Iterator<String> iterator1=entry1.getValue().iterator();
                StringBuilder stringBuilder=new StringBuilder();
                while (iterator1.hasNext()){
                    String s=iterator1.next();
                    if (!iterator1.hasNext()){
                        break;
                    }
                    stringBuilder.append(s)
                            .append(",");
                    if (s.contains("add ")){
                        addFileName.append(s.substring(s.indexOf(" "),s.length()))
                                .append(",");
                    }
                    //entry1.getValue().remove(s);
                }
                    entry1.getValue().clear();
                undoFiles(session,sessionNumber,addFileName);
                        String[]filNames=stringBuilder.toString().split(",");
                        for (String b:filNames)
                        {
                            if(!b.equals("undo")&&!b.equals("switch")){
                                if (b.contains(" ")){
                                    StringBuilder stringBuild=new StringBuilder();
                                    stringBuild.append(b);
                                    load.setCommandName(stringBuild);
                                    if(b.contains("add ")){
                                        NetpbmFiles netPbm=null;
                                        checkFile.checkIfFileExists(netPbm,stringBuild.substring(stringBuild.indexOf(" ")+1,stringBuild.length()));
                                    }
                                    load.loadMapping(openedFiles,sessionNumber);
                                    if(load.getEe().commandExist(load.takeCommand(stringBuild))){
                                        load.getEe().commands(load.takeCommand(stringBuild),session,sessionNumber);
                                    }
                                }
                                else if(load.getEe().commandExist(b)){
                                    load.getEe().commands(b,session,sessionNumber);
                                }

                            }
                            else {session.addInHistory(sessionNumber,b);}
                        }

                        // }}

            }
        }
        session.addInHistory(sessionNumber,"undo");
        return null;
    }
}
