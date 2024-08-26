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
    void deleteRow(Row row);
    void setRows(List<Row> rows);
    List<Row> getRows();
    void createRow(Pixel pixel);
    void setRow(Row row);
    Row getRow();
}
