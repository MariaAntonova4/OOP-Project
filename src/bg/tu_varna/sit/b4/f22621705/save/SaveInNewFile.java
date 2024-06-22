package bg.tu_varna.sit.b4.f22621705.save;

import bg.tu_varna.sit.b4.f22621705.Menu;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SaveInNewFile {
    public Menu saveNewFile(String fileName)throws IOException {
        File file=new File("C:\\Users\\Asus\\Desktop\\OOP-PROJECT\\OOP-Project\\Files\\"+fileName);
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
}
