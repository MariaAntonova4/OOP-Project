package bg.tu_varna.sit.b4.f22621705.save;
import bg.tu_varna.sit.b4.f22621705.menu.Menu;
import bg.tu_varna.sit.b4.f22621705.open.OpenedFiles;

import java.io.*;

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

        return null;
        }
    }




