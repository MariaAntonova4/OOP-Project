package bg.tu_varna.sit.b4.f22621705.oldClasses;

import bg.tu_varna.sit.b4.f22621705.menu.Menu;
import bg.tu_varna.sit.b4.f22621705.open.CheckFile;

import java.io.FileInputStream;
import java.io.IOException;

public class OpenPPM implements FileOpen {
      private StringBuilder magicNumber=new StringBuilder();
      private int width;
      private int height;
      private int maxValue;
      private StringBuilder data=new StringBuilder();

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

      public int getMaxValue() {
         return maxValue;
      }

      public void setMaxValue(int maxValue) {
         this.maxValue = maxValue;
      }

      public StringBuilder getData() {
         return data;
      }

      public void setData(StringBuilder data) {
         this.data = data;
      }

      public StringBuilder getMagicNumber() {
         return magicNumber;
      }

      public void setMagicNumber(StringBuilder magicNumber,char addChar) {
         this.magicNumber = magicNumber.append(addChar);
      }

    public int findWidthAndHeight(FileInputStream reader) throws IOException {
        int numbers;
        char nums;
        int i=0;
        int j=0;
        while(j==0){
            nums=(char) reader.read();
            numbers=nums;
            if (numbers==80||numbers>47&&numbers<58){
                i=(Character.getNumericValue(nums));
            } else {
                break;
            }

        }return i;
    }
      public StringBuilder cleanFormat(){
         StringBuilder noFormat=new StringBuilder();
         for (int dataLength=0;dataLength<getData().length();dataLength++){
            if (getData().charAt(dataLength)>47&&getData().charAt(dataLength)<58){
               int i=Character.getNumericValue(getData().charAt(dataLength));
               noFormat.append(i);
            }}
         return noFormat;
      }
      @Override
      public Menu readFile(String fileName) throws IOException {
        /* int numbers;
         char nums;
         checkIfFileExists(fileName);
         if (isFlag()==true){
            FileInputStream reader=new FileInputStream("C:\\Users\\Asus\\Desktop\\OOP-PROJECT\\OOP-Project\\Files\\"+fileName);
             setMagicNumber(magicNumber,(char) reader.read());
             setMagicNumber(magicNumber,(char) reader.read());

             reader.read();
             reader.read();
             numbers=findWidthAndHeight(reader);
             setWidth(numbers);
             //reader.read();
             numbers=findWidthAndHeight(reader);
             setHeight(numbers);



             reader.read();

             setMaxValue(findWidthAndHeight(reader));

             int jj=0;
            while(jj<=getHeight()*3){
               nums=(char) reader.read();
               numbers=nums;
               if (numbers>47&&numbers<58){
                  numbers=Character.getNumericValue(numbers);
                  data.append(numbers)
                          .append(" ");
               }
               if (nums=='\n'){
                  data.append("\n");
                  jj++;
               }
               if (numbers==65535){
                  break;
               }
            }
            setData(getData());
            System.out.println(getData());

         }
*/
         return null;
      }
   }