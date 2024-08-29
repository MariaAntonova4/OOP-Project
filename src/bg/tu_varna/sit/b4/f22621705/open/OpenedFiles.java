package bg.tu_varna.sit.b4.f22621705.open;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;

import java.util.*;


public class OpenedFiles {
    private Set<NetpbmFiles> openedFiles=new HashSet<>();

    public Set<NetpbmFiles> getOpenedFiles() {
        return openedFiles;
    }

    public void setOpenedFiles(Set<NetpbmFiles> openedFiles) {
        this.openedFiles = openedFiles;
    }
    public void opened(NetpbmFiles newFile){
        openedFiles.add(newFile);
    }
    public NetpbmFiles NamesOfOpenedFiles(String fileName){
        if (!this.getOpenedFiles().isEmpty()){
            Iterator<NetpbmFiles> iterator=this.getOpenedFiles().iterator();
            while (iterator.hasNext()){
                NetpbmFiles b=(NetpbmFiles) iterator.next();
                if (Objects.equals(b.getFileName(), fileName)){
                    return b;}

            }}
        return null;
    }

    public boolean CheckNamesOfOpenedFiles(String fileName){
        if (!this.getOpenedFiles().isEmpty()){
            Iterator<NetpbmFiles> iterator=this.getOpenedFiles().iterator();
            while (iterator.hasNext()){
                NetpbmFiles b=(NetpbmFiles) iterator.next();
                if (Objects.equals(b.getFileName(), fileName)){
                    return true;}

            }}
        return false;
    }
}
