package bg.tu_varna.sit.b4.f22621705.oldClasses;

import bg.tu_varna.sit.b4.f22621705.menu.models.Menu;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class SaveInPGMFile implements SaveFile{
    @Override
    public Menu saveFile(String fileName,StringBuilder stringBuilder) throws IOException {
        File file=new File(filePath+fileName);
        FileOutputStream fileWriter=new FileOutputStream(file);
        /*Commands openPGM=new Commands();
        openPGM.readFile(fileName);
        fileWriter.write(openPGM.getMagicNumber().charAt(0));
        fileWriter.write(openPGM.getMagicNumber().charAt(1));
        fileWriter.write('\n');
        fileWriter.write(openPGM.getHeight());
        fileWriter.write(" ".getBytes());
        fileWriter.write(openPGM.getWidth());
        fileWriter.write('\n');
        fileWriter.write(openPGM.getMaxValue());
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
