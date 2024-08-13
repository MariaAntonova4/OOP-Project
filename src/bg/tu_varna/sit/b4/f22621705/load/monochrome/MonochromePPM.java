package bg.tu_varna.sit.b4.f22621705.load.monochrome;

import bg.tu_varna.sit.b4.f22621705.load.grayscale.Grayscale;
import bg.tu_varna.sit.b4.f22621705.oldClasses.OpenPPM;

import java.io.IOException;

public class MonochromePPM implements Monochrome{

    @Override
    public StringBuilder turnMonochrome(String fileName) throws IOException {
        OpenPPM openPPM=new OpenPPM();
        Grayscale grayscale=new Grayscale();
        grayscale.turnGrayscale(fileName);
        MonochromePGM monochromePGM=new MonochromePGM();

        return monochromePGM.turnMonochrome(fileName);
    }
}
