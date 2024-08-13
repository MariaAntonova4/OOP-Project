package bg.tu_varna.sit.b4.f22621705.load.grayscale;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.files.Pixel;
import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.Session;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GrayscaleFilter implements LoadCommands {
    /**
     *
     * @param session the session in which are stored the files
     * @return
     * @throws IOException
     * the function checks if the format is ppm and if it is calls the needed function which has to executed in new class
     */
    @Override
    public LoadCommands executeLoad(Session session) throws IOException {


        Set<Map.Entry<Integer, Set<NetpbmFiles>>> entries = session.getSession().entrySet();

        for(Map.Entry<Integer, Set<NetpbmFiles>>entry:entries){
            Iterator<NetpbmFiles> iterator=entry.getValue().iterator();
                NetpbmFiles s=iterator.next();

          /*  if (!s.getPixels().isEmpty()){
                Iterator<Pixel> iterators=s.getPixels().iterator();
                while (iterators.hasNext()){
                    Pixel b=(Pixel) iterators.next();
                    if (b.getNumber()==0){
                        b.setNumber(max);
                    }else b.setNumber(max-b.getNumber());
                }}


            if (isRedFlag()==true){
                    i= (int) (i*0.21);
                    grayscale.append(" ")
                            .append(i);
                    if (openPPM.getData().charAt(dataLength+1)==' '){
                        setRedFlag(false);
                        setGreenFlag(true);}
                } else if (isGreenFlag()==true) {
                    i= (int) (i*0.71);
                    grayscale.append(" ")
                            .append(i);
                    if (openPPM.getData().charAt(dataLength+1)==' '){
                        setRedFlag(false);
                        setGreenFlag(false);}
                }else{
                    i= (int) (i*0.07);
                    grayscale.append(" ")
                            .append(i);
                }
            }dataLength++;
        }

    }*/
            }
        return null;}
    }

