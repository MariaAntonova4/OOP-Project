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

public class LeftRotation {
    private SaveInPBMFile saveInFile;
    private List<Row> newRowList=new ArrayList<>();


    public void rotateLeft(Session session,int sessionNumber) throws IOException {
        Set<Map.Entry<Integer, Set<NetpbmFiles>>> entries = session.getSession().entrySet();

        for(Map.Entry<Integer, Set<NetpbmFiles>>entry:entries){
            if (entry.getKey()==sessionNumber){
            Iterator<NetpbmFiles> iterator=entry.getValue().iterator();
            NetpbmFiles s=iterator.next();
            int newWidth=s.getWidth();
            s.setWidth(s.getHeight());
            s.setHeight(newWidth);
            while (!s.showRows().isEmpty()){
                Iterator<Row>iterator2=s.showRows().iterator();
                Row newRow=new Row();
                while (iterator2.hasNext()){
                    Row i=(Row) iterator2.next();
                    if (!i.getPixelsList().isEmpty()){
                        Iterator<Pixel> iterators=i.getPixelsList().iterator();
                        while (iterators.hasNext()){
                            Pixel b=(Pixel) iterators.next();
                            if (!iterators.hasNext()){
                                newRow.putInRow(b);
                                i.deleteNumber(b);
                                break;}}


                    }else {s.getRows().clear();
                        break;
                    }
                }
                if (!newRow.getPixelsList().isEmpty()){newRowList.add(newRow);}

            }

            s.setRows(newRowList);

        }}}}







