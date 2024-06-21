package bg.tu_varna.sit.b4.f22621705.open;

import bg.tu_varna.sit.b4.f22621705.Menu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class OpenPBM implements FileOpen{
    private File file;
    private StringBuilder data=new StringBuilder();
    private StringBuilder notFormatedData=new StringBuilder();
    private int numbers;
    private int height;
    private int width;
    private StringBuilder format=new StringBuilder();

    private char nums;

    public int getHeight() {
        return height;
    }

    public StringBuilder getData() {
        return data;
    }

    public void setData(StringBuilder data) {
        this.data = data;
    }
    public StringBuilder getNoFormatData() {
        return notFormatedData;
    }

    public void setNotFormatedData(StringBuilder notFormatedData) {
        this.notFormatedData = notFormatedData;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public File getFile() {
        return file;
    }

    public void setFile(String fileName) {
        this.file = new File("C:\\Users\\Asus\\Desktop\\OOP-PROJECT\\OOP-Project\\Files\\"+fileName);
    }

    public StringBuilder getFormat() {
        return format;
    }

    public void setFormat(StringBuilder format,char addChar) {
        this.format = format.append(addChar);
    }

    public Menu readFile(String fileName) throws IOException {
        if (checkIfFileExists(fileName)){
            //StringBuilder stringBuilder1=new StringBuilder();
            //setFile(fileName);
            FileInputStream reader=new FileInputStream("C:\\Users\\Asus\\Desktop\\OOP-PROJECT\\OOP-Project\\Files\\"+fileName);
            setFormat(format,(char) reader.read());
            setFormat(format,(char)reader.read());
        /*format.append();
            format.append();*/
            reader.read();
            int j=0;
            while(j<3){
                nums=(char) reader.read();
                numbers=nums;
                if (numbers>47&&numbers<58){
                    setWidth(Character.getNumericValue(nums));
                } else if ((numbers==10&&j>0)||(numbers==32&&j>0)) {
                    break;
                }
                j++;
            }

            /*
            reader.read();
            nums=(char)reader.read();
            length=Character.getNumericValue(nums);*/

            int i=0;
            //int ij=0;
            //char[] weightFormat=new char[2];
            while(i<3){
                nums=(char) reader.read();
                numbers=nums;
                if (numbers>47&&numbers<58){
                    setHeight(Character.getNumericValue(nums));
                    //weightFormat[ij]= (char) weight;
                    //ij++;
                } else if (numbers==10) {
                    break;
                }
                i++;
            }
            //if (ij==1){
            //weight=weightFormat[0];}
            // else {
            //weight= toString().getBytes()weightFormat[0]+weightFormat[1];
            //}
           /* Integer cislo=Integer.valueOf(String.valueOf(weightFormat));
            int cislo2=cislo.intValue();
            weight=weightFormat;*/
            System.out.println("A: "+getWidth());
            System.out.println("B: "+ getHeight());

            if(file.canRead()){
                for(int jj=0;jj<getHeight();jj++){
                    for (int ii=0;ii<(getWidth())*2;ii++){
                        nums=(char) reader.read();
                        if (nums!=' '&&nums!='\n'){
                            numbers=nums;
                            if (numbers>47&&numbers<58){
                                numbers=Character.getNumericValue(numbers);
                                notFormatedData.append(numbers);
                                data.append(numbers)
                                        .append(" ");
                                //System.out.println(numbers);
                            }}
                    }
                    data.append("\n");
                }
                setData(getData());
                System.out.println(getData());
                setNotFormatedData(getNoFormatData());
                System.out.println(getNoFormatData());
            }


            /*
            nums=;
            System.out.println();
            System.out.println((char) );
            System.out.println();
            System.out.println((char) );
            //
            reader.read();
            nums=(char) reader.read();
        //int fileLength[length][weight];
        for (int i=0;i<length;i++) {
            for (int j = 0; j < weight * 2; j++) {
                System.out.println((char) reader.read());
            }}
        }*/
            reader.close();
        }
        return null;
    }

    @Override
    public int findWidthAndHeight(FileInputStream reader) throws IOException {
        return 0;
    }

    @Override
    public StringBuilder cleanFormat() {
        return null;
    }

    public boolean checkIfFileExists(String fileName) throws IOException {
        setFile(fileName);
        if (file.exists())
        {
            System.out.println("File exists!");
            return true;
        }
        else{
            System.out.println("There is no such file");
            setFile(fileName);
            FileWriter fileWriter=new FileWriter(getFile());
            fileWriter.close();
        }
        return false;
    }
}
