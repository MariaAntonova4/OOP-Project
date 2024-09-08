package bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;

import bg.tu_varna.sit.b4.f22621705.files.row.Pixel;
import bg.tu_varna.sit.b4.f22621705.files.row.Row;

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

    public void setMagicNumber(char magicNum) {
        this.magicNumber = magicNumber+magicNum;
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

    /**
     * The method adds row to the list
     * @param row the row that has to be added
     */
    public void addRow(Row row){
        rows.add(row);
    }

    @Override
    public List<Row> showRows() {
        if (!this.rows.isEmpty()){
            Iterator<Row>iterator=this.rows.iterator();
            while (iterator.hasNext()){
                Row row=(Row) iterator.next();
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
    public void setRow(Row row) {
        if (row==null){
            this.row=new Row();
        }
        else this.row = row;
    }

    /**
     * The method puts pixel in the row. If the row is full, it creates a new row
     * @param pixels the pixel that has to be added in the list
     */
    @Override
    public void createRow(Pixel pixels) throws PixelException{
        setRow(row);
        if (pixels.getNumber()<=this.getMaximumValue()){
            if (row.getPixelsList().size()<this.getWidth()){
                row.putInRow(pixels);}
            else {
                this.addRow(row);
                row=new Row();
                row.putInRow(pixels);}
        }
        else {throw new PixelException("The number should not be below the maximum value");}
    }
    @Override
    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    @Override
    public Row getRow() {
        return row;
    }
}
