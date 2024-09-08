package bg.tu_varna.sit.b4.f22621705.files;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.NetpbmFiles;

import java.util.*;


public class OpenedFiles {
    private Set<NetpbmFiles> openedFiles=new HashSet<>();

    public Set<NetpbmFiles> getOpenedFiles() {
        return openedFiles;
    }

    public void setOpenedFiles(Set<NetpbmFiles> openedFiles) {
        this.openedFiles = openedFiles;
    }

    /**
     *
     * @param newFile- the new file that has to be added
     *               the method adds the file in the set of opened files
     */
    public void opened(NetpbmFiles newFile){
        openedFiles.add(newFile);
    }

    /**
     *
     * @param fileName- the name of the file that has to be found in the set of opened files
     * @return the found file
     * the method checks if a file is opened and if it is is returned
     */
    public NetpbmFiles NamesOfOpenedFiles(String fileName){
        if (!this.getOpenedFiles().isEmpty()){
            Iterator<NetpbmFiles> iterator=this.getOpenedFiles().iterator();
            while (iterator.hasNext()){
                NetpbmFiles netpbmFiles=(NetpbmFiles) iterator.next();
                if (Objects.equals(netpbmFiles.getFileName(), fileName)){
                    return netpbmFiles;}

            }}
        return null;
    }

    /**
     *
     * @param fileName the name of the file
     * @return true if there is opened file with such name and false if the file is not opened
     */
    public boolean CheckNamesOfOpenedFiles(String fileName){
        if (!this.getOpenedFiles().isEmpty()){
            Iterator<NetpbmFiles> iterator=this.getOpenedFiles().iterator();
            while (iterator.hasNext()){
                NetpbmFiles netpbmFiles=(NetpbmFiles) iterator.next();
                if (Objects.equals(netpbmFiles.getFileName(), fileName)){
                    return true;}

            }}
        return false;
    }
}
