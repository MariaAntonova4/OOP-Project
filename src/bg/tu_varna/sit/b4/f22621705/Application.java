package bg.tu_varna.sit.b4.f22621705;


import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.PixelException;
import bg.tu_varna.sit.b4.f22621705.menu.factories.HelpLauncher;
import bg.tu_varna.sit.b4.f22621705.files.Session;
import bg.tu_varna.sit.b4.f22621705.menu.*;
import bg.tu_varna.sit.b4.f22621705.menu.factories.MenuLauncher;
import bg.tu_varna.sit.b4.f22621705.files.OpenedFiles;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.DirectionException;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.switchh.SwitchException;

import java.io.*;


public class Application {
    public static void main(String[] args) throws IOException, CommandException, PixelException, SwitchException, DirectionException {
        MenuLauncher mapClass= new HelpLauncher();
        mapClass.setOpenedFiles(new OpenedFiles());
        mapClass.setSession(new Session());
        mapClass.setStringBuilder(mapClass.getStringBuilder());
            try{
                mapClass.commands();

        }catch (CommandException | PixelException |SwitchException |DirectionException e)
        {
            System.out.println(e.getMessage());
        }
    }}
