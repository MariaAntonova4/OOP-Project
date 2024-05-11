package bg.tu_varna.sit.b4.f22621705.save;
import bg.tu_varna.sit.b4.f22621705.Menu;

import java.io.*;
import java.util.Arrays;

public class SaveInFile extends Menu {
    public void saveFile(String fileName, char [] data) throws IOException {
        File file=new File("C:\\Users\\Asus\\Desktop\\OOP-PROJECT\\OOP-Project\\Files\\"+fileName);
        StringBuilder stringBuilder=new StringBuilder();
        //FileWriter fileWriter=new FileWriter(file);
        FileOutputStream fileWriter=new FileOutputStream(file);
        for (char d:data){
            stringBuilder.append(d)
                    .append(" ");
        }
        fileWriter.write("P".getBytes());
        fileWriter.write("1".getBytes());
        fileWriter.write("\n".getBytes());
        fileWriter.write("3".getBytes());
        fileWriter.write(" ".getBytes());
        fileWriter.write("2".getBytes());
        fileWriter.write("\n".getBytes());
        fileWriter.write("0".getBytes());
        fileWriter.write(" ".getBytes());
        fileWriter.write("0".getBytes());
        fileWriter.write(" ".getBytes());
        fileWriter.write("1".getBytes());
        fileWriter.write("\n".getBytes());
        fileWriter.write("1".getBytes());
        fileWriter.write(" ".getBytes());
        fileWriter.write("1".getBytes());
        fileWriter.write(" ".getBytes());
        fileWriter.write("1".getBytes());
        fileWriter.close();


        //fileWriter.write(Arrays.toString(array));
    }
}



