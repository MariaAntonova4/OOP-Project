package bg.tu_varna.sit.b4.f22621705.menu.models.load.models.collage;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.PixelException;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.DirectionException;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.LoadMenu;
import bg.tu_varna.sit.b4.f22621705.files.Session;
import bg.tu_varna.sit.b4.f22621705.files.OpenedFiles;

import java.io.IOException;
import java.util.*;


public class Collage implements LoadMenu {
    private CollageDirection collageDirection;
    private OpenedFiles openedFiles;
    private StringBuilder stringBuilder;
    String newFileName;
    String stringDirection;
    String firstFileName;
    String secondFileName;

    public Collage(OpenedFiles openedFiles,StringBuilder stringBuilder) {
        this.collageDirection=CollageDirection.HORIZONTAL;
        this.openedFiles=openedFiles;
        this.stringBuilder=stringBuilder;
    }

    public String getNewFileName() {
        return newFileName;
    }

    public void setNewFileName(String newFileName) {
        this.newFileName = newFileName;
    }

    public String getStringDirection() {
        return stringDirection;
    }

    public void setStringDirection(String stringDirection) {
        this.stringDirection = stringDirection;
    }

    public String getFirstFileName() {
        return firstFileName;
    }

    public void setFirstFileName(String firstFileName) {
        this.firstFileName = firstFileName;
    }

    public String getSecondFileName() {
        return secondFileName;
    }

    public void setSecondFileName(String secondFileName) {
        this.secondFileName = secondFileName;
    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    /**
     * the method checks if the direction and the names of the files are empty and if they are
     * they are written
     */
    public void setData(){
        stringBuilder.delete(0, stringBuilder.indexOf(" ")+1);
        String[]fileNames=stringBuilder.toString().split(" ");
        for (String s:fileNames)
        {
            if (stringDirection==null){
                setStringDirection(s);
            }
            else if(firstFileName==null){setFirstFileName(s);}
            else if (secondFileName==null) {
                setSecondFileName(s);
            }else {setNewFileName(s);}
        }
    }

    /**
     *
     * @param session the session
     * @param sessionNumber the number of the current session
     * @return
     * @throws IOException
     * the method checks if the written files are suitable for the command and if they
     * are class is called with the logic for the collage with the written direction
     * The new file is added in the current session
     */
    @Override
    public LoadMenu executeLoad(Session session, int sessionNumber) throws IOException,PixelException, DirectionException {
        Set<Map.Entry<Integer, Set<NetpbmFiles>>> entries = session.getSession().entrySet();
        NetpbmFiles newFile=null;
        NetpbmFiles firstFile=null;
        NetpbmFiles secondFile=null;
        setData();
                    if (firstFileName.substring(firstFileName.indexOf("."),firstFileName.length()).equals(secondFileName.substring(secondFileName.indexOf("."),secondFileName.length()))){

                                Iterator<NetpbmFiles> iterator = session.currentSession(session,sessionNumber).iterator();
                                while (iterator.hasNext()){
                                    NetpbmFiles netpbmFiles = iterator.next();
                                    if (netpbmFiles.getFileName().equals(firstFileName)){
                                        firstFile=netpbmFiles;
                                    }
                                    if (netpbmFiles.getFileName().equals(secondFileName)){
                                        secondFile=netpbmFiles;
                                    }
                                }

                        if (firstFile.getWidth()==secondFile.getWidth()&&firstFile.getHeight()==secondFile.getHeight()){
                            if (stringDirection.equals(CollageDirection.HORIZONTAL.getCollageDirection())){
                                session.addInHistory(sessionNumber,"collage horizontal "+firstFileName+" "+secondFileName+" "+newFileName);
                            newFile=new HorizontalCollage().horizontalCollage(firstFile,secondFile,newFile);
                            newFile.setFileName(newFileName);

                                        session.currentSession(session,sessionNumber).add(newFile);
                                        System.out.println("The horizontal collage is added");

                        }
                            else if(stringDirection.equals(CollageDirection.VERTICAL.getCollageDirection())){
                                session.addInHistory(sessionNumber,"collage vertical "+firstFileName+" "+secondFileName+" "+newFileName);
                                newFile=new VerticalCollage().verticalCollage(firstFile,secondFile,newFile);
                                newFile.setFileName(newFileName);

                                        session.currentSession(session, sessionNumber).add(newFile);
                                        System.out.println("The vertical collage is added");

                            }else{
                                throw new DirectionException("This is Not a Direction");
                            }
                    }}

                    else {
                        System.out.println("Cannot make a collage from different types! (."+firstFileName.substring(firstFileName.indexOf("."),firstFileName.length())+" and ."+secondFileName.substring(secondFileName.indexOf("."),secondFileName.length())+")");
    }
            setStringDirection(null);
        setFirstFileName(null);
            setSecondFileName(null);
        setNewFileName(null);
return null;}}
