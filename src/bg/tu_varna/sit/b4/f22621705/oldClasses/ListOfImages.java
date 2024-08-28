package bg.tu_varna.sit.b4.f22621705.oldClasses;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;

import java.util.HashSet;
import java.util.Set;

public class ListOfImages {
    private Set<NetpbmFiles> imagesInSession=new HashSet();

    public Set<NetpbmFiles> getImagesInSession() {
        return imagesInSession;
    }

    public void setImagesInSession(Set<NetpbmFiles> imagesInSession) {
        this.imagesInSession = imagesInSession;
    }

    /**
     *
     * @param newImage the file which will be checked
     * @return returns true if the file is in the set
     */
    public boolean checkImageInSession(NetpbmFiles newImage){
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
    public ListOfImages addImageInSession(NetpbmFiles newImage){
        if (!checkImageInSession(newImage)){
        this.imagesInSession.add(newImage);}
        return this;
    }
}
