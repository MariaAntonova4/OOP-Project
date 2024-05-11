package bg.tu_varna.sit.b4.f22621705.open;

import bg.tu_varna.sit.b4.f22621705.Menu;

import javax.imageio.stream.FileImageInputStream;
import java.io.*;
import java.util.Arrays;

public class FileOpen extends Menu {
   // private CheckFile checkFile;
    public Menu readFile(String fileName) throws IOException {
        if (checkIfFileExists(fileName)){
            File file=new File("C:\\Users\\Asus\\Desktop\\OOP-PROJECT\\OOP-Project\\Files\\"+fileName);
        FileInputStream reader=new FileInputStream("C:\\Users\\Asus\\Desktop\\OOP-PROJECT\\OOP-Project\\Files\\"+fileName);
           int lengthth=0;
        while (lengthth<36) {
                System.out.println((char) reader.read());
            lengthth++;
            }
            reader.close();}
        return null;
    }
    public boolean checkIfFileExists(String fileName) throws IOException {
        File file=new File("C:\\Users\\Asus\\Desktop\\OOP-PROJECT\\OOP-Project\\Files\\"+fileName);

        if (file.exists())
        {
            System.out.println("File exists!");
            return true;
        }
        else{
            System.out.println("There is no such file");
            File file1=new File("C:\\Users\\Asus\\Desktop\\OOP-PROJECT\\OOP-Project\\Files\\"+fileName);
            FileWriter fileWriter=new FileWriter(file1);
            fileWriter.close();
        }
        return false;
    }
}
