package bg.tu_varna.sit.b4.f22621705.oldClasses;

import bg.tu_varna.sit.b4.f22621705.oldClasses.OpenPGM;

import java.io.IOException;

public class NegativePGM {
    private StringBuilder negativePBM=new StringBuilder();
    public StringBuilder turnPGMnegative(String fileName) throws IOException {
        int i;
        OpenPGM openPGM=new OpenPGM();
        openPGM.readFile(fileName);

        for (int dataLength=0;dataLength<openPGM.cleanFormat().length();dataLength++){
            i=Character.getNumericValue(openPGM.cleanFormat().charAt(dataLength));
            if (i==0) {
            negativePBM.append(openPGM.getMaxValue())
                    .append(" ");
        }
        else{
            negativePBM.append((openPGM.getMaxValue())-i)
                    .append(" ");
        }
            }
        System.out.println(negativePBM);
        return negativePBM;
        }}
