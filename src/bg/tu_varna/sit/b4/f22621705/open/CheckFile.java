package bg.tu_varna.sit.b4.f22621705.open;

import java.io.*;

import bg.tu_varna.sit.b4.f22621705.files.*;
import bg.tu_varna.sit.b4.f22621705.menu.Menu;

public class CheckFile {
    private File file;
    private NetpbmFiles newFile;
    private Pixel pixel;
    private boolean flag;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void setFile(String fileName) {
        this.file = new File("C:\\Users\\Asus\\Desktop\\OOP-PROJECT\\OOP-Project\\Files\\"+fileName);
    }

    public File getFile() {
        return file;
    }

        public Menu checkIfFileExists(String fileName) throws IOException {

            setFile(fileName);
            if (file.exists())
            {
               // System.out.println("> open"+file.getPath());
                if(fileName.contains(".pbm")){
                    newFile=new PBMFile();
                } else if (fileName.contains(".pgm")) {
                    newFile=new PGMFile();
                } else if (fileName.contains(".ppm")) {
                    newFile=new PPMFile();
                }else {
                    System.out.println("There is NOT a created file");
                }
                FileReader reader=new FileReader(getFile());
                int numbers=(char)reader.read();
                numbers=Character.getNumericValue(numbers);
                newFile.setMagicNumber((char) reader.read());
                reader.read();
                reader.read();

                numbers=(char)reader.read();
                numbers=Character.getNumericValue(numbers);
                newFile.setWidth(numbers);
                reader.read();
                numbers=(char)reader.read();
                numbers=Character.getNumericValue(numbers);
                newFile.setHeight(numbers);
                reader.read();
                reader.read();
                if (!fileName.contains(".pbm")){
                numbers=(char)reader.read();
                numbers=Character.getNumericValue(numbers);
                newFile.setMaximumValue(numbers);
            }
                while (numbers!=65535){
                    numbers=(char)reader.read();

                    if (numbers>47&&numbers<58){
                    numbers=Character.getNumericValue(numbers);
                    pixel=new Pixel(numbers);
                    newFile.setData(pixel);}
                    //reader.read();
                }
                System.out.println(newFile.getPixels());
                System.out.println(newFile.getMaximumValue());;

                System.out.println("Successfully opened "+fileName);
                setFlag(true);
            }
            else{
                System.out.println("There is no such file");
                setFile(fileName);
                FileWriter fileWriter=new FileWriter(getFile());
                fileWriter.close();
            }
            return null;
        }
}
