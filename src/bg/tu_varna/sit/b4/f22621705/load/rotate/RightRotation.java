package bg.tu_varna.sit.b4.f22621705.load.rotate;

import bg.tu_varna.sit.b4.f22621705.Open;
import bg.tu_varna.sit.b4.f22621705.load.ListOfImages;
import bg.tu_varna.sit.b4.f22621705.load.Load;
import bg.tu_varna.sit.b4.f22621705.open.FileOpen;
import bg.tu_varna.sit.b4.f22621705.open.OpenPBM;
import bg.tu_varna.sit.b4.f22621705.save.SaveInFile;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class RightRotation {
    private SaveInFile saveInFile;
    private ListOfImages listOfImages;
    private Load load;
    private int newHeight;
    private int newWidth;
    public void rotateRight(Map<Integer, Set<String>> session) throws IOException {
        load=new Load();

        Set<Map.Entry<Integer, Set<String>>> entries = load.getLoadMap().entrySet();
        int mapNumber=1;
        Iterator<String> iterator=session.get(mapNumber).iterator();
        while (iterator.hasNext()){
            OpenPBM fileOpen=new OpenPBM();
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

            System.out.println(newData);}

    }
    /*
   // private List commandList=new ArrayList<>();
    public HashMap<String, Men>menu=new HashMap<>();
    public static Men open () throws IOException {
        String fileName;
        System.out.println("Please enter the name of the file which you want to open: ");
        Scanner scanner=new Scanner(System.in);
        fileName=scanner.nextLine();

        return new FileOpen().readFile(fileName);
    }
    public static Men save(){
        return new SaveInFile();
    }
    public Men load(){
        String fileName;
        System.out.println("Please enter the name of the file which you want to load: ");
        Scanner scanner=new Scanner(System.in);
        fileName=scanner.nextLine();


        return new Load().addInLoadMap(fileName);
    }
    public boolean checkCommand(String menuCommand){
        return menu.containsKey(menuCommand);
    }
    public Men bbp(String command){
        if (checkCommand(command)){

            StringBuilder result = new StringBuilder();

            for (Map.Entry<String, Men> element : menu.entrySet()) {
                if (Objects.equals(element.getKey(), command)){
                    System.out.println(element.getValue());
                    return element.getValue();
                }
                /*result.append("Game: ");
                result.append(": pleyers: ");
                result.append(element.getValue());
                result.append("\n");

                END comment


            }
        }
        System.out.println("There is no such command");
            return null;
    }
    public void menuCreator() throws IOException {
        menu.put("save",save());
        //menu.put("load",load());
        menu.put("open",open());
    }*/
}
