package bg.tu_varna.sit.b4.f22621705.menu;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.open.CheckFile;
import bg.tu_varna.sit.b4.f22621705.open.OpenedFiles;

import java.io.IOException;
import java.util.Scanner;

public class Open implements Menu {
    private NetpbmFiles netpbmFiles;
    private OpenedFiles openedFiles;
    private StringBuilder stringBuilder;

    public Open(OpenedFiles openedFiles,StringBuilder stringBuilder) {
        this.openedFiles = openedFiles;
        this.stringBuilder=stringBuilder;
    }

    @Override
    public Menu execute() throws IOException {
            String fileName=stringBuilder.substring(stringBuilder.indexOf(" ")+1,stringBuilder.length());
            //System.out.println("Please enter the name of the file which you want to open: ");
            //Scanner scanner=new Scanner(System.in);
            //fileName=scanner.nextLine();

            return new CheckFile(openedFiles).checkIfFileExists(netpbmFiles,fileName);
        }
    }

