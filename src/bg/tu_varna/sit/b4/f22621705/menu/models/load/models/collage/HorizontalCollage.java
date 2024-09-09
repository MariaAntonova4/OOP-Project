package bg.tu_varna.sit.b4.f22621705.menu.models.load.models.collage;


import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.*;
import bg.tu_varna.sit.b4.f22621705.files.row.Pixel;
import bg.tu_varna.sit.b4.f22621705.files.row.Row;

import java.util.Iterator;

public class HorizontalCollage {
    /**
     *
     * @param firstFile the name of the first file that has to be added in the collage
     * @param secondFile the name of the second file that has to be added in the collage
     * @param newFile the name of the collage
     * @return the new file
     * the method creates a new file, writes the data such as width and height. Takes the first row
     * of the first file, adds it to the new file. Takes the first row of the second file. Adds it to the
     * new file. Repeats the algorithm with teh next rows. When all the data is added in the new
     * file, the file is returned
     */
    public NetpbmFiles horizontalCollage(NetpbmFiles firstFile, NetpbmFiles secondFile, NetpbmFiles newFile)throws PixelException {
            newFile=new PPMFile();
            newFile=newFile.createNewFile(firstFile.getFileName());

            newFile.setWidth(firstFile.getWidth()+secondFile.getWidth());
            newFile.setHeight(firstFile.getHeight());
            newFile.setMagicNumber(firstFile.getMagicNumber().charAt(1)-'0');
            if (!firstFile.showRows().isEmpty()&&!secondFile.showRows().isEmpty()){
                Iterator<Row> firstIRow=firstFile.showRows().iterator();
                Iterator<Row>secondIRow=secondFile.showRows().iterator();
                while (firstIRow.hasNext()&&secondIRow.hasNext()){
                    Row firstRow=(Row) firstIRow.next();
                    Row secondRow=(Row)secondIRow.next();
                    if (!firstRow.getPixelsList().isEmpty()){
                        Iterator<Pixel> iteratorFirstPixel=firstRow.getPixelsList().iterator();
                        while (iteratorFirstPixel.hasNext()){
                            Pixel firstPixel=(Pixel) iteratorFirstPixel.next();
                            Pixel firstNewPixel=new Pixel(firstPixel.getNumber());
                            newFile.createRow(firstNewPixel);
                        }
                    }
                    if (!secondRow.getPixelsList().isEmpty()){
                        Iterator<Pixel> iteratorSecondPixel=secondRow.getPixelsList().iterator();
                        while (iteratorSecondPixel.hasNext()){
                            Pixel secondPixel=(Pixel) iteratorSecondPixel.next();
                            Pixel secondNewPixel=new Pixel(secondPixel.getNumber());
                            newFile.createRow(secondNewPixel);
                        }
                    }}
                newFile.addRow(newFile.getRow());
            }return newFile;
    }
    }
