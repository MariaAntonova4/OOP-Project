package bg.tu_varna.sit.b4.f22621705.menu.models.load.models.negative;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.files.row.Pixel;
import bg.tu_varna.sit.b4.f22621705.files.row.Row;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.LoadMenu;
import bg.tu_varna.sit.b4.f22621705.files.Session;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Negative implements LoadMenu {
    /**
     *
     * @param session the session in which the files are put
     * @return
     * @throws IOException
     * the function checks if the pixel of the function is 0. If it is written the
     * maximum value. If the pixel is not 0 the maximum value is from the current pixel
     */
    @Override
    public LoadMenu executeLoad(Session session, int sessionNumber) throws IOException {

            Iterator<NetpbmFiles> iterator=session.currentSession(session, sessionNumber).iterator();
            while (iterator.hasNext()){
            NetpbmFiles netpbmFiles=iterator.next();

            int max=netpbmFiles.getMaximumValue();

            if (!netpbmFiles.showRows().isEmpty()){
                Iterator<Row>rowIterator=netpbmFiles.showRows().iterator();
                while (rowIterator.hasNext()){
                    Row row=(Row) rowIterator.next();

                    if (!row.getPixelsList().isEmpty()){
                        Iterator<Pixel> pixelIterator=row.getPixelsList().iterator();
                        while (pixelIterator.hasNext()){
                            Pixel pixel=(Pixel) pixelIterator.next();
                            if (pixel.getNumber()==0){
                                pixel.setNumber(max);
                            }else pixel.setNumber(max-pixel.getNumber());
                        }}
                }
            }}
                System.out.println("The files are negative");
        session.addInHistory(sessionNumber,"negative");
        return null;
        }}