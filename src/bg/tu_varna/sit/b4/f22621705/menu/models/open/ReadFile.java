package bg.tu_varna.sit.b4.f22621705.menu.models.open;

import java.io.*;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.*;
import bg.tu_varna.sit.b4.f22621705.files.OpenedFiles;
import bg.tu_varna.sit.b4.f22621705.files.row.Pixel;
import bg.tu_varna.sit.b4.f22621705.menu.models.MainCommandExecute;

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

    public int fileRead(FileReader reader) throws IOException {
        int numbers=(char)reader.read();

        while (!((numbers >47) &&(numbers<58))){
            if (numbers!=65535){
            numbers=(char)reader.read();}
            else
                return 65535;
        }
        numbers=Character.getNumericValue(numbers);
        return numbers;
    }

    /**
     *
     * @param netpbmFiles the file that has to be red
     * @param fileName the name of the file
     * @return
     * @throws IOException
     * The method checks if the file exists. If it doesn't the reader is closed. If it exists
     * the program creates a new file and sets the name. The file is red until the character is
     * number. Then it saves data such as magic number, height, width... Then new pixel is created
     * and saved in the file until the reader reaches the end of the file. The file is saved in
     * the opened files class
     */
        public MainCommandExecute checkIfFileExists(NetpbmFiles netpbmFiles, String fileName) throws IOException, PixelException {

            setFile(fileName);
            if (file.exists())
            {
                netpbmFiles=new PGMFile();
                netpbmFiles=netpbmFiles.createNewFile(fileName);

                netpbmFiles.setFileName(fileName);
                FileReader reader=new FileReader(getFile());

                int numbers=0;

                netpbmFiles.setMagicNumber((char)fileRead(reader));

                netpbmFiles.setWidth(fileRead(reader));

                netpbmFiles.setHeight(fileRead(reader));


                if (!(netpbmFiles instanceof PBMFile)){

                netpbmFiles.setMaximumValue(fileRead(reader));
            }
                while (numbers!=65535){
                    numbers=fileRead(reader);

                    if (numbers!=65535){
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
