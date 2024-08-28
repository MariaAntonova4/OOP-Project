package bg.tu_varna.sit.b4.f22621705.load.grayscale;

import bg.tu_varna.sit.b4.f22621705.files.*;
import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.Session;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GrayscaleFilter implements LoadCommands {
    /**
     *
     * @param session the session in which are stored the files
     * @return
     * @throws IOException
     * the function checks if the format is ppm and if it is calls the needed function which has to executed in new class
     */
    @Override
    public LoadCommands executeLoad(Session session,int sessionNumber) throws IOException {


        Set<Map.Entry<Integer, Set<NetpbmFiles>>> entries = session.getSession().entrySet();

        for(Map.Entry<Integer, Set<NetpbmFiles>>entry:entries){
            if (entry.getKey()==sessionNumber){
            Iterator<NetpbmFiles> iterator=entry.getValue().iterator();
                NetpbmFiles s=iterator.next();
            if (s.getFileName().contains(".ppm")){
            if (!s.showRows().isEmpty()){
                Iterator<Row> iterators=s.showRows().iterator();
                while (iterators.hasNext()){
                    Row b=(Row) iterators.next();
                    if (!b.getPixelsList().isEmpty()){

                        Iterator<Pixel> iteratorPixel=b.getPixelsList().iterator();
                        while (iteratorPixel.hasNext()){
                            Pixel pixel=(Pixel) iteratorPixel.next();
                            if (b instanceof RedRow){
                                pixel.setNumber((int) (pixel.getNumber()*0.21));
                            }
                            else if(b instanceof GreenRow){
                                pixel.setNumber((int)(pixel.getNumber()*0.71));
                            } else if (b instanceof BlueRow) {
                                pixel.setNumber((int)(pixel.getNumber()*0.07));
                            }
                        }
        }

    }
            }}
        }
    }session.addInHistory(sessionNumber,"grayscale");
        return null;}}

