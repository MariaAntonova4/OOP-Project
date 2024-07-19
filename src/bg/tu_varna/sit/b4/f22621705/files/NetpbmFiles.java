package bg.tu_varna.sit.b4.f22621705.files;

import java.util.List;

public interface NetpbmFiles {
    public String getMagicNumber();

    public void setMagicNumber(String magicNumber);
    public int getMaximumValue();

    public void setMaximumValue(int maximumValue);
    public int getWidth();

    public void setWidth(int width);

    public int getHeight();

    public void setHeight(int height);

    public List<Pixel> getPixels();

    public void setPixels(List<Pixel> pixels);
    public void setData(Pixel pixel);
}
