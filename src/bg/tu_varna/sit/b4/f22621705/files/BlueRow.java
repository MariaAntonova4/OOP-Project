package bg.tu_varna.sit.b4.f22621705.files;

import java.util.List;

public class BlueRow extends Row {

    @Override
    public List<Pixel> getPixelsList() {
        return super.getPixelsList();
    }

    @Override
    public void putInRow(Pixel pixels) {
        super.putInRow(pixels);
    }

    @Override
    public void setPixelsList(List<Pixel> pixelsList) {
        super.setPixelsList(pixelsList);
    }

    public Row paintRed(Row row){
        row=new BlueRow();

        return row;
    }
   }