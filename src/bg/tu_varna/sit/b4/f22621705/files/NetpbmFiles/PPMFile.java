package bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.filesInterface.MethodsOfFiles;
import bg.tu_varna.sit.b4.f22621705.files.row.Pixel;
import bg.tu_varna.sit.b4.f22621705.files.row.Row;
import bg.tu_varna.sit.b4.f22621705.files.row.colorRows.BlueRow;
import bg.tu_varna.sit.b4.f22621705.files.row.colorRows.GreenRow;
import bg.tu_varna.sit.b4.f22621705.files.row.colorRows.RedRow;

import java.util.*;

public class PPMFile extends NetpbmFiles implements MethodsOfFiles {
    private String fileName;
    private String magicNumber="P";
    private int maximumValue;
    private int width;
    private int height;
    private Row rowColor;
    private List<Row>rows=new ArrayList<>();

    public Row getRow() {
        return rowColor;
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

    public void setMagicNumber(int magicNumber1) {
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

    /**
     *
     * @param row the row that has to be added
     *            Adds a new row in the list
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

    /**
     * Removes a row from the list
     * @param row the row that has to be deleted
     */
    @Override
    public void deleteRow(Row row) {
        this.rows.remove(row);
    }

    public List<Row> getRows() {
        return rows;
    }

    public void setRow(Row row) {
        if (row==null){
            this.rowColor=new RedRow();
        }
        else{this.rowColor = rowColor;}
    }

    /**
     *
     * @param pixels the pixel that has to be added
     *               thr method checks the row. If it's empty creates a Red Row. Puts the
     *               pixel in the row. If the row is full checks which was the previous row.
     *               If it's red creates a Green Row and adds the pixel in the row. If the
     *               row was green creates a Blue Row and puts the pixel there. If the row
     *               was blue creates a Red Row and puts the pixel.
     *
     */
    @Override
    public void createRow(Pixel pixels) throws PixelException{
        setRow(rowColor);
        if (pixels.getNumber()<=this.getMaximumValue()){
        if (rowColor.getPixelsList().size()<this.getWidth()){
            rowColor.putInRow(pixels);
        }
        else if(rowColor instanceof RedRow){

             addRow(rowColor);
            rowColor=new GreenRow();
            rowColor.putInRow(pixels);
            } else if (rowColor instanceof GreenRow) {
            addRow(rowColor);
            rowColor=new BlueRow();
            rowColor.putInRow(pixels);
        }else if(rowColor instanceof BlueRow){
            addRow(rowColor);
            rowColor=new RedRow();
            rowColor.putInRow(pixels);
        }}
        else {throw new PixelException("The number should not be below the maximum value");}
    }

    @Override
    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

}
