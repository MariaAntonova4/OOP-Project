package bg.tu_varna.sit.b4.f22621705.load;

import bg.tu_varna.sit.b4.f22621705.open.FileOpen;
import bg.tu_varna.sit.b4.f22621705.save.SaveInFile;

import java.io.IOException;
import java.util.*;

public class BB implements AA{
    private FileOpen fileOpen;
    private SaveInFile saveInFile;
    private ListOfImages listOfImages;
    private Load load;
    private int newHeight;
    private int newWidth;
    @Override
    public AA executeLoad(Map<Integer, Set<String>> session) throws IOException {
        load=new Load();
        Set<Map.Entry<Integer,Set<String>>> entries = load.getLoadMap().entrySet();
        int mapNumber=1;
        Iterator<String>iterator=session.get(mapNumber).iterator();
        while (iterator.hasNext()){
            fileOpen=new FileOpen();
            String s=iterator.next();
            fileOpen.readFile(s);
            newHeight=fileOpen.getHeight();
            newWidth=fileOpen.getWidth();
            StringBuilder str=fileOpen.getFormat();
            saveInFile=new SaveInFile();
            saveInFile.setHeight(newHeight);
            saveInFile.setWidth(newWidth);
            saveInFile.setFormat(str);
            StringBuilder newData=new StringBuilder();
            StringBuilder newNewData=new StringBuilder();
            fileOpen.getData().reverse();
            for (int checkLength=0;checkLength< fileOpen.getData().length();checkLength++){
                if (fileOpen.getData().charAt(checkLength)>47&&fileOpen.getData().charAt(checkLength)<58){
                    newNewData.append(fileOpen.getData().charAt(checkLength));}
            }

            for (int j=(newWidth-1);j>0;j--){
                newData.append(newNewData.charAt(j));
                    for (int i=1;i<newHeight;i++){
                            newData.append(newNewData.charAt((j+(newWidth))*i));
                        }
                    newData.append("\n");
                    }
            newData.append(newNewData.charAt(0));
            for (int i=1;i<newHeight;i++){
                newData.append(newNewData.charAt((newWidth)*i));
            }
            newData.append("\n");
             fileOpen.getData().reverse();
            System.out.println(newData);

           /* int [][]abi=new int[fileOpen.getHeight()][fileOpen.getWidth()];
            int charNumber=0;
            for(int jj=0;jj< fileOpen.getHeight();jj++){
                for (int ii=0;ii< fileOpen.getWidth();ii++){
                    char pop=fileOpen.getData().charAt(charNumber);
                    abi[jj][ii]= pop;
                    charNumber++;
                }

            }
            int [][]aBi=new int[newHeight][newWidth];
int nH=newHeight;
int nW=newWidth;
                for(int jj=0;jj<newHeight;jj++){
                    for (int ii=0;ii<(newWidth);ii++){
                        aBi[jj][ii]=abi[nW][nH];
                    }nW--;
                nH--;
                }*/
            saveInFile.saveFile(s);
        }
        System.out.println("BB");
    return null;
    }
}
