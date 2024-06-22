package bg.tu_varna.sit.b4.f22621705;

import bg.tu_varna.sit.b4.f22621705.load.grayscale.Grayscale;
import bg.tu_varna.sit.b4.f22621705.load.monochrome.MonochromePGM;
import bg.tu_varna.sit.b4.f22621705.open.CheckFile;
import bg.tu_varna.sit.b4.f22621705.open.OpenPGM;
import bg.tu_varna.sit.b4.f22621705.open.OpenPPM;

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
        MonochromePGM monochromePGM=new MonochromePGM();
        monochromePGM.turnMonochrome("PGM.pgm");

        Scanner scanner=new Scanner(System.in);
        String commandName;
        System.out.println("Please write the command you want to be executed: ");
        commandName=scanner.next();
        // mapClass.commands(commandName);

}}
