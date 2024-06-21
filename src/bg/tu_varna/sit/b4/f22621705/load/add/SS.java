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

    public void addInSession(Map<Integer, Set<String>> session,String fileName) throws IOException {
        listOfImages.addImageInSession(fileName);
        listOfImages.setImagesInSession(listOfImages.getImagesInSession());
        if (listOfImages.checkImageInSession(fileName)){
            getSession().put(getMapNumber(),listOfImages.getImagesInSession());}
    }
    @Override
    public AA executeLoad(Map<Integer, Set<String>> session) throws IOException {
            load=new Load();
            listOfImages=new ListOfImages();
            //Set<Map.Entry<Integer, Set<String>>> entries = load.getLoadMap().entrySet();

        Set<Map.Entry<Integer, Set<String>>> entries = session.entrySet();


        String fileName;
        System.out.println("Please enter the name of the file which you want to load: ");
        Scanner scanner=new Scanner(System.in);
        fileName=scanner.nextLine();
        for(Map.Entry<Integer, Set<String>>entry:entries){

            listOfImages.setImagesInSession(entry.getValue());
            listOfImages.addImageInSession(fileName);
        }
        return null;}
}
