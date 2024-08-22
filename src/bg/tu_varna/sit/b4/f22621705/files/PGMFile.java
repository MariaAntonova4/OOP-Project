package bg.tu_varna.sit.b4.f22621705.files;

import java.util.*;

public class PGMFile implements NetpbmFiles{
    private String fileName;
    private String magicNumber="P";
    private int maximumValue;
    private int width;
    private int height;
    private Row row;
    private List<Row> rows=new ArrayList<>();

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

    public void addRow(Row row){
        rows.add(row);
    }

    @Override
    public List<Row> showRows() {
        if (!this.rows.isEmpty()){
            Iterator<Row>iterator=this.rows.iterator();
            while (iterator.hasNext()){
                Row i=(Row) iterator.next();

                System.out.println(i.getPixelsList());
            }
        }
        return rows;
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
