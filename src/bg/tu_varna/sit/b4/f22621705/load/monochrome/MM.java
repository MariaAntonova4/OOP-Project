package bg.tu_varna.sit.b4.f22621705.load.monochrome;

import bg.tu_varna.sit.b4.f22621705.load.AA;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class MM implements AA {
    @Override
    public AA executeLoad(Map<Integer, Set<String>> session) throws IOException {
        System.out.println("Monochrome!:)");
        return null;
    }
}
