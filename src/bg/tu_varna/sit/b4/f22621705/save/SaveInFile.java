package bg.tu_varna.sit.b4.f22621705.save;
import bg.tu_varna.sit.b4.f22621705.Menu;
import bg.tu_varna.sit.b4.f22621705.open.FileOpen;

import java.io.*;
import java.util.Scanner;

public class SaveInFile {
    private StringBuilder format=new StringBuilder();
    private int width;
    private int height;
    private StringBuilder data=new StringBuilder();

    public StringBuilder getData() {
        return data;
    }

    public void setData(StringBuilder data) {
        this.data = data;
    }

    public StringBuilder getFormat() {
        return format;
    }

    public void setFormat(StringBuilder format) {
        this.format = format;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Menu saveNewFile(String fileName)throws IOException {File file=new File("C:\\Users\\Asus\\Desktop\\OOP-PROJECT\\OOP-Project\\Files\\"+fileName);
        StringBuilder stringBuilder=new StringBuilder();
        FileOutputStream fileWriter=new FileOutputStream(file);

        System.out.println("Please write the format: ");
        Scanner scanner=new Scanner(System.in);
        stringBuilder.append(scanner.nextLine())
                .append("\n");

        System.out.println("Please write the length: ");
        scanner=new Scanner(System.in);
        String len=scanner.nextLine();
        stringBuilder.append(len)
                .append(" ");

        System.out.println("Please write the weigh: ");
        scanner=new Scanner(System.in);
        String wei=scanner.nextLine();
        stringBuilder.append(wei)
                .append("\n");
        int ii= Integer.parseInt(len);
        int jj=Integer.parseInt(wei);;
        for(int j=0;j<jj;j++){
            for (int i=0;i<ii;i++){
                System.out.println("Please write the data: ");
                scanner=new Scanner(System.in);
                stringBuilder.append(scanner.nextLine())
                        .append(" ");
            }
            stringBuilder.append("\n");
        }

        fileWriter.write(stringBuilder.toString().getBytes());
        fileWriter.close();

        return null;}



    public Menu saveFile(String fileName) throws IOException {
        File file=new File("C:\\Users\\Asus\\Desktop\\OOP-PROJECT\\OOP-Project\\Files\\"+fileName);
        StringBuilder stringBuilder=new StringBuilder();
        FileOutputStream fileWriter=new FileOutputStream(file);
            stringBuilder.append(getFormat())
                    .append("\n")
                    .append(getHeight())
                    .append(" ")
                    .append(getWidth())
                    .append("\n");
           // FileOpen fileOpen=new FileOpen();
        for(int j=0;j<getHeight();j++){
            for (int i=0;i<(getWidth()*2);i++){
                /*System.out.println("Please write the data: ");
                Scanner scanner=new Scanner(System.in);*/
                /*stringBuilder.append(scanner.nextLine())
                        */
                //stringBuilder.append(fileOpen.getData().charAt(i))
                       // .append(" ");;
            }
           // stringBuilder.append("\n");
        }



        fileWriter.write(stringBuilder.toString().getBytes());
        fileWriter.close();

return null;
    }
}



