package bg.tu_varna.sit.b4.f22621705.files;

import java.util.*;

public class PPMFile implements NetpbmFiles{
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
        //setRow(row);
        rows.add(row);
        //colorRow.colorRow(row);
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

    public void setRow(Row row) {
        if (row==null){
            this.rowColor=new RedRow();
        }
        else{this.rowColor = rowColor;}
    }
    @Override
    public void createRow(Pixel pixels) {
        setRow(rowColor);
        //ColorRow row;row=
        if (rowColor.getPixelsList().size()<this.getWidth()){
            rowColor.putInRow(pixels);
            //setColorRow(row);// .createColorRow();//
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
        }
    }

    @Override
    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

}
