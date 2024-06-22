package bg.tu_varna.sit.b4.f22621705.load.monochrome;


import bg.tu_varna.sit.b4.f22621705.open.OpenPGM;

import java.io.IOException;

public class MonochromePGM implements Monochrome{
    private StringBuilder monoPGM=new StringBuilder();
    @Override
    public void turnMonochrome(String fileName) throws IOException {
        OpenPGM openPGM=new OpenPGM();
        int i=0;
        openPGM.readFile(fileName);
        int dataLength=1;
        while (dataLength<openPGM.getData().length()){
            if (openPGM.getData().charAt(dataLength)=='\n'){
                monoPGM.append("\n");
            }else {
                if(openPGM.getData().charAt(dataLength)>47&&openPGM.getData().charAt(dataLength)<58){
                    i=Character.getNumericValue(openPGM.getData().charAt(dataLength));
                if (i<(openPGM.getMaxValue()/2))
            {
                monoPGM.append(0)
                        .append(" ");
            }else monoPGM.append(openPGM.getMaxValue())
                        .append(" ");}


        }dataLength++;}
        System.out.println(monoPGM);}}
