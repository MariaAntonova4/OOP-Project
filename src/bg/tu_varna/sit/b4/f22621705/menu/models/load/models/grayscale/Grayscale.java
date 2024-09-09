package bg.tu_varna.sit.b4.f22621705.menu.models.load.models.grayscale;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.PPMFile;
import bg.tu_varna.sit.b4.f22621705.files.row.Pixel;
import bg.tu_varna.sit.b4.f22621705.files.row.Row;
import bg.tu_varna.sit.b4.f22621705.files.row.colorRows.BlueRow;
import bg.tu_varna.sit.b4.f22621705.files.row.colorRows.GreenRow;
import bg.tu_varna.sit.b4.f22621705.files.row.colorRows.RedRow;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.LoadMenu;
import bg.tu_varna.sit.b4.f22621705.files.Session;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Grayscale implements LoadMenu {
    /**
     *
     * @param session the session in which are stored the files
     * @return
     * @throws IOException
     * the function finds the current session, takes all the PPM files and checks the
     * color of the row. Depending on the row, the pixel is to a surten number
     */
    @Override
    public LoadMenu executeLoad(Session session, int sessionNumber) throws IOException {


            Iterator<NetpbmFiles> iterator=session.currentSession(session, sessionNumber).iterator();
            while (iterator.hasNext()){
                NetpbmFiles netpbmFiles=iterator.next();
            if (netpbmFiles instanceof PPMFile){
            if (!netpbmFiles.showRows().isEmpty()){
                Iterator<Row> rowIterator=netpbmFiles.showRows().iterator();
                while (rowIterator.hasNext()){
                    Row row=(Row) rowIterator.next();
                    if (!row.getPixelsList().isEmpty()){

                        Iterator<Pixel> iteratorPixel=row.getPixelsList().iterator();
                        while (iteratorPixel.hasNext()){
                            Pixel pixel=(Pixel) iteratorPixel.next();
                            if (row instanceof RedRow){
                                pixel.setNumber((int) (pixel.getNumber()*0.21));
                            }
                            else if(row instanceof GreenRow){
                                pixel.setNumber((int)(pixel.getNumber()*0.71));
                            } else if (row instanceof BlueRow) {
                                pixel.setNumber((int)(pixel.getNumber()*0.07));
                            }
                        }}
                }}
            }}

    System.out.println("The command grayscale is executed");
        session.addInHistory(sessionNumber,"grayscale");
        return null;}}
