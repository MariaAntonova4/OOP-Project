package bg.tu_varna.sit.b4.f22621705.files;

import java.util.*;

public class PBMFile implements NetpbmFiles{
    private String fileName;
    private String magicNumber="P";
    private static int maximumValue=1;
    private int width;
    private int height;
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

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getMagicNumber() {
        return magicNumber;
    }

    public void setMagicNumber(char magicNumberNum) {
        this.magicNumber = magicNumber+magicNumberNum;
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
}
