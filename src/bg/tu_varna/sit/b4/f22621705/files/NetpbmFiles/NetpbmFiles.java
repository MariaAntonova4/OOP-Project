package bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.filesInterface.MethodsOfFiles;
import bg.tu_varna.sit.b4.f22621705.files.row.Pixel;
import bg.tu_varna.sit.b4.f22621705.files.row.Row;

import java.util.List;

public abstract class NetpbmFiles implements MethodsOfFiles {

    public abstract List<Row> showRows();

    public abstract void createRow(Pixel pixel) throws PixelException;

    public abstract void setRow(Row row);
    public NetpbmFiles createNewFile(String fileName){
        if(fileName.contains(".pbm")){
            return new PBMFile();
        } else if (fileName.contains(".pgm")) {
            return new PGMFile();
        } else if (fileName.contains(".ppm")) {
            return new PPMFile();
        }
        return null;
    }

}
