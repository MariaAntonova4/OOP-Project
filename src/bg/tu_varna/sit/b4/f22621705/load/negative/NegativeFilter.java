package bg.tu_varna.sit.b4.f22621705.load.negative;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.files.Pixel;
import bg.tu_varna.sit.b4.f22621705.files.Row;
import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.Session;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NegativeFilter implements LoadCommands {
    /**
     *
     * @param session the session in which the files are put
     * @return
     * @throws IOException
     * the function checks for the format of the file and calls the needed function in new class
     */
    @Override
    public LoadCommands executeLoad(Session session,int sessionNumber) throws IOException {
       Set<Map.Entry<Integer, Set<NetpbmFiles>>> entries = session.getSession().entrySet();
        System.out.println("This is the negative picture:");

        for(Map.Entry<Integer, Set<NetpbmFiles>>entry:entries){
            if (entry.getKey()==sessionNumber){
            Iterator<NetpbmFiles> iterator=entry.getValue().iterator();
            while (iterator.hasNext()){
            NetpbmFiles s=iterator.next();

            int max=s.getMaximumValue();

            if (!s.showRows().isEmpty()){
                Iterator<Row>iterator2=s.showRows().iterator();
                while (iterator2.hasNext()){
                    Row i=(Row) iterator2.next();

                    if (!i.getPixelsList().isEmpty()){
                        Iterator<Pixel> iterators=i.getPixelsList().iterator();
                        while (iterators.hasNext()){
                            Pixel b=(Pixel) iterators.next();
                            if (b.getNumber()==0){
                                b.setNumber(max);
                            }else b.setNumber(max-b.getNumber());
                        }}
                }
            }}
        }}session.addInHistory(sessionNumber,"negative");
        return null;

        }
        }
