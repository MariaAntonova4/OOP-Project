package bg.tu_varna.sit.b4.f22621705;

import bg.tu_varna.sit.b4.f22621705.open.CheckFile;
import bg.tu_varna.sit.b4.f22621705.open.FileOpen;

import java.io.*;
import java.util.*;


public class Application {
    public static void main(String[] args) throws IOException {
        Menu menu=new Menu();
        File fileFole=new File("C:\\Users\\Asus\\Desktop\\OOP-PROJECT\\OOP-Project\\Files\\FoleFile.pbm");
        FileOutputStream fileWriter=new FileOutputStream(fileFole);
        /*byte zero=0;
        byte one=1;
        byte two=2;
        byte three=3;*/
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
        CheckFile checkFile=new CheckFile();
        FileOpen fileOpen=new FileOpen();
        //
        int string;
        System.out.println("Write something: ");
        Scanner scanner=new Scanner(System.in);
        /*string= Integer.parseInt(scanner.next());
        int sum=string+string;
        System.out.println(sum);*/
        String fileName;
        System.out.println("File name: ");
        fileName=scanner.next();
        menu.menuCreator();
        menu.bbp(fileName);
        //fileOpen.readFile(fileName);
       /* Byte byteZero=Byte.valueOf(zero);
        Byte byteOne=Byte.valueOf(one);
        Byte byteTwo=Byte.valueOf(two);
        Byte byteThree=Byte.valueOf(three);
        String format="0";
        fileWriter.write(byteZero);
        fileWriter.write(byteOne);
        fileWriter.write(byteThree);
        fileWriter.write(byteTwo);
        fileWriter.write(byteZero);
        fileWriter.write(byteZero);
        fileWriter.write(byteOne);
        fileWriter.write(byteOne);
        fileWriter.write(byteOne);
        fileWriter.write(byteOne);*/
        fileWriter.close();
       /* FileInputStream fileReader=new FileInputStream("Fole.pbm");
        System.out.println(fileReader.read());
        System.out.println(fileReader.read());
        fileReader.close();*/
/*
        FileWriter fileWriter1=new FileWriter("File.txt");
        FileWriter fileWriter=new FileWriter("PBMFile.pbm");
        FileWriter fileWriter2=new FileWriter("PPMFile.ppm");
        //File file=new File("C:\\Users\\Asus\\Desktop\\Fole.pbm");
        FileReader fileReaderFole=new FileReader("Fole.pbm");
        FileWriter filewriterFOLE=new FileWriter("Fole.pbm");
        filewriterFOLE.write(2);
        filewriterFOLE.close();
        fileReaderFole.close();
        fileReaderFole.read();
        fileReaderFole.close();
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
        menu.bbp(string);*/
    }
}
