package bg.tu_varna.sit.b4.f22621705;

import java.io.*;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter1=new FileWriter("File.txt");
        FileWriter fileWriter=new FileWriter("PBMFile.pbm");
        File file=new File("C:\\Users\\Asus\\Desktop\\OOP-PROJECT\\OOP-Project\\Files");
        char []array={ 'P','1',
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
        fileWriter.write(Arrays.toString(array));
        System.out.println(array);
        fileWriter1.write(array);
        fileWriter1.close();
        fileWriter.close();
        FileReader fileReader1=new FileReader("File.txt");
        FileReader fileReader=new FileReader("PBMFile.pbm");
        fileReader.close();
        fileReader1.close();
    }
}
