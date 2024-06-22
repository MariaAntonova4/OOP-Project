package bg.tu_varna.sit.b4.f22621705.help;

import bg.tu_varna.sit.b4.f22621705.Menu;
import bg.tu_varna.sit.b4.f22621705.load.Session;

import java.io.IOException;

public class Help implements Menu {
    private StringBuilder stringBuilder=new StringBuilder();
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

    @Override
    public Menu execute(Session session) throws IOException {
        addHelp();
        System.out.println(stringBuilder);
        return null;
    }
}
