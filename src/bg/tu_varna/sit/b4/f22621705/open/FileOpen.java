package bg.tu_varna.sit.b4.f22621705.open;

import bg.tu_varna.sit.b4.f22621705.Menu;

import java.io.*;

public class FileOpen extends Menu {
   // private CheckFile checkFile;
    public Menu readFile(String fileName) throws IOException {
        if (checkIfFileExists(fileName)){
        FileInputStream reader=new FileInputStream("C:\\Users\\Asus\\Desktop\\OOP-PROJECT\\OOP-Project\\Files\\"+fileName);
            System.out.println(reader.read());
            System.out.println(reader.read());
            System.out.println((reader.read()));
        reader.close();}
        return null;
    }
    public boolean checkIfFileExists(String fileName){
        File file=new File("C:\\Users\\Asus\\Desktop\\OOP-PROJECT\\OOP-Project\\Files\\"+fileName);

        if (file.exists())
        {
            System.out.println("File exists!");
            return true;
        }
        else{
            System.out.println("There is no such file");
            //System.in.toString();
            File file1=new File("C:\\Users\\Asus\\Desktop\\OOP-PROJECT\\OOP-Project\\Files\\");
        }
        return false;
    }
}
