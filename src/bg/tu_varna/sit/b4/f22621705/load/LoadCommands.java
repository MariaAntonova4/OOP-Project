package bg.tu_varna.sit.b4.f22621705.load;

import java.io.IOException;

public interface LoadCommands {
    LoadCommands executeLoad(Session session,int sessionNumber) throws IOException;

}
