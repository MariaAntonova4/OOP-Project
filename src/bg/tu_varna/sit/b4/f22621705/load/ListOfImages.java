package bg.tu_varna.sit.b4.f22621705.load;

import java.util.HashSet;
import java.util.Set;

public class ListOfImages {
    //private String imageInSession;
    private Set<String> imagesInSession=new HashSet();

    public Set<String> getImagesInSession() {
        return imagesInSession;
    }

    public void setImagesInSession(Set<String> imagesInSession) {
        this.imagesInSession = imagesInSession;
    }

    public boolean checkImageInSession(String newImage){
        if (imagesInSession.contains(newImage)) {
            return true;
        }
        else return false;
    }
    public ListOfImages addImageInSession(String newImage){
        if (!checkImageInSession(newImage)){
        this.imagesInSession.add(newImage);}
        return this;
    }
}
