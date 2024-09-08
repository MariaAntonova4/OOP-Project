package bg.tu_varna.sit.b4.f22621705.menu.models.load.models.rotate;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.files.row.Pixel;
import bg.tu_varna.sit.b4.f22621705.files.row.Row;
import bg.tu_varna.sit.b4.f22621705.files.Session;
import bg.tu_varna.sit.b4.f22621705.oldClasses.SaveInPBMFile;

import java.io.IOException;
import java.util.*;

public class LeftRotation {
    private SaveInPBMFile saveInFile;
    private List<Row> newRowList=new ArrayList<>();

    /**
     *
     * @param session the session
     * @param sessionNumber the number of the current session
     * @throws IOException
     * the method the width and the height. Creates a new row in which the data has to be
     * written. Finds the last pixeles of all rows and writes them in the new row. After
     * putting the pixels are written in the new row they are deleted from the old one.
     * After all pixels are written the new row is added in the file and a new one is
     * created for the other pixels for the old rows. The algorithm repeates
     */

    public void rotateLeft(Session session,int sessionNumber) throws IOException {
        Set<Map.Entry<Integer, Set<NetpbmFiles>>> entries = session.getSession().entrySet();

        for(Map.Entry<Integer, Set<NetpbmFiles>>entry:entries){
            if (entry.getKey()==sessionNumber){
            Iterator<NetpbmFiles> iterator=entry.getValue().iterator();
            while (iterator.hasNext()){
            NetpbmFiles netpbmFiles=iterator.next();
            int newWidth=netpbmFiles.getWidth();
            netpbmFiles.setWidth(netpbmFiles.getHeight());
            netpbmFiles.setHeight(newWidth);
            while (!netpbmFiles.showRows().isEmpty()){
                Iterator<Row>rowIterator=netpbmFiles.showRows().iterator();
                Row newRow=new Row();
                while (rowIterator.hasNext()){
                    Row row=(Row) rowIterator.next();
                    if (!row.getPixelsList().isEmpty()){
                        Iterator<Pixel> pixelIterator=row.getPixelsList().iterator();
                        while (pixelIterator.hasNext()){
                            Pixel pixel=(Pixel) pixelIterator.next();
                            if (!pixelIterator.hasNext()){
                                newRow.putInRow(pixel);
                                row.deleteNumber(pixel);
                                break;}}


                    }else {netpbmFiles.getRows().clear();
                        break;
                    }
                }
                if (!newRow.getPixelsList().isEmpty()){newRowList.add(newRow);}

            }

            netpbmFiles.setRows(newRowList);
            newRowList=new ArrayList<>();
            }
        }}}}







