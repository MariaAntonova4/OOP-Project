package bg.tu_varna.sit.b4.f22621705.load.add;

import bg.tu_varna.sit.b4.f22621705.load.AA;
import bg.tu_varna.sit.b4.f22621705.load.ListOfImages;
import bg.tu_varna.sit.b4.f22621705.load.Load;

import java.io.IOException;
import java.util.*;

public class SS implements AA {
    private Load load;

    private Map<Integer, Set<String>> session=new HashMap<>();
    private int mapNumber;
    private ListOfImages listOfImages;

    public Map<Integer, Set<String>> getSession() {
        return session;
    }

    public void setSession(Map<Integer, Set<String>> session) {
        this.session = session;
    }

    public int getMapNumber() {
        return mapNumber;
    }

    public void setMapNumber(int mapNumber) {
        this.mapNumber = mapNumber;
    }

    public Map addInSession(String fileName) throws IOException {

        if (listOfImages==null){
            listOfImages=new ListOfImages().addImageInSession(fileName);
        }
        if (listOfImages.checkImageInSession(fileName)){
            getSession().put(mapNumber,listOfImages.getImagesInSession());}
        return getSession();
    }
    @Override
    public AA executeLoad(Map<Integer, Set<String>> session) throws IOException {
            load=new Load();

            Set<Map.Entry<Integer, Set<String>>> entries = load.getLoadMap().entrySet();

            Iterator<String> iterator=session.get(load.getMapNumber()).iterator();
           // while (iterator.hasNext()){
                String fileName;
                System.out.println("Please enter the name of the file which you want to load: ");
                Scanner scanner=new Scanner(System.in);
                fileName=scanner.nextLine();
            addInSession(fileName);
        return null;}
}//}
