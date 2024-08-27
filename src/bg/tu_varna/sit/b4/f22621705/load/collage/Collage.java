package bg.tu_varna.sit.b4.f22621705.load.collage;

import bg.tu_varna.sit.b4.f22621705.files.*;
import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.load.rotate.LeftRotation;
import bg.tu_varna.sit.b4.f22621705.load.rotate.RightRotation;
import bg.tu_varna.sit.b4.f22621705.open.OpenedFiles;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Collage implements LoadCommands {
    private CollageDirection collageDirection;
    private OpenedFiles openedFiles;

    public Collage(OpenedFiles openedFiles) {
        this.collageDirection=CollageDirection.HORIZONTAL;
        this.openedFiles=openedFiles;
    }

    @Override
    public LoadCommands executeLoad(Session session, int sessionNumber) throws IOException {
        Set<Map.Entry<Integer, Set<NetpbmFiles>>> entries = session.getSession().entrySet();
        Scanner scanner=new Scanner(System.in);
        String stringDirection;
        String firstFileName;
        String secondFileName;
        NetpbmFiles newFile=null;
        System.out.println("Please write the direction: ");
        stringDirection=scanner.next();
        firstFileName= scanner.next();
        secondFileName=scanner.next();
        String newFileName=scanner.next();
        NetpbmFiles firstFile=null;
        NetpbmFiles secondFile=null;
                    if (firstFileName.charAt(firstFileName.length()-3)==secondFileName.charAt(secondFileName.length()-3)&&firstFileName.charAt(firstFileName.length()-2)==secondFileName.charAt(secondFileName.length()-2)&&firstFileName.charAt(firstFileName.length()-1)==secondFileName.charAt(secondFileName.length()-1)){
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
                                session.addInHistory("collage horizontal");
                            newFile=new HorizontalCollage().horizontalCollage(firstFile,secondFile,newFile);
                                newFile.setFileName(newFileName);
                            for(Map.Entry<Integer, Set<NetpbmFiles>>entry:entries){
                                    if (entry.getKey()==sessionNumber) {
                                        entry.getValue().add(newFile);
                                    }}
                        }
                            else if(stringDirection.equals(CollageDirection.VERTICAL.getCollageDirection())){
                                session.addInHistory("collage vertical");
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
