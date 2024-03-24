package bg.tu_varna.sit.b4.f22621705;

import bg.tu_varna.sit.b4.f22621705.close.CloseFile;
import bg.tu_varna.sit.b4.f22621705.open.CheckFile;
import bg.tu_varna.sit.b4.f22621705.open.FileOpen;
import bg.tu_varna.sit.b4.f22621705.save.SaveInFile;
import bg.tu_varna.sit.b4.f22621705.saveAs.SaveAsInFile;
import sun.security.pkcs11.P11TlsKeyMaterialGenerator;
import sun.security.pkcs11.wrapper.PKCS11;
import sun.security.pkcs11.wrapper.PKCS11Constants;

import java.io.*;
import java.lang.reflect.Array;

public class Application {
    public static void main(String[] args) throws IOException {
        //FileOpen fileOpen=new FileOpen();
        //SaveInFile saveInFile=new SaveInFile();
        //CloseFile closeFile=new CloseFile();
        FileWriter fileWriter=new FileWriter("PBMFile.pbm");
        File file=new File("C:\\Users\\Asus\\Desktop\\OOP-PROJECT\\OOP-Project\\Files");
        //fileOpen.readFile(file);
        //P1
        //6 10
        char []array={ p1,
                6,10,
                0, 0, 0, 0, 1, 0,
                0, 0, 0, 0, 1, 0,
                0, 0, 0, 0, 1, 0,
                0, 0, 0, 0, 1, 0,
                0, 0, 0, 0, 1, 0,
                0, 0, 0, 0, 1, 0,
                1, 0, 0, 0, 1, 0,
                0, 1, 1, 1, 0, 0,
                0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0};
        fileWriter.write(array);
        fileWriter.close();
        FileReader fileReader=new FileReader("PBMFile.pbm");
        fileReader.close();
        //saveInFile.saveFile(fileWriter,array);
        //closeFile.closeFile(file);
    }
}
