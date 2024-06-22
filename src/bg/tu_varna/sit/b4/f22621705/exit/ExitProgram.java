package bg.tu_varna.sit.b4.f22621705.exit;

import bg.tu_varna.sit.b4.f22621705.Menu;
import bg.tu_varna.sit.b4.f22621705.load.Session;

import java.io.IOException;

public class ExitProgram implements Menu {
    @Override
    public Menu execute(Session session) throws IOException {
        System.out.println("> exit\n" +
                "        Exiting the program...");

        return null;
    }
}
