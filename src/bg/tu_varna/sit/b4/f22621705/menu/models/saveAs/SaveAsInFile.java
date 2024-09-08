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
    /**
     *
     * @param session the session with the files
     * @return
     * @throws IOException
     * The function sets the directorial and writes the data in the file such as maximum
     * value, height, magic number...Then takes from every row every pixel and saves it in
     * the original file. The numbers have to be converted in string format so that it
     * can be written in the file
     */
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
                Iterator<Row>iteratorRow=netpbmFiles.showRows().iterator();
                while(iteratorRow.hasNext()){
                    Row row=(Row)iteratorRow.next();
                    Iterator<Pixel>iteratorPixel=row.getPixelsList().iterator();
                    while (iteratorPixel.hasNext()){
                        Pixel pixel=(Pixel)iteratorPixel.next();
                        fileWriter.write(pixel.getNumber()+'0');
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
