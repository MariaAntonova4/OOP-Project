package bg.tu_varna.sit.b4.f22621705.load.add;

import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.ListOfImages;
import bg.tu_varna.sit.b4.f22621705.load.Load;
import bg.tu_varna.sit.b4.f22621705.load.Session;

import java.io.IOException;
import java.util.*;

public class Add implements LoadCommands {
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

    /**
     *
     * @param session the session with the needed files
     * @return
     * @throws IOException
     * The function adds new file in the session's set for files
     */
    @Override
    public LoadCommands executeLoad(Session session) throws IOException {

            listOfImages=new ListOfImages();

        Set<Map.Entry<Integer, Set<String>>> entries = session.getSession().entrySet();


        String fileName;
        Scanner scanner=new Scanner(System.in);
        fileName=scanner.nextLine();
        for(Map.Entry<Integer, Set<String>>entry:entries){

            listOfImages.setImagesInSession(entry.getValue());
            listOfImages.addImageInSession(fileName);

        }session.addInHistory("add");
        return null;}

}
