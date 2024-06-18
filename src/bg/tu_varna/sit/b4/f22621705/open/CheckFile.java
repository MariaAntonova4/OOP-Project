package bg.tu_varna.sit.b4.f22621705.open;

import java.io.*;
import bg.tu_varna.sit.b4.f22621705.Menu;

public class CheckFile {
    private File file;
    private boolean flag;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void setFile(String fileName) {
        this.file = new File("C:\\Users\\Asus\\Desktop\\OOP-PROJECT\\OOP-Project\\Files\\"+fileName);
    }

    public File getFile() {
        return file;
    }

        public Menu checkIfFileExists(String fileName) throws IOException {
            setFile(fileName);
            if (file.exists())
            {
                System.out.println("File exists!");
                setFlag(true);
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
