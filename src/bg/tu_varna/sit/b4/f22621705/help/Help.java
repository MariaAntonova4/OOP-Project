package bg.tu_varna.sit.b4.f22621705.help;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.menu.Menu;
import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.open.OpenedFiles;

import java.io.IOException;

public class Help implements Menu {
    private StringBuilder stringBuilder=new StringBuilder();

    /**
     * The function stores the information about the menu in StringBuilder
     */
    public void addHelp(){
        stringBuilder.append("> help\n" +
                "The following commands are supported:\n" +
                "open <file> opens <file>\n" +
                "close closes currently opened file\n" +
                "save saves the currently open file\n" +
                "saveas <file> saves the currently open file in <file>\n" +
                "help prints this information\n" +
                "exit exists the program\n");
    }

    /**
     *
     * @param session the session with all the files
     * @return
     * @throws IOException
     * The function calls the function addHelp which adds the information in StringBuilder and prints it
     */
    @Override
    public Menu execute(OpenedFiles openedFiles) throws IOException {
        addHelp();
        System.out.println(stringBuilder);
        return null;
    }
}
