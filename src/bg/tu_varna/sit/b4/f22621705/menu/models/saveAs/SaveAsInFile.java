package bg.tu_varna.sit.b4.f22621705.menu.models.saveAs;
import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.files.row.Pixel;
import bg.tu_varna.sit.b4.f22621705.files.row.Row;
import bg.tu_varna.sit.b4.f22621705.menu.models.Menu;

import bg.tu_varna.sit.b4.f22621705.files.Session;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class SaveAsInFile {
    private String filePath;

    public SaveAsInFile(String filePath) {
        this.filePath = filePath;
    }

    public Menu saveAsFile(Session session) throws IOException {
            Set<Map.Entry<Integer, Set<NetpbmFiles>>>entries=session.getSession().entrySet();
            for(Map.Entry<Integer, Set<NetpbmFiles>>entry:entries){
                Iterator<NetpbmFiles> iterator=entry.getValue().iterator();
                while (iterator.hasNext()){
                NetpbmFiles netpbmFiles=iterator.next();
                File file=new File(filePath+netpbmFiles.getFileName());
                FileOutputStream fileWriter=new FileOutputStream(file);
                fileWriter.write(netpbmFiles.getMagicNumber().getBytes());
                fileWriter.write('\n');
                fileWriter.write(String.valueOf(netpbmFiles.getHeight()).getBytes());
                fileWriter.write(' ');
                fileWriter.write(netpbmFiles.getWidth()+'0');
                fileWriter.write('\n');
                if (!netpbmFiles.getFileName().contains(".pbm")){
                    fileWriter.write(netpbmFiles.getMaximumValue()+'0');
                    fileWriter.write('\n');
                }
                Iterator<Row>iterator3=netpbmFiles.showRows().iterator();
                while(iterator3.hasNext()){
                    Row r=(Row)iterator3.next();
                    Iterator<Pixel>iterator4=r.getPixelsList().iterator();
                    while (iterator4.hasNext()){
                        Pixel p=(Pixel)iterator4.next();
                        fileWriter.write(p.getNumber()+'0');
                        fileWriter.write(' ');
                    }
                    fileWriter.write('\n');
                }
                System.out.println("Successfully saved "+netpbmFiles.getFileName());
                fileWriter.close();
            }
            } return null;
        }

}
