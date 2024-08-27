package bg.tu_varna.sit.b4.f22621705.oldClasses;

import bg.tu_varna.sit.b4.f22621705.menu.Menu;
import bg.tu_varna.sit.b4.f22621705.files.BlueRow;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class SaveAsPPM {
    public Menu saveAsFile(String fileName, StringBuilder stringBuilder,String fileDirector) throws IOException {
       /* File file=new File(fileDirector+fileName);
        FileOutputStream fileWriter=new FileOutputStream(file);
        BlueRow openPPM=new BlueRow();
        openPPM.readFile(fileName);
        fileWriter.write(openPPM.getMagicNumber().charAt(0));
        fileWriter.write(openPPM.getMagicNumber().charAt(1));
        fileWriter.write('\n');
        fileWriter.write(openPPM.getHeight());
        fileWriter.write(" ".getBytes());
        fileWriter.write(openPPM.getWidth());
        fileWriter.write('\n');
        fileWriter.write(openPPM.getMaxValue());
        fileWriter.write('\n');
        int dataLength=1;
        while(dataLength<stringBuilder.length()){
            if (stringBuilder.charAt(dataLength)=='\n'){
                fileWriter.write('\n');}else {
                fileWriter.write(stringBuilder.charAt(dataLength));
            }
            dataLength++;
        } System.out.println("> save\n" +
                "Successfully saved"+fileName);
        fileWriter.close();*/
        return null;
    }
}
