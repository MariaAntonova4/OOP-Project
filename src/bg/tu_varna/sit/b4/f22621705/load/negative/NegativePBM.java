package bg.tu_varna.sit.b4.f22621705.load.negative;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.files.Pixel;
import bg.tu_varna.sit.b4.f22621705.open.FileOpen;
import bg.tu_varna.sit.b4.f22621705.open.OpenedFiles;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

public class NegativePBM {
    private StringBuilder negativePBM=new StringBuilder();
    private FileOpen fileOpen;
    public StringBuilder turnPBMnegative(NetpbmFiles netpbmFiles) throws IOException {
        //OpenedFiles fileOpen=new OpenedFiles();
        //fileOpen.readFile(fileName);
        System.out.println("This is PBM!");
        /*for (int dataLength=0;dataLength<fileOpen.cleanFormat().length();dataLength++){
            if (fileOpen.cleanFormat().charAt(dataLength)==49){
                negativePBM.append(0);
            }
            else {negativePBM.append(1);}
        }*/
        int max=netpbmFiles.getMaximumValue();
        if (!netpbmFiles.getPixels().isEmpty()){
            Iterator<Pixel> iterator=netpbmFiles.getPixels().iterator();
            while (iterator.hasNext()){
                Pixel b=(Pixel) iterator.next();
                if (b.getNumber()==0){
                    b.setNumber(max);
                }else b.setNumber(max-b.getNumber());
            }}
        System.out.println(netpbmFiles.getPixels());
        return negativePBM;
    }
}
