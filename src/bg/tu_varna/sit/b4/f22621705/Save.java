package bg.tu_varna.sit.b4.f22621705;

import bg.tu_varna.sit.b4.f22621705.save.SaveInFile;

import java.io.IOException;
import java.util.Scanner;

public class Save implements Menu {
    @Override
    public Menu execute() throws IOException {
        System.out.println("Please enter the name of the file which you want to save: ");
        Scanner scanner=new Scanner(System.in);
        String fileName=scanner.nextLine();
        //char [] data = new char[0];,data
        return new SaveInFile().saveFile(fileName);
    }
}
