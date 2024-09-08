package bg.tu_varna.sit.b4.f22621705.files.row;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Row {
    private List<Pixel>pixelsList=new ArrayList();

    public List<Pixel> getPixelsList() {
        if (!this.pixelsList.isEmpty()){
            Iterator<Pixel>iterator=this.pixelsList.iterator();
            while (iterator.hasNext()){
                Pixel pixel=(Pixel) iterator.next();
            }}
        return pixelsList;
    }

    public void setPixelsList(List<Pixel> pixelsList) {
        this.pixelsList = pixelsList;
    }

    /**
     *
     * @param pixels the pixel that has to be added in the list
     *               the method adds pixel in the list
     */
    public void putInRow(Pixel pixels){
        pixelsList.add(pixels);
    }

    /**
     *
     * @param pixel the pixel that has to be removed
     *              the method removes pixel from the list
     */
    public void deleteNumber(Pixel pixel){pixelsList.remove(pixel);}
}
