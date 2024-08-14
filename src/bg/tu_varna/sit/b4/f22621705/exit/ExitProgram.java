package bg.tu_varna.sit.b4.f22621705.exit;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.menu.Menu;
import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.open.OpenedFiles;

import java.io.IOException;

public class ExitProgram implements Menu {
    /**
     *
     * @param session the session with the files
     * @return
     * @throws IOException
     * The function prints message for the client to show them that they are leaving the program
     */
    @Override
    public Menu execute() throws IOException {
        System.out.println("> exit\n" +
                "        Exiting the program...");

        return null;
    }
}
