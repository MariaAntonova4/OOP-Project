package bg.tu_varna.sit.b4.f22621705.menu;

import bg.tu_varna.sit.b4.f22621705.open.OpenedFiles;

public class ConnectWithOpen extends MapClass {
    private OpenedFiles openedFiles;
    public ConnectWithOpen(OpenedFiles openedFiles) throws CommandException {
        if (openedFiles==null){
            this.openedFiles=new OpenedFiles();
        }else this.openedFiles=openedFiles;
    }

    @Override
    public Menu aaa() {
        return new Open(openedFiles);
    }
}
