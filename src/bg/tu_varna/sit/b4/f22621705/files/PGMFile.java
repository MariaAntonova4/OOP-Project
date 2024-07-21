package bg.tu_varna.sit.b4.f22621705.files;

import java.util.*;

public class PGMFile implements NetpbmFiles{
    private String magicNumber="P";
    private int maximumValue;
    private int width;
    private int height;
    private List<Pixel> pixels=new ArrayList<>();
/*
    public PGMFile(String magicNumber, int maximumValue, int width, int height, List<Pixel> pixels) {
        this.magicNumber = magicNumber;
        this.maximumValue = maximumValue;
        this.width = width;
        this.height = height;
        this.pixels = pixels;
    }*/

    public String getMagicNumber() {
        return magicNumber;
    }

    public void setMagicNumber(char magicNumberN) {
        this.magicNumber = magicNumber+magicNumberN;
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
        if (!this.pixels.isEmpty()){
            Iterator<Pixel>iterator=this.pixels.iterator();
            while (iterator.hasNext()){
                Pixel i=(Pixel) iterator.next();

                System.out.println(i.getNumber());
            }
        }
        return pixels;
    }

    public void setPixels(List<Pixel> pixels) {
        this.pixels = pixels;
    }
    public void setData(Pixel pixel){
        pixels.add(pixel);
    }
}
