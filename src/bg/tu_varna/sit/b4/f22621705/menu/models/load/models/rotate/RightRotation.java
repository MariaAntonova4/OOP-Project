package bg.tu_varna.sit.b4.f22621705.menu.models.load.models.rotate;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.files.row.Pixel;
import bg.tu_varna.sit.b4.f22621705.files.row.Row;
import bg.tu_varna.sit.b4.f22621705.files.Session;

import java.io.IOException;
import java.util.*;

public class RightRotation {
    /**
     *
     * @param session the session
     * @param sessionNumber the number of the current session
     * @throws IOException
     * the session finds the current session, the height and the width, finds the last row
     * and creates a new row for every pixel. The old row is deleted. Takes the previous row
     * and puts a pixel in every new row created earlier. After all the pixels are added
     * the new row list is added in the file
     */
    public void rotateRight(Session session,int sessionNumber) throws IOException {
        Set<Map.Entry<Integer, Set<NetpbmFiles>>> entries = session.getSession().entrySet();

        for(Map.Entry<Integer, Set<NetpbmFiles>>entry:entries){
            if (entry.getKey()==sessionNumber){
            Iterator<NetpbmFiles> iterator=entry.getValue().iterator();
            while (iterator.hasNext()){
            NetpbmFiles netpbmFiles=iterator.next();
            List<Row> newRowList=new ArrayList<>();
            int newHeight=netpbmFiles.getWidth();
            netpbmFiles.setWidth(netpbmFiles.getHeight());
            netpbmFiles.setHeight(newHeight);
            while (!netpbmFiles.showRows().isEmpty()){
                Iterator<Row>rowIterator=netpbmFiles.showRows().iterator();
                while (rowIterator.hasNext()){
                    Row row=(Row) rowIterator.next();
                    if (!rowIterator.hasNext()){
                        if (!row.getPixelsList().isEmpty()){
                        Iterator<Pixel> pixelIterator=row.getPixelsList().iterator();
                        if (newRowList.isEmpty()){
                            while (pixelIterator.hasNext()){
                            Pixel pixel=(Pixel) pixelIterator.next();
                            Row newRow=new Row();
                            newRow.putInRow(pixel);
                            newRowList.add(newRow);
                        }
                            netpbmFiles.deleteRow(row);
                            break;}
                        else {
                                Iterator<Row>rowIterator2=newRowList.iterator();

                                while (rowIterator2.hasNext()){

                                    Pixel pixel=(Pixel) pixelIterator.next();
                                    Row row2=(Row)rowIterator2.next();
                                    row2.putInRow(pixel);
                                }
                            netpbmFiles.deleteRow(row);
                            break;
                        }
                    }else {netpbmFiles.getRows().clear();
                        break;
                    }}

                }
            }netpbmFiles.setRows(newRowList);

            }
        }}
    }}
