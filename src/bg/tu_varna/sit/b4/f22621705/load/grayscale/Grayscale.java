package bg.tu_varna.sit.b4.f22621705.load.grayscale;

import bg.tu_varna.sit.b4.f22621705.files.BlueRow;

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

    public StringBuilder turnGrayscale(String fileName) throws IOException {
      /*  int i=0;
        double d=0;
        BlueRow openPPM=new BlueRow();
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
                else {
                    if (dataLength + 1 == openPPM.getData().length()) {
                        jj++;
                        break;
                    }
                }
        System.out.println(grayscale);
*/
        return null;}}
