package bg.tu_varna.sit.b4.f22621705.load.rotate;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.files.Pixel;
import bg.tu_varna.sit.b4.f22621705.files.Row;
import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.oldClasses.FileOpen;
import bg.tu_varna.sit.b4.f22621705.oldClasses.OpenPGM;
import bg.tu_varna.sit.b4.f22621705.oldClasses.OpenPPM;
import bg.tu_varna.sit.b4.f22621705.oldClasses.SaveInPBMFile;

import java.io.IOException;
import java.util.*;

public class LeftRotation {
    private SaveInPBMFile saveInFile;
    private List<Row> newRowList=new ArrayList<>();

    public FileOpen checkOpening(String fileName){
        if (fileName.contains(".pbm")){
            return null;//new OpenPBM()
        } else if (fileName.contains(".pgm")) {
            return new OpenPGM();
        }
        return new OpenPPM();
    }

    public void rotateLeft(Session session) throws IOException {
        Set<Map.Entry<Integer, Set<NetpbmFiles>>> entries = session.getSession().entrySet();

        for(Map.Entry<Integer, Set<NetpbmFiles>>entry:entries){
            Iterator<NetpbmFiles> iterator=entry.getValue().iterator();
            NetpbmFiles s=iterator.next();

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

        }}}







