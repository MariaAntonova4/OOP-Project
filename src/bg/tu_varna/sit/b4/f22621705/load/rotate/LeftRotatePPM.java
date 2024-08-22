package bg.tu_varna.sit.b4.f22621705.load.rotate;

import bg.tu_varna.sit.b4.f22621705.oldClasses.FileOpen;
import bg.tu_varna.sit.b4.f22621705.oldClasses.OpenPGM;
import bg.tu_varna.sit.b4.f22621705.oldClasses.OpenPPM;
import bg.tu_varna.sit.b4.f22621705.oldClasses.SaveInPBMFile;

import java.io.IOException;

public class LeftRotatePPM {
    private SaveInPBMFile saveInFile;
    private int newHeight;
    private int newWidth;

    public FileOpen checkOpening(String fileName){
        if (fileName.contains(".pbm")){
            return null;//new OpenPBM()
        } else if (fileName.contains(".pgm")) {
            return new OpenPGM();
        }
        return new OpenPPM();
    }
/*FileOpen fileOpen=checkOpening(fileName);


                fileOpen.readFile(fileName);
                newHeight=fileOpen.getHeight();
                newWidth=fileOpen.getWidth();
                StringBuilder str=fileOpen.cleanFormat();
                saveInFile=new SaveInPBMFile();
                saveInFile.setHeight(newHeight);
                saveInFile.setWidth(newWidth);
                saveInFile.setFormat(str);
                StringBuilder newData=new StringBuilder();

                fileOpen.cleanFormat().reverse();
                if(newWidth>newHeight){
                    for (int j=(newWidth-1);j>0;j--){
                    newData.append(fileOpen.cleanFormat().charAt(j));
                    for (int i=1;i<newHeight;i++){
                        newData.append(fileOpen.cleanFormat().charAt((j+((newWidth)*i))));
                    }
                    newData.append("\n");
                }
                    newData.append(fileOpen.cleanFormat().charAt(0));
                    for (int i=1;i<newHeight;i++){
                        newData.append(fileOpen.cleanFormat().charAt((newWidth)*i));
                    }
                    newData.append("\n");}
                else{
                    int k=newHeight*newWidth;
                    int m=newWidth-1;
                    for (int j=(k-newWidth);m>0;m--){
                        newData.append(fileOpen.cleanFormat().charAt(j));
                        for (int i=1;i<newHeight;i++){
                            newData.append(fileOpen.cleanFormat().charAt((k-(newWidth))-newWidth*i));
                        }
                        newData.append("\n");
                    }
                    newData.append(fileOpen.cleanFormat().charAt(k-1));
                    for (int i=1;i<newHeight;i++){
                        newData.append(fileOpen.cleanFormat().charAt((k-1)-(newWidth*i)));
                    }
                    newData.append("\n");
                }

                fileOpen.cleanFormat().reverse();
                System.out.println(newData);return newData;}*/
    public StringBuilder rotateLeft(String fileName) throws IOException {
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

        fileOpen.cleanFormat().reverse();
        if(newWidth>newHeight){
            for (int j=((newWidth*3)-1);j>0;j--){
                newData.append(fileOpen.cleanFormat().charAt(j));
                for (int i=1;i<newHeight*3;i++){
                    newData.append(fileOpen.cleanFormat().charAt((j+((newWidth)*i))));
                }
                newData.append("\n");
            }
            newData.append(fileOpen.cleanFormat().charAt(0));
            for (int i=1;i<newHeight*3;i++){
                newData.append(fileOpen.cleanFormat().charAt((newWidth)*i));
            }
            newData.append("\n");}
        else{
            int k=(newHeight*newWidth)*3;
            int m=newWidth-1;
            for (int j=(k-newWidth*3);m>0;m--){
                newData.append(fileOpen.cleanFormat().charAt(j));
                for (int i=1;i<newHeight*3;i++){
                    newData.append(fileOpen.cleanFormat().charAt((k-(newWidth))-newWidth*i));
                }
                newData.append("\n");
            }
            newData.append(fileOpen.cleanFormat().charAt(k-1));
            for (int i=1;i<newHeight*3;i++){
                newData.append(fileOpen.cleanFormat().charAt((k-1)-(newWidth*i)));
            }
            newData.append("\n");
        }

        fileOpen.cleanFormat().reverse();
        System.out.println(newData);return newData;}

}
