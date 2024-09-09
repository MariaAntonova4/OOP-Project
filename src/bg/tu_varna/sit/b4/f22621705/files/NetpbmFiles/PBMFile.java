package bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;

import bg.tu_varna.sit.b4.f22621705.files.row.Pixel;
import bg.tu_varna.sit.b4.f22621705.files.row.Row;

import java.util.*;

public class PBMFile extends NetpbmFiles{
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
                Row row=(Row) iterator.next();
            }
        }
        return rows;
    }

    /**
     * the method deletes the row in the list
     * @param row the row that has to be removed
     */
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

    public void setMagicNumber(int magicNum) {

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

    /**
     *
     * @param row the row that has to be added
     *            the method adds row in the list of rows
     */
    public void addRow(Row row){
        rows.add(row);
    }

    public List<Row> getRows() {
        return rows;
    }

    /**
     *
     * @param row the row that has to be written
     *            the method checks if the row is empty. If it is is created new one
     */
    public void setRow(Row row) {
        if (row==null){
            this.row=new Row();
        }
        else this.row = row;
    }

    /**
     *
     * @param pixels the pixel that has to be added
     *               the method writes pixel in the list of rows. If the row is full, new
     *               one is created
     */
    @Override
    public void createRow(Pixel pixels)throws PixelException {
        setRow(row);
        if (pixels.getNumber()==0||pixels.getNumber()==1){
            if (row.getPixelsList().size()<this.getWidth()){
                row.putInRow(pixels);}
            else {
                this.addRow(row);
                row=new Row();
                row.putInRow(pixels);}
        }else {
            throw new PixelException("The data of the file should be 1 or 0");
        }
    }

    public Row getRow() {
        return row;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }
}
