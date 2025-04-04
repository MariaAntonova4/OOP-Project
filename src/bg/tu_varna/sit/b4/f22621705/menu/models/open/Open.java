package bg.tu_varna.sit.b4.f22621705.menu.models.open;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.PixelException;
import bg.tu_varna.sit.b4.f22621705.menu.models.MainCommandExecute;
import bg.tu_varna.sit.b4.f22621705.files.OpenedFiles;

import java.io.IOException;

public class Open implements MainCommandExecute {
    private NetpbmFiles netpbmFiles;
    private OpenedFiles openedFiles;
    private StringBuilder stringBuilder;

    public Open(OpenedFiles openedFiles,StringBuilder stringBuilder) {
        if (openedFiles==null){
            this.openedFiles=new OpenedFiles();
        }else this.openedFiles=openedFiles;
        this.stringBuilder=stringBuilder;
    }

    /**
     *
     * @return the method from the ReadFile class
     * @throws IOException
     * deletes the "open" in the stringBuilder calls a method
     */
    @Override
    public MainCommandExecute execute() throws IOException, PixelException {
            String fileName=stringBuilder.substring(stringBuilder.indexOf(" ")+1,stringBuilder.length());
            return new ReadFile(openedFiles).checkIfFileExists(netpbmFiles,fileName);
        }
    }

