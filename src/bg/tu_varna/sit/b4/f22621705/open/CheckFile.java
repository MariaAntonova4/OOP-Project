package bg.tu_varna.sit.b4.f22621705.open;

import java.io.*;

import bg.tu_varna.sit.b4.f22621705.files.*;
import bg.tu_varna.sit.b4.f22621705.menu.Menu;

public class CheckFile {
    private File file;
    private OpenedFiles openedFiles;
    private Pixel pixel;
    private Row row;

    public CheckFile(OpenedFiles openedFiles) {
        this.openedFiles = openedFiles;
    }

    public void setFile(String fileName) {
        this.file = new File("C:\\Users\\Asus\\Desktop\\OOP-PROJECT\\OOP-Project\\Files\\"+fileName);
    }

    public File getFile() {
        return file;
    }

        public Menu checkIfFileExists(NetpbmFiles netpbmFiles,String fileName) throws IOException {

            setFile(fileName);
            if (file.exists())
            {
               // System.out.println("> open"+file.getPath());
                if(fileName.contains(".pbm")){
                    netpbmFiles=new PBMFile();
                } else if (fileName.contains(".pgm")) {
                    netpbmFiles=new PGMFile();
                } else if (fileName.contains(".ppm")) {
                    netpbmFiles=new PPMFile();
                }else {
                    System.out.println("There is NOT a created file");
                }
                netpbmFiles.setFileName(fileName);
                FileReader reader=new FileReader(getFile());


                int numbers=(char)reader.read();
                while (!(numbers >47) &&(numbers<58)){
                    numbers=(char)reader.read();
                }
                numbers=Character.getNumericValue(numbers);
                netpbmFiles.setMagicNumber((char) reader.read());



                numbers=(char)reader.read();
                while (!(numbers >47) &&(numbers<58)){
                    numbers=(char)reader.read();
                }
               // numbers=(char)reader.read();
                numbers=Character.getNumericValue(numbers);
                netpbmFiles.setWidth(numbers);




                numbers=(char)reader.read();
                while (!(numbers >47) &&(numbers<58)){
                    numbers=(char)reader.read();
                }
                numbers=Character.getNumericValue(numbers);
                netpbmFiles.setHeight(numbers);



                ////reader.read();
                //reader.read();
                if (!fileName.contains(".pbm")){
                numbers=(char)reader.read();
                while (!(numbers>47)&&(numbers<58)){
                    numbers=(char)reader.read();
                }
                numbers=Character.getNumericValue(numbers);
                netpbmFiles.setMaximumValue(numbers);
            }
                while (numbers!=65535){
                    numbers=(char)reader.read();

                    if (numbers>47&&numbers<58){
                    numbers=Character.getNumericValue(numbers);
                    pixel=new Pixel(numbers);
                    netpbmFiles.createRow(pixel);
                    //
                    }
                    //reader.read();
                }netpbmFiles.addRow(netpbmFiles.getRow());
                /*System.out.println(netpbmFiles.getPixels());
                System.out.println(netpbmFiles.getMaximumValue());;
*/
                System.out.println(netpbmFiles.showRows());
                System.out.println("Successfully opened "+fileName);

            }
            else{
                System.out.println("There is no such file");
                setFile(fileName);
                FileWriter fileWriter=new FileWriter(getFile());
                fileWriter.close();
            }
            openedFiles.opened(netpbmFiles);
            return null;
        }
}
