package bg.tu_varna.sit.b4.f22621705.files;

import java.util.*;

public class PBMFile implements NetpbmFiles{
    private String magicNumber="P";
    private static int maximumValue=1;
    private int width;
    private int height;
    private List<Pixel> pixels=new ArrayList<>();
/*
    public PBMFile(String magicNumber, int width, int height, List<Pixel> pixels) {
        this.magicNumber = magicNumber;
        this.width = width;
        this.height = height;
        this.pixels = pixels;
    }
*/
    public String getMagicNumber() {
        return magicNumber;
    }

    public void setMagicNumber(char magicNumberNum) {
        this.magicNumber = magicNumber+magicNumberNum;
    }
    public int getMaximumValue() {
        return maximumValue;
    }

    public void setMaximumValue(int maximumValue) {
        //this.maximumValue = 1;
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
