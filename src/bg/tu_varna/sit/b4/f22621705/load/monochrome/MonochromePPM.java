package bg.tu_varna.sit.b4.f22621705.load.monochrome;

import bg.tu_varna.sit.b4.f22621705.load.grayscale.Grayscale;
import bg.tu_varna.sit.b4.f22621705.files.BlueRow;

import java.io.IOException;

public class MonochromePPM implements Monochrome{

    @Override
    public StringBuilder turnMonochrome(String fileName) throws IOException {
        BlueRow openPPM=new BlueRow();
        Grayscale grayscale=new Grayscale();
        grayscale.turnGrayscale(fileName);
        MonochromePGM monochromePGM=new MonochromePGM();

        return monochromePGM.turnMonochrome(fileName);
    }
}
