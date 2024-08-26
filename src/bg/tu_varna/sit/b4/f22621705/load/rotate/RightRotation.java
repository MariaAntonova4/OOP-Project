package bg.tu_varna.sit.b4.f22621705.load.rotate;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.files.Pixel;
import bg.tu_varna.sit.b4.f22621705.files.Row;
import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.oldClasses.FileOpen;
import bg.tu_varna.sit.b4.f22621705.oldClasses.OpenPGM;
import bg.tu_varna.sit.b4.f22621705.files.BlueRow;
import bg.tu_varna.sit.b4.f22621705.oldClasses.SaveInPBMFile;

import java.io.IOException;
import java.util.*;

public class RightRotation {

    public void rotateRight(Session session) throws IOException {
        Set<Map.Entry<Integer, Set<NetpbmFiles>>> entries = session.getSession().entrySet();

        for(Map.Entry<Integer, Set<NetpbmFiles>>entry:entries){
            Iterator<NetpbmFiles> iterator=entry.getValue().iterator();
            NetpbmFiles s=iterator.next();
            List<Row> newRowList=new ArrayList<>();


            while (!s.showRows().isEmpty()){
                Iterator<Row>iterator2=s.showRows().iterator();


                while (iterator2.hasNext()){
                    Row i=(Row) iterator2.next();

                    if (!iterator2.hasNext()){
                        if (!i.getPixelsList().isEmpty()){
                        Iterator<Pixel> iterators=i.getPixelsList().iterator();
                        if (newRowList.isEmpty()){
                            while (iterators.hasNext()){
                            Pixel b=(Pixel) iterators.next();
                            Row newRow=new Row();
                            newRow.putInRow(b);
                            newRowList.add(newRow);
                        }
                            s.deleteRow(i);
                            break;}
else {
                           // while (iterators.hasNext()){
                                Iterator<Row>rowIterator=newRowList.iterator();

                                while (rowIterator.hasNext()){

                                    Pixel b=(Pixel) iterators.next();
                                    Row row=(Row)rowIterator.next();
                                    row.putInRow(b);
                                }

                            //}
                            s.deleteRow(i);
                            break;
                        }
                    }else {s.getRows().clear();
                        break;
                    }}

                }


                //s.deleteRow(i);
            }s.setRows(newRowList);

        }
    }}
