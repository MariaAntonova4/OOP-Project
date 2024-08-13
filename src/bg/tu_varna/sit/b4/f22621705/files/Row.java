package bg.tu_varna.sit.b4.f22621705.files;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.oldClasses.FileOpen;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Row {
    private List<Pixel>pixelsList=new ArrayList();

    public List<Pixel> getPixelsList() {
        if (!this.pixelsList.isEmpty()){
            Iterator<Pixel>iterator=this.pixelsList.iterator();
            while (iterator.hasNext()){
                Pixel i=(Pixel) iterator.next();

                System.out.println(i.getNumber());
            }}
        return pixelsList;
    }

    public void setPixelsList(List<Pixel> pixelsList) {
        this.pixelsList = pixelsList;
    }

    public void putInRow(Pixel pixels){
        pixelsList.add(pixels);
    }
}
