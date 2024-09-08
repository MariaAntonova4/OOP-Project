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

public class Monochrome implements LoadMenu {
    /**
     *
     * @param session the session with the files in it
     * @return
     * @throws IOException
     * the function finds the current session, takes all the files that are not PBM files
     * and finds the middle by dividing the maximum number. If the pixel is less than the middle
     * number 0 is set as pixel. If it is more the maximum value is written
     */
    @Override
    public LoadMenu executeLoad(Session session, int sessionNumber) throws IOException {
        Set<Map.Entry<Integer, Set<NetpbmFiles>>> entries = session.getSession().entrySet();

        for(Map.Entry<Integer, Set<NetpbmFiles>>entry:entries){
            if (entry.getKey()==sessionNumber){
            Iterator<NetpbmFiles> iterator=entry.getValue().iterator();
            while (iterator.hasNext()){
            NetpbmFiles netpbmFiles=iterator.next();
            if (!netpbmFiles.getFileName().contains(".pbm")){
                if (!netpbmFiles.showRows().isEmpty()){
                    Iterator<Row> rowIterator=netpbmFiles.showRows().iterator();
                    while (rowIterator.hasNext()){
                        Row row=(Row) rowIterator.next();
                        if (!row.getPixelsList().isEmpty()){

                            Iterator<Pixel> iteratorPixel=row.getPixelsList().iterator();
                            while (iteratorPixel.hasNext()){
                                Pixel pixel=(Pixel) iteratorPixel.next();
                                if (pixel.getNumber()<(netpbmFiles.getMaximumValue()/2)){
                                    pixel.setNumber(0);
                                }
                                else {pixel.setNumber(netpbmFiles.getMaximumValue());}
                            }
                        }

                    }
                }

    }
            }
        }
            System.out.println("The command monochrome is executed");}
        session.addInHistory(sessionNumber,"monochrome");
        return null;
    }
}
