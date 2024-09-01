package bg.tu_varna.sit.b4.f22621705.load.collage;


import bg.tu_varna.sit.b4.f22621705.files.*;

import java.util.Iterator;

public class HorizontalCollage {
    public NetpbmFiles horizontalCollage(NetpbmFiles firstFile,NetpbmFiles secondFile,NetpbmFiles newFile){
            if (firstFile.getFileName().contains(".pbm")){
                newFile=new PBMFile();
            } else if (firstFile.getFileName().contains(".pgm")) {
                newFile=new PGMFile();
            } else if (firstFile.getFileName().contains(".ppm")) {
                newFile=new PPMFile();
            }

            newFile.setWidth(firstFile.getWidth()+secondFile.getWidth());
            newFile.setHeight(firstFile.getHeight());
            newFile.setMagicNumber(firstFile.getMagicNumber().charAt(1));
            if (!firstFile.showRows().isEmpty()&&!secondFile.showRows().isEmpty()){
                Iterator<Row> iterator2=firstFile.showRows().iterator();
                Iterator<Row>secondIRow=secondFile.showRows().iterator();
                while (iterator2.hasNext()&&secondIRow.hasNext()){
                    Row i=(Row) iterator2.next();
                    Row j=(Row)secondIRow.next();
                    if (!i.getPixelsList().isEmpty()){
                        Iterator<Pixel> iterators=i.getPixelsList().iterator();
                        while (iterators.hasNext()){
                            Pixel b=(Pixel) iterators.next();
                            Pixel newPi=new Pixel(b.getNumber());
                            newFile.createRow(newPi);
                        }
                    }
                    if (!j.getPixelsList().isEmpty()){
                        Iterator<Pixel> iteratorP=j.getPixelsList().iterator();
                        while (iteratorP.hasNext()){
                            Pixel a=(Pixel) iteratorP.next();
                            Pixel newPixel=new Pixel(a.getNumber());
                            newFile.createRow(newPixel);
                        }
                    }}
                newFile.addRow(newFile.getRow());
            }return newFile;
    }
    }
