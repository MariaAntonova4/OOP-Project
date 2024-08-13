package bg.tu_varna.sit.b4.f22621705.menu;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.open.CheckFile;
import bg.tu_varna.sit.b4.f22621705.open.OpenedFiles;

import java.io.IOException;
import java.util.Scanner;

public class Open implements Menu {
    private NetpbmFiles netpbmFiles;


    @Override
    public Menu execute(OpenedFiles openedFiles,Session session) throws IOException {
            String fileName;
            //System.out.println("Please enter the name of the file which you want to open: ");
            Scanner scanner=new Scanner(System.in);
            fileName=scanner.nextLine();

            return new CheckFile().checkIfFileExists(openedFiles,netpbmFiles,fileName);
        }
    }

