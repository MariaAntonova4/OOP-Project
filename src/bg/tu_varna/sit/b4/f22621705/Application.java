package bg.tu_varna.sit.b4.f22621705;

import bg.tu_varna.sit.b4.f22621705.load.rotate.LeftRotation;
import bg.tu_varna.sit.b4.f22621705.open.OpenPBM;
import bg.tu_varna.sit.b4.f22621705.open.OpenPGM;
import bg.tu_varna.sit.b4.f22621705.open.OpenPPM;

import java.io.*;
import java.util.*;


public class Application {
    public static void main(String[] args) throws IOException, CommandException {
        MapClass mapClass= new ConnectWithLoad();
            CreateFiles m=new CreateFiles();
            m.setE(mapClass);
            m.putInMap();
            mapClass=new ConnectWithSave();
            m.setE(mapClass);
            m.putInMap();

            try{
            Scanner scanner=new Scanner(System.in);
            String commandName="";
            while(!Objects.equals(commandName, "exit")){
                System.out.println(">"+commandName);
                commandName=scanner.next();
                mapClass.commands(commandName);}

        }catch (CommandException e)
        {
            System.out.println(e.getMessage());
        }


}}
