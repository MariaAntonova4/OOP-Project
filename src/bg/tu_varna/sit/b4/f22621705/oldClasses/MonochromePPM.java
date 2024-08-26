package bg.tu_varna.sit.b4.f22621705.oldClasses;

import bg.tu_varna.sit.b4.f22621705.files.BlueRow;

import java.io.IOException;

public class MonochromePPM  {


    public StringBuilder turnMonochrome(String fileName) throws IOException {
        BlueRow openPPM=new BlueRow();
        Grayscale grayscale=new Grayscale();
        grayscale.turnGrayscale(fileName);
        MonochromePGM monochromePGM=new MonochromePGM();

        return monochromePGM.turnMonochrome(fileName);
    }
}
