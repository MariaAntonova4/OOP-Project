package bg.tu_varna.sit.b4.f22621705.oldClasses;

import bg.tu_varna.sit.b4.f22621705.files.Row;

public class ColorRow extends Row {
   /* private ColorRow colorRow;
    public ColorRow(ColorRow colorRow) {
        this.colorRow = colorRow;
    }

    public ColorRow getColorRow() {
        return colorRow;
    }

    public void setColorRow(ColorRow colorRow) {
        this.colorRow = colorRow;
    }
    public void paintColorRow(){
        if (!(this instanceof RedRow)&&!(this instanceof GreenRow)&&!(this instanceof BlueRow)){
            setColorRow(new RedRow());
        } else if (colorRow instanceof RedRow&&colorRow.getPixelsList().size()==size) {
            colorRow=new GreenRow();
        } else if (colorRow instanceof GreenRow&&colorRow.getPixelsList().size()==size) {
            colorRow=new BlueRow();
        }
    }
    public ColorRow colorRow(int size,Pixel pixel){
        if (!(this instanceof RedRow)&&!(this instanceof GreenRow)&&!(this instanceof BlueRow)){
            setColorRow(new RedRow());
            this.putInRow(pixel);
            return this;
        } else if (colorRow instanceof RedRow&&colorRow.getPixelsList().size()==size) {
            colorRow=new GreenRow();
            colorRow.putInRow(pixel);
        } else if (colorRow instanceof GreenRow&&colorRow.getPixelsList().size()==size) {
            colorRow=new BlueRow();
            colorRow.putInRow(pixel);
        }
        return null;
    }*/
}
