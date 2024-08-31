package bg.tu_varna.sit.b4.f22621705.load.collage;

import bg.tu_varna.sit.b4.f22621705.files.*;
import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.open.OpenedFiles;

import java.io.IOException;
import java.util.*;


public class Collage implements LoadCommands {
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

    public void setData(){
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
    @Override
    public LoadCommands executeLoad(Session session, int sessionNumber) throws IOException {
        Set<Map.Entry<Integer, Set<NetpbmFiles>>> entries = session.getSession().entrySet();
        NetpbmFiles newFile=null;
        NetpbmFiles firstFile=null;
        NetpbmFiles secondFile=null;
        setData();
        //firstFileName.charAt(firstFileName.length()-3)==secondFileName.charAt(secondFileName.length()-3)&&firstFileName.charAt(firstFileName.length()-2)==secondFileName.charAt(secondFileName.length()-2)&&firstFileName.charAt(firstFileName.length()-1)==secondFileName.charAt(secondFileName.length()-1)
                    if (firstFileName.substring(firstFileName.indexOf("."),firstFileName.length()).equals(secondFileName.substring(secondFileName.indexOf("."),secondFileName.length()))){
                        for(Map.Entry<Integer, Set<NetpbmFiles>>entry:entries){
                            if (entry.getKey()==sessionNumber) {
                                Iterator<NetpbmFiles> iterator = entry.getValue().iterator();
                                while (iterator.hasNext()){
                                    NetpbmFiles s = iterator.next();
                                    if (s.getFileName().equals(firstFileName)){
                                        firstFile=s;
                                    }
                                    if (s.getFileName().equals(secondFileName)){
                                        secondFile=s;
                                    }
                                }
                            }}

                        if (firstFile.getWidth()==secondFile.getWidth()&&firstFile.getHeight()==secondFile.getHeight()){
                            if (stringDirection.equals(CollageDirection.HORIZONTAL.getCollageDirection())){
                                session.addInHistory(sessionNumber,"collage horizontal");
                            newFile=new HorizontalCollage().horizontalCollage(firstFile,secondFile,newFile);
                                newFile.setFileName(newFileName);
                            for(Map.Entry<Integer, Set<NetpbmFiles>>entry:entries){
                                    if (entry.getKey()==sessionNumber) {
                                        entry.getValue().add(newFile);
                                    }}
                        }
                            else if(stringDirection.equals(CollageDirection.VERTICAL.getCollageDirection())){
                                session.addInHistory(sessionNumber,"collage vertical");
                                newFile=new VerticalCollage().verticalCollage(firstFile,secondFile,newFile);
                                newFile.setFileName(newFileName);
                                for(Map.Entry<Integer, Set<NetpbmFiles>>entry:entries){
                                    if (entry.getKey()==sessionNumber) {
                                        entry.getValue().add(newFile);
                                    }}
                            }else{
                                System.out.println("Error!(neither hor nor ver)");
                            }
                    }}

                    else {
                        System.out.println("Cannot make a collage from different types! (."+firstFileName.charAt(firstFileName.length()-3)+firstFileName.charAt(firstFileName.length()-2)+firstFileName.charAt(firstFileName.length()-1)+" and ."+secondFileName.charAt(secondFileName.length()-3)+secondFileName.charAt(secondFileName.length()-2)+secondFileName.charAt(secondFileName.length()-1)+")");
    }
return null;}}
