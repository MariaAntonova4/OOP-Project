package bg.tu_varna.sit.b4.f22621705.files;

import java.util.List;

public interface NetpbmFiles {
    String getFileName();
    void setFileName(String fileName);
    String getMagicNumber();
    void setMagicNumber(char magicNumber);
    int getMaximumValue();
    void setMaximumValue(int maximumValue);
    int getWidth();
    void setWidth(int width);
    int getHeight();
    void setHeight(int height);
    void addRow(Row row);
    List<Row> showRows();
}
