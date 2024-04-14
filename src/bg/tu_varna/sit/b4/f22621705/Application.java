package bg.tu_varna.sit.b4.f22621705;

import java.io.*;
import java.util.*;


public class Application {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter1=new FileWriter("File.txt");
        FileWriter fileWriter=new FileWriter("PBMFile.pbm");
        FileWriter fileWriter2=new FileWriter("PPMFile.ppm");
        File file=new File("C:\\Users\\Asus\\Desktop\\OOP-PROJECT\\OOP-Project\\Files");
        char []array={ 'P','4',
                '6','9',
                '0', '0', '0', '0', '1', '0',
                '0', '0', '0', '0', '1', '0',
                '0', '0', '0', '0', '1', '0',
                '0', '0', '0', '0', '1', '0',
                '0', '0', '0', '0', '1', '0',
                '1', '0', '0', '0', '1', '0',
                '0', '1', '1', '1', '0', '0',
                '0', '0', '0', '0', '0', '0',
                '0', '0', '0', '0', '0', '0',
                //0, 0, 0, 0, 1, 0,
                //0, 0, 0, 0, 1, 0,
                //0, 0, 0, 0, 1, 0,
                //1, 0, 0, 0, 1, 0,
                //0, 1, 1, 1, 0, 0,
                //0, 0, 0, 0, 0, 0,
                //0, 0, 0, 0, 0, 0
                 };
        String [] array1={
                "P3",

        "3", "2",
                "255",
                "255",   "0",   "0",
                "0", "255",   "0",
                "0",   "0", "255",
                "255", "255",   "0",
                "255", "255", "255",
                "0",  "0",  "0"
        };
        int []array2={6, 10,
                0, 0, 0, 0, 1, 0,
                0, 0, 0, 0, 1, 0,
                0, 0, 0, 0 ,1 ,0,
                0, 0, 0, 0, 1, 0,
                0 ,0, 0, 0, 1, 0,
                0, 0, 0, 0, 1, 0,
                1, 0 ,0, 0, 1, 0,
                0, 1 ,1, 1, 0, 0,
                0, 0, 0 ,0 ,0 ,0,
                0, 0, 0, 0, 0, 0};
        fileWriter.write(array);
        System.out.println(array);
        fileWriter2.write(Arrays.toString(array1));
        fileWriter1.write(array);
        fileWriter1.close();
        fileWriter.close();
        fileWriter2.close();
        FileReader fileReader2=new FileReader("PPMFile.ppm");
        FileReader fileReader1=new FileReader("File.txt");
        FileReader fileReader=new FileReader("PBMFile.pbm");
        fileReader.close();
        fileReader1.close();
        fileReader2.close();
        Menu menu=new Menu();
        String string="open";
        menu.menuCreator(string, menu.open());
        menu.bbp(string);
    }
}
