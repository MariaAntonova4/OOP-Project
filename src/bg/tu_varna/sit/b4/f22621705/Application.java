package bg.tu_varna.sit.b4.f22621705;

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


        Scanner scanner=new Scanner(System.in);
        String commandName="";
        while(!Objects.equals(commandName, "exit")){
            System.out.println(">"+commandName);
            commandName=scanner.next();
            mapClass.commands(commandName);}

}}
