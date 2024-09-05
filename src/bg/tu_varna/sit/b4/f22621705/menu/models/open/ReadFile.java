package bg.tu_varna.sit.b4.f22621705.menu.models.open;

import java.io.*;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.PBMFile;
import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.PGMFile;
import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.PPMFile;
import bg.tu_varna.sit.b4.f22621705.files.OpenedFiles;
import bg.tu_varna.sit.b4.f22621705.files.row.Pixel;
import bg.tu_varna.sit.b4.f22621705.menu.models.Menu;

public class ReadFile {
    private File file;
    private OpenedFiles openedFiles;
    private Pixel pixel;

    public ReadFile(OpenedFiles openedFiles) {
        this.openedFiles = openedFiles;
    }

    public void setFile(String fileName) {
        this.file = new File("C:\\Users\\Asus\\Desktop\\OOP-PROJECT\\OOP-Project\\Files\\"+fileName);
    }

    public File getFile() {
        return file;
    }

        public Menu checkIfFileExists(NetpbmFiles netpbmFiles, String fileName) throws IOException {

            setFile(fileName);
            if (file.exists())
            {
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
                java.io.FileReader reader=new java.io.FileReader(getFile());


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

                numbers=Character.getNumericValue(numbers);
                netpbmFiles.setWidth(numbers);




                numbers=(char)reader.read();
                while (!(numbers >47) &&(numbers<58)){
                    numbers=(char)reader.read();
                }
                numbers=Character.getNumericValue(numbers);
                netpbmFiles.setHeight(numbers);


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

                    }

                }netpbmFiles.addRow(netpbmFiles.getRow());

                System.out.println("Successfully opened "+fileName);
                openedFiles.opened(netpbmFiles);
            }
            else{
                System.out.println("There is no such file");
                setFile(fileName);
                FileWriter fileWriter=new FileWriter(getFile());
                fileWriter.close();
            }

            return null;
        }
}
