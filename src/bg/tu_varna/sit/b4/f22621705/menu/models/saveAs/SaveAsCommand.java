package bg.tu_varna.sit.b4.f22621705.menu.models.saveAs;

import bg.tu_varna.sit.b4.f22621705.menu.models.MainCommandExecute;
import bg.tu_varna.sit.b4.f22621705.files.Session;

import java.io.IOException;

public class SaveAsCommand implements MainCommandExecute {
    private Session session;
    private StringBuilder stringBuilder;
    public SaveAsCommand(Session session,StringBuilder stringBuilder) {
        this.session = session;
        this.stringBuilder=stringBuilder;
    }

    /**
     *
     * @return the save as method
     * @throws IOException
     * deletes the "save as" from the string builder and calls the save as method
     */
    @Override
    public MainCommandExecute execute() throws IOException {
        String nameOfFile=stringBuilder.substring(8, stringBuilder.length());
        return new SaveAsInFile(nameOfFile).saveAsFile(session);
    }
}
