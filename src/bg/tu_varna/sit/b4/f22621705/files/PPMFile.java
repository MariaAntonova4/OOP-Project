package bg.tu_varna.sit.b4.f22621705.files;

import java.util.*;

public class PPMFile implements NetpbmFiles{
    private String fileName;
    private String magicNumber="P";
    private int maximumValue;
    private int width;
    private int height;
    private ColorRow colorRow;
    private List<Row>rows=new ArrayList<>();

    public ColorRow getColorRow() {
        return colorRow;
    }

    public void setColorRow(ColorRow colorRow) {
        if (colorRow==null){
            this.colorRow=new ColorRow();
        }
        else this.colorRow = colorRow;
    }

    @Override
    public String getFileName() {
        return fileName;
    }

    @Override
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getMagicNumber() {
        return magicNumber;
    }

    public void setMagicNumber(char magicNumber1) {
        this.magicNumber = magicNumber+magicNumber1;
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

    public void addRow(Row row){
        setColorRow(colorRow);
        rows.add(row);
        colorRow.colorRow(row);
    }
    @Override
    public List<Row> showRows() {
        return null;
    }
    @Override
    public void deleteRow(Row row) {
        this.rows.remove(row);
    }

    public List<Row> getRows() {
        return rows;
    }

    @Override
    public void setRows(List<Row> rows) {
        this.rows = rows;
    }
}
