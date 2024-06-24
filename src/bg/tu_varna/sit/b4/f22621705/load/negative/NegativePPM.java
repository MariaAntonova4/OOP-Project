package bg.tu_varna.sit.b4.f22621705.load.negative;

import bg.tu_varna.sit.b4.f22621705.open.OpenPGM;

import java.io.IOException;

public class NegativePPM {
    private StringBuilder negativePPM=new StringBuilder();
    public StringBuilder turnPPMnegative(String fileName) throws IOException {
        int i;
        OpenPGM openPGM=new OpenPGM();
        openPGM.readFile(fileName);

        for (int dataLength=0;dataLength<openPGM.cleanFormat().length();dataLength++){
            i=Character.getNumericValue(openPGM.cleanFormat().charAt(dataLength));
            if (i==0) {
                negativePPM.append(openPGM.getMaxValue())
                        .append(" ");
            }
            else{
                negativePPM.append((openPGM.getMaxValue())-i)
                        .append(" ");
            }
        }
        System.out.println(negativePPM);
        return negativePPM;
    }
}
