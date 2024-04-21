package bg.tu_varna.sit.b4.f22621705.load;

import java.util.HashSet;
import java.util.Set;

public class ListOfImages {
    private Set<String> imagesInSession=new HashSet();

    public ListOfImages(Set<String> imagesInSession) {
        this.imagesInSession = imagesInSession;
    }
    public void addImageInSession(String newImage){
        this.imagesInSession.add(newImage);
    }
}
