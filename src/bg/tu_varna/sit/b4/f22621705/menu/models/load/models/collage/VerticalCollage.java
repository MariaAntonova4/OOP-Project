package bg.tu_varna.sit.b4.f22621705.menu.models.load.models.collage;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.*;
import bg.tu_varna.sit.b4.f22621705.files.row.Pixel;
import bg.tu_varna.sit.b4.f22621705.files.row.Row;

import java.util.Iterator;

public class VerticalCollage {
    /**
     *
     * @param firstFile the first file that has to be added in the collage
     * @param secondFile the second file that has to be added in the collage
     * @param newFile the new file
     * @return the new file
     * Creates a new file, adds data like height and width, takes the pixel data from the first
     * file and writes it in the collage. Takes the pixel data from the second file and puts it
     * into the collage. The collage is returned
     */
    public NetpbmFiles verticalCollage(NetpbmFiles firstFile, NetpbmFiles secondFile, NetpbmFiles newFile)throws PixelException {
        if (firstFile.getFileName().contains(".pbm")){
            newFile=new PBMFile();
        } else if (firstFile.getFileName().contains(".pgm")) {
            newFile=new PGMFile();
        } else if (firstFile.getFileName().contains(".ppm")) {
            newFile=new PPMFile();
        }
        newFile.setMagicNumber(firstFile.getMagicNumber().charAt(1));
        newFile.setWidth(firstFile.getWidth());
        newFile.setHeight(firstFile.getHeight()+secondFile.getHeight());
        if (!firstFile.showRows().isEmpty()){
            Iterator<Row> firstIRow=firstFile.showRows().iterator();
            while (firstIRow.hasNext()){
                Row firstRow=(Row) firstIRow.next();
                if (!firstRow.getPixelsList().isEmpty()){
                    Iterator<Pixel> iterators=firstRow.getPixelsList().iterator();
                    while (iterators.hasNext()){
                        Pixel firstPixel=(Pixel) iterators.next();
                        Pixel newFirstPixel=new Pixel(firstPixel.getNumber());
                        newFile.createRow(newFirstPixel);
                    }
                }
            }}
        if (!secondFile.showRows().isEmpty()){
            Iterator<Row>secondIRow=secondFile.showRows().iterator();
            while (secondIRow.hasNext()){
                Row secondRow=(Row)secondIRow.next();
                if (!secondRow.getPixelsList().isEmpty()){
                    Iterator<Pixel> iteratorP=secondRow.getPixelsList().iterator();
                    while (iteratorP.hasNext()){
                        Pixel secondPixel=(Pixel) iteratorP.next();
                        Pixel newSecondPixel=new Pixel(secondPixel.getNumber());
                        newFile.createRow(newSecondPixel);
                    }
            }
        }
            newFile.addRow(newFile.getRow());
        }
        return newFile;
    }
    }
