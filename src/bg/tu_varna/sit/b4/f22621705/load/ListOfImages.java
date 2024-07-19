package bg.tu_varna.sit.b4.f22621705.load;

import java.util.HashSet;
import java.util.Set;

public class ListOfImages {
    private Set<String> imagesInSession=new HashSet();

    public Set<String> getImagesInSession() {
        return imagesInSession;
    }

    public void setImagesInSession(Set<String> imagesInSession) {
        this.imagesInSession = imagesInSession;
    }

    /**
     *
     * @param newImage the file which will be checked
     * @return returns true if the file is in the set
     */
    public boolean checkImageInSession(String newImage){
        if (imagesInSession.contains(newImage)) {
            return true;
        }
        else return false;
    }

    /**
     *
     * @param newImage the name of the file which will be added to the set
     * @return returns the set of images with the new image
     */
    public ListOfImages addImageInSession(String newImage){
        if (!checkImageInSession(newImage)){
        this.imagesInSession.add(newImage);}
        return this;
    }
}
