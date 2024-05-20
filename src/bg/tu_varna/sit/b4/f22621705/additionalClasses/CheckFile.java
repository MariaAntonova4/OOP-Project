package bg.tu_varna.sit.b4.f22621705.additionalClasses;

import java.io.*;

public class CheckFile {
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
