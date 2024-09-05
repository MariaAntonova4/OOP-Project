package bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;

import bg.tu_varna.sit.b4.f22621705.files.row.Pixel;
import bg.tu_varna.sit.b4.f22621705.files.row.Row;

import java.util.*;

public class PBMFile implements NetpbmFiles{
    private String fileName;
    private String magicNumber="P";
    private static int maximumValue=1;
    private int width;
    private int height;
    private Row row;
    private List<Row>rows=new ArrayList<>();

    public List<Row> showRows(){
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

    public String getFileName() {
        return fileName;
    }

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

    public void addRow(Row row){
        rows.add(row);
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
    @Override
    public void createRow(Pixel pixels) {
        setRow(row);
        if (row.getPixelsList().size()<this.getWidth()){
            row.putInRow(pixels);}
        else {
            this.addRow(row);
            row=new Row();
            row.putInRow(pixels);}
    }

    public Row getRow() {
        return row;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }
}
