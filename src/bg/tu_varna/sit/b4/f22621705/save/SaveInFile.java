package bg.tu_varna.sit.b4.f22621705.save;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.files.Pixel;
import bg.tu_varna.sit.b4.f22621705.files.Row;
import bg.tu_varna.sit.b4.f22621705.menu.Menu;
import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.ConnectWithLoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.Session;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static bg.tu_varna.sit.b4.f22621705.oldClasses.SaveFile.filePath;

public class SaveInFile{
    private ConnectWithLoadCommands ee;
    private LoadCommands aa;

    public LoadCommands getAa() {
        return aa;
    }

    public void setAa(LoadCommands aa) {
        this.aa = aa;
    }

    public ConnectWithLoadCommands getEe() {
        return ee;
    }

    public void setEe(ConnectWithLoadCommands ee) {
        this.ee = ee;
    }

   /* public SaveInFile(Session session) {
        this.session = session;
    }*/

    /**
     *
     * @param session the session with the files
     * @return
     * @throws IOException
     * The function checks the format of the file and calls save method for the file format
     */
    public Menu saveFile(Session session) throws IOException {
        Set<Map.Entry<Integer, Set<NetpbmFiles>>>entries=session.getSession().entrySet();
            for(Map.Entry<Integer, Set<NetpbmFiles>>entry:entries){
                Iterator<NetpbmFiles> iterator=entry.getValue().iterator();
                NetpbmFiles netpbmFiles=iterator.next();
                File file=new File("C:\\Users\\Asus\\Desktop\\OOP-PROJECT\\OOP-Project\\Files\\"+netpbmFiles.getFileName());
                FileOutputStream fileWriter=new FileOutputStream(file);
                fileWriter.write(netpbmFiles.getMagicNumber().getBytes());
                fileWriter.write('\n');
                fileWriter.write(String.valueOf(netpbmFiles.getHeight()).getBytes());
                fileWriter.write(' ');
                fileWriter.write(netpbmFiles.getWidth()+'0');
                fileWriter.write('\n');
                if (!netpbmFiles.getFileName().contains(".pbm")){
                    fileWriter.write(netpbmFiles.getMaximumValue());
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
        System.out.println("Success!:)");
        return null;
    }
}
