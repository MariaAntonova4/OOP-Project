package bg.tu_varna.sit.b4.f22621705.save;
import bg.tu_varna.sit.b4.f22621705.Menu;
import bg.tu_varna.sit.b4.f22621705.open.OpenPBM;

import java.io.*;
import java.util.Scanner;

import static bg.tu_varna.sit.b4.f22621705.save.SaveFile.filePath;

public class SaveInPBMFile {
    private StringBuilder format=new StringBuilder();

    private int width;
    private int height;
    private StringBuilder data=new StringBuilder();

    public StringBuilder getData() {
        return data;
    }

    public void setData(StringBuilder data) {
        this.data = data;
    }

    public StringBuilder getFormat() {
        return format;
    }

    public void setFormat(StringBuilder format) {
        this.format = format;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Menu saveFile(String fileName,StringBuilder stringBuilder) throws IOException {
        File file=new File(filePath+fileName);
        FileOutputStream fileWriter=new FileOutputStream(file);
        OpenPBM openPBM=new OpenPBM();
        openPBM.readFile(fileName);
        fileWriter.write(openPBM.getMagicNumber().charAt(0));
        fileWriter.write(openPBM.getMagicNumber().charAt(1));
        fileWriter.write('\n');
        fileWriter.write(openPBM.getHeight());
        fileWriter.write(" ".getBytes());
        fileWriter.write(openPBM.getWidth());
        fileWriter.write('\n');
        int dataLength=1;
        while(dataLength<stringBuilder.length()){
            if (stringBuilder.charAt(dataLength)=='\n'){
                fileWriter.write('\n');}else {
                fileWriter.write(stringBuilder.charAt(dataLength));
            }
            dataLength++;
        }fileWriter.close();
        return null;
        }
    }




