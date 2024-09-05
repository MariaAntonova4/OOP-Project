package bg.tu_varna.sit.b4.f22621705.menu.models.open;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.menu.models.Menu;
import bg.tu_varna.sit.b4.f22621705.files.OpenedFiles;

import java.io.IOException;

public class Open implements Menu {
    private NetpbmFiles netpbmFiles;
    private OpenedFiles openedFiles;
    private StringBuilder stringBuilder;

    public Open(OpenedFiles openedFiles,StringBuilder stringBuilder) {
        this.openedFiles = openedFiles;
        this.stringBuilder=stringBuilder;
    }

    @Override
    public Menu execute() throws IOException {
            String fileName=stringBuilder.substring(stringBuilder.indexOf(" ")+1,stringBuilder.length());
            return new ReadFile(openedFiles).checkIfFileExists(netpbmFiles,fileName);
        }
    }

