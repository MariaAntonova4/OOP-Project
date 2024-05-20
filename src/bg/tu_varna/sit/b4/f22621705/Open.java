package bg.tu_varna.sit.b4.f22621705;

import bg.tu_varna.sit.b4.f22621705.open.FileOpen;

import java.io.IOException;
import java.util.Scanner;

public class Open implements Menu {
    @Override
    public Menu execute() throws IOException {
            String fileName;
            System.out.println("Please enter the name of the file which you want to open: ");
            Scanner scanner=new Scanner(System.in);
            fileName=scanner.nextLine();

            return new FileOpen().readFile(fileName);
        }
    }

