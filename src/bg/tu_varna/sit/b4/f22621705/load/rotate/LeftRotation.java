package bg.tu_varna.sit.b4.f22621705.load.rotate;

import bg.tu_varna.sit.b4.f22621705.load.ListOfImages;
import bg.tu_varna.sit.b4.f22621705.load.Load;
import bg.tu_varna.sit.b4.f22621705.open.FileOpen;
import bg.tu_varna.sit.b4.f22621705.save.SaveInFile;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LeftRotation {
    private FileOpen fileOpen;
    private SaveInFile saveInFile;
    private ListOfImages listOfImages;
    private Load load;
    private int newHeight;
    private int newWidth;
    public void rotateLeft(Map<Integer, Set<String>> session) throws IOException {
        load=new Load();

        Set<Map.Entry<Integer, Set<String>>> entries = load.getLoadMap().entrySet();
        int mapNumber=1;
        Iterator<String> iterator=session.get(mapNumber).iterator();
        while (iterator.hasNext()){
            fileOpen=new FileOpen();
            String s=iterator.next();
            fileOpen.readFile(s);
            newHeight=fileOpen.getHeight();
            newWidth=fileOpen.getWidth();
            StringBuilder str=fileOpen.getFormat();
            saveInFile=new SaveInFile();
            saveInFile.setHeight(newHeight);
            saveInFile.setWidth(newWidth);
            saveInFile.setFormat(str);
            StringBuilder newData=new StringBuilder();
            StringBuilder newNewData=new StringBuilder();
            fileOpen.getData().reverse();
            for (int checkLength=0;checkLength< fileOpen.getData().length();checkLength++){
                if (fileOpen.getData().charAt(checkLength)>47&&fileOpen.getData().charAt(checkLength)<58){
                    newNewData.append(fileOpen.getData().charAt(checkLength));}
            }

            for (int j=(newWidth-1);j>0;j--){
                newData.append(newNewData.charAt(j));
                for (int i=1;i<newHeight;i++){
                    newData.append(newNewData.charAt((j+(newWidth))*i));
                }
                newData.append("\n");
            }
            newData.append(newNewData.charAt(0));
            for (int i=1;i<newHeight;i++){
                newData.append(newNewData.charAt((newWidth)*i));
            }
            newData.append("\n");
            fileOpen.getData().reverse();
            System.out.println(newData);}

}}
