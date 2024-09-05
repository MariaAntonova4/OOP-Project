package bg.tu_varna.sit.b4.f22621705.menu.models.load.models.monochrome;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.files.row.Pixel;
import bg.tu_varna.sit.b4.f22621705.files.row.Row;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.LoadMenu;
import bg.tu_varna.sit.b4.f22621705.files.Session;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MonochromeFilter implements LoadMenu {
    /**
     *
     * @param session the session with the files in it
     * @return
     * @throws IOException
     * the function checks the format of the file and calls the needed function in new class
     */
    @Override
    public LoadMenu executeLoad(Session session, int sessionNumber) throws IOException {
        Set<Map.Entry<Integer, Set<NetpbmFiles>>> entries = session.getSession().entrySet();


        for(Map.Entry<Integer, Set<NetpbmFiles>>entry:entries){
            if (entry.getKey()==sessionNumber){
            Iterator<NetpbmFiles> iterator=entry.getValue().iterator();
            while (iterator.hasNext()){
            NetpbmFiles s=iterator.next();
            if (!s.getFileName().contains(".pbm")){
                if (!s.showRows().isEmpty()){
                    Iterator<Row> iterators=s.showRows().iterator();
                    while (iterators.hasNext()){
                        Row b=(Row) iterators.next();
                        if (!b.getPixelsList().isEmpty()){

                            Iterator<Pixel> iteratorPixel=b.getPixelsList().iterator();
                            while (iteratorPixel.hasNext()){
                                Pixel pixel=(Pixel) iteratorPixel.next();
                                if (pixel.getNumber()<(s.getMaximumValue()/2)){
                                    pixel.setNumber(0);
                                }
                                else {pixel.setNumber(s.getMaximumValue());}
                            }
                        }

                    }
                }

    }
            }
        }}
        session.addInHistory(sessionNumber,"monochrome");
        return null;
    }
}
