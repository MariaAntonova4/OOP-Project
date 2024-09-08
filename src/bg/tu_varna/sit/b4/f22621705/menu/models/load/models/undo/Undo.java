package bg.tu_varna.sit.b4.f22621705.menu.models.load.models.undo;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.PixelException;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.Load;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.DirectionException;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.LoadMenu;
import bg.tu_varna.sit.b4.f22621705.files.Session;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.switchh.SwitchException;
import bg.tu_varna.sit.b4.f22621705.menu.models.open.ReadFile;
import bg.tu_varna.sit.b4.f22621705.files.OpenedFiles;

import java.io.IOException;
import java.util.*;

public class Undo implements LoadMenu {
    private Load load;
    private OpenedFiles openedFiles=new OpenedFiles();
    private ReadFile readFile=new ReadFile(openedFiles);

    public Undo(Load load) {
        this.load = load;
    }
    public void undoFiles(Session session,int sessionNumber,StringBuilder stringBuilder) throws IOException, PixelException {
        Set<Map.Entry<Integer, Set<NetpbmFiles>>> entries = session.getSession().entrySet();
        for(Map.Entry<Integer,Set<NetpbmFiles>>entry:entries){
            if (entry.getKey()==sessionNumber){
                Iterator<NetpbmFiles> iterator=entry.getValue().iterator();
                while (iterator.hasNext()){
                    NetpbmFiles netpbmFiles=iterator.next();
                    if (stringBuilder!=null&&stringBuilder.toString().contains(netpbmFiles.getFileName())){
                        continue;
                    }
                    readFile.checkIfFileExists(netpbmFiles,netpbmFiles.getFileName());}
                entry.getValue().clear();
            }
        }
        session.addListOfFiles(sessionNumber,openedFiles.getOpenedFiles());
    }

    @Override
    public LoadMenu executeLoad(Session session, int sessionNumber) throws IOException, PixelException, SwitchException, DirectionException {
        Set<Map.Entry<Integer,List<String>>>entrySet=session.getCommandHistory().entrySet();
        for (Map.Entry<Integer, List<String>>entry1:entrySet){
            if (entry1.getKey()==sessionNumber){
                StringBuilder addFileName=new StringBuilder();
                Iterator<String> iterator1=entry1.getValue().iterator();
                StringBuilder stringBuilder=new StringBuilder();
                while (iterator1.hasNext()){
                    String commandName=iterator1.next();
                    if (!iterator1.hasNext()){
                        break;
                    }
                    stringBuilder.append(commandName)
                            .append(",");
                    if (commandName.contains("add ")){
                        addFileName.append(commandName.substring(commandName.indexOf(" "),commandName.length()))
                                .append(",");
                    }
                }
                    entry1.getValue().clear();
                undoFiles(session,sessionNumber,addFileName);
                        String[]allCommands=stringBuilder.toString().split(",");
                        for (String command:allCommands)
                        {
                            if(!command.equals("undo")&&!command.equals("switch")){
                                if (command.contains(" ")){
                                    StringBuilder commandsWithSpace=new StringBuilder();
                                    commandsWithSpace.append(command);
                                    load.setCommandName(commandsWithSpace);
                                    if(command.contains("add ")){
                                        NetpbmFiles netPbm=null;
                                        readFile.checkIfFileExists(netPbm,commandsWithSpace.substring(commandsWithSpace.indexOf(" ")+1,commandsWithSpace.length()));
                                    }
                                    load.loadMapping(openedFiles,sessionNumber);
                                    if(load.getLoadMenuLauncher().commandExist(load.takeCommand(commandsWithSpace))){
                                        load.getLoadMenuLauncher().commands(load.takeCommand(commandsWithSpace),session,sessionNumber);
                                    }
                                }
                                else if(load.getLoadMenuLauncher().commandExist(command)){
                                    load.getLoadMenuLauncher().commands(command,session,sessionNumber);
                                }

                            }
                            else {session.addInHistory(sessionNumber,command);}
                        }
                System.out.println("Undo was executed");
            }
        }
        session.addInHistory(sessionNumber,"undo");
        return null;
    }
}
