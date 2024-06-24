package bg.tu_varna.sit.b4.f22621705.load.negative;

import bg.tu_varna.sit.b4.f22621705.open.FileOpen;
import bg.tu_varna.sit.b4.f22621705.open.OpenPBM;

import java.io.IOException;

public class NegativePBM {
    private StringBuilder negativePBM=new StringBuilder();
    private FileOpen fileOpen;
    public StringBuilder turnPBMnegative(String fileName) throws IOException {
        OpenPBM fileOpen=new OpenPBM();
        fileOpen.readFile(fileName);
        System.out.println("This is PBM!");
        for (int dataLength=0;dataLength<fileOpen.cleanFormat().length();dataLength++){
            if (fileOpen.cleanFormat().charAt(dataLength)==49){
                negativePBM.append(0);
            }
            else {negativePBM.append(1);}
        }
        System.out.println(negativePBM);
        return negativePBM;
    }
}
