package bg.tu_varna.sit.b4.f22621705;

import bg.tu_varna.sit.b4.f22621705.open.CheckFile;
import bg.tu_varna.sit.b4.f22621705.open.OpenPGM;

import java.io.*;
import java.util.*;


public class Application {
    public static void main(String[] args) throws IOException {
        //Men menu=new Men();
        //Map1 map1=new Map1();
        MapClass mapClass= new F();
        //A a=e.aaa();
        //e.aa();
        //a.execute();
        //e.aaa();
        M m=new M();
        m.setE(mapClass);
        m.putInMap();
        mapClass=new G();
        //a=e.aaa();
        //a.execute();
        //e.aaa();
        m.setE(mapClass);
        m.putInMap();

        CheckFile checkFile=new CheckFile();
        //FileOpen fileOpen=new FileOpen();
        OpenPGM openPGM=new OpenPGM();
        //openPGM.readFile("RotateLeftFile.pgm");

        System.out.println(openPGM.cleanFormat());

        Scanner scanner=new Scanner(System.in);
        String commandName;
        System.out.println("Please write the command you want to be executed: ");
        commandName=scanner.next();
        mapClass.commands(commandName);

        //menu.addCommands();
       /* menu.menuCreator();
        menu.bbp(commandName);*/
        //fileOpen.readFile(fileName);


}}
