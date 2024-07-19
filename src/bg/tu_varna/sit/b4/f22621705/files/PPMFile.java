package bg.tu_varna.sit.b4.f22621705.files;

import java.util.*;

public class PPMFile implements NetpbmFiles{
    private String magicNumber;
    private int maximumValue;
    private int width;
    private int height;
    private List<Pixel> pixels;

    public PPMFile(String magicNumber, int maximumValue, int width, int height, List<Pixel> pixels) {
        this.magicNumber = magicNumber;
        this.maximumValue = maximumValue;
        this.width = width;
        this.height = height;
        this.pixels = pixels;
    }

    public String getMagicNumber() {
        return magicNumber;
    }

    public void setMagicNumber(String magicNumber) {
        this.magicNumber = magicNumber;
    }

    public int getMaximumValue() {
        return maximumValue;
    }

    public void setMaximumValue(int maximumValue) {
        this.maximumValue = maximumValue;
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

    public List<Pixel> getPixels() {
        return pixels;
    }

    public void setPixels(List<Pixel> pixels) {
        this.pixels = pixels;
    }
    public void setData(Pixel pixel){
        pixels.add(pixel);
    }
}
