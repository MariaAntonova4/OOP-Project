package bg.tu_varna.sit.b4.f22621705.load.grayscale;

import bg.tu_varna.sit.b4.f22621705.open.OpenPPM;

import java.io.IOException;

public class Grayscale {
    private StringBuilder grayscale=new StringBuilder();
    private boolean redFlag;
    private boolean greenFlag;

    public boolean isRedFlag() {
        return redFlag;
    }

    public void setRedFlag(boolean redFlag) {
        this.redFlag = redFlag;
    }

    public boolean isGreenFlag() {
        return greenFlag;
    }

    public void setGreenFlag(boolean greenFlag) {
        this.greenFlag = greenFlag;
    }

    public void turnGrayscale(String fileName) throws IOException {
        int i=0;
        double d=0;
        OpenPPM openPPM=new OpenPPM();
        openPPM.readFile(fileName);
        System.out.println("Grayscale: ");
        int jj=0;
        int dataLength=1;

            while (dataLength<openPPM.getData().length()){
                if (openPPM.getData().charAt(dataLength)=='\n'){
                    grayscale.append("\n");
                    jj++;
                    dataLength++;
                    setRedFlag(true);
                }
                else{
                        if (dataLength+1==openPPM.getData().length()){
                            jj++;
                            break;}
                        if(openPPM.getData().charAt(dataLength)>47&&openPPM.getData().charAt(dataLength)<58){
                            i=Character.getNumericValue(openPPM.getData().charAt(dataLength));
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

        }
        System.out.println(grayscale);
    }}
