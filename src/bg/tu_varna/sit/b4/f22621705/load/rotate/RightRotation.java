package bg.tu_varna.sit.b4.f22621705.load.rotate;

import bg.tu_varna.sit.b4.f22621705.load.ListOfImages;
import bg.tu_varna.sit.b4.f22621705.load.Load;
import bg.tu_varna.sit.b4.f22621705.open.FileOpen;
import bg.tu_varna.sit.b4.f22621705.open.OpenPBM;
import bg.tu_varna.sit.b4.f22621705.open.OpenPGM;
import bg.tu_varna.sit.b4.f22621705.open.OpenPPM;
import bg.tu_varna.sit.b4.f22621705.save.SaveInPBMFile;

import java.io.IOException;

public class RightRotation {
    private SaveInPBMFile saveInFile;
    private ListOfImages listOfImages;
    private Load load;
    private int newHeight;
    private int newWidth;

    public FileOpen checkOpening(String fileName){
        if (fileName.contains(".pbm")){
            return new OpenPBM();
        } else if (fileName.contains(".pgm")) {
            return new OpenPGM();
        }
        return new OpenPPM();
    }

    public void rotateRight(String fileName) throws IOException {

        FileOpen fileOpen=checkOpening(fileName);


        fileOpen.readFile(fileName);
        newHeight=fileOpen.getHeight();
        newWidth=fileOpen.getWidth();
        StringBuilder str=fileOpen.cleanFormat();
        saveInFile=new SaveInPBMFile();
        saveInFile.setHeight(newHeight);
        saveInFile.setWidth(newWidth);
        saveInFile.setFormat(str);
        StringBuilder newData=new StringBuilder();




        for (int j=(newWidth-1);j>0;j--){
            newData.append(fileOpen.cleanFormat().charAt(j));
            for (int i=1;i<newHeight;i++){
                newData.append(fileOpen.cleanFormat().charAt((j+(newWidth))*i));
            }
            newData.append("\n");
        }
        newData.append(fileOpen.cleanFormat().charAt(0));
        for (int i=1;i<newHeight;i++){
            newData.append(fileOpen.cleanFormat().charAt((newWidth)*i));
        }
        newData.append("\n");
        System.out.println(newData);

        }
    }
