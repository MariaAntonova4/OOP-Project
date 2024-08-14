package bg.tu_varna.sit.b4.f22621705;


import bg.tu_varna.sit.b4.f22621705.help.HelpCommand;
import bg.tu_varna.sit.b4.f22621705.menu.*;

import java.io.*;
import java.util.*;


public class Application {
    public static void main(String[] args) throws IOException, CommandException {
        MapClass mapClass= new HelpCommand();
            try{
                mapClass.commands();

        }catch (CommandException e)
        {
            System.out.println(e.getMessage());
        }
}}
