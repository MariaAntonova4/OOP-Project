package bg.tu_varna.sit.b4.f22621705;

import bg.tu_varna.sit.b4.f22621705.load.ListOfImages;
import bg.tu_varna.sit.b4.f22621705.load.Load;
import bg.tu_varna.sit.b4.f22621705.open.CheckFile;
import bg.tu_varna.sit.b4.f22621705.open.FileOpen;

import java.io.*;
import java.util.*;


public class Application {
    public static void main(String[] args) throws IOException {
        Menu menu=new Menu();

        CheckFile checkFile=new CheckFile();
        FileOpen fileOpen=new FileOpen();
        Scanner scanner=new Scanner(System.in);
        String commandName;
        System.out.println("Please write the command you want to be executed: ");
        commandName=scanner.next();
        //menu.addCommands();
        menu.menuCreator();
        menu.bbp(commandName);
        //fileOpen.readFile(fileName);


}}
