package bg.tu_varna.sit.b4.f22621705.open;

import java.io.*;

public class CheckFile {
    public boolean checkIfFileExists(File file){
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
