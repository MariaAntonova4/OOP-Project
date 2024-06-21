package bg.tu_varna.sit.b4.f22621705.load.grayscale;

import bg.tu_varna.sit.b4.f22621705.load.AA;
import bg.tu_varna.sit.b4.f22621705.load.Load;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CC implements AA {
    private Load load;
    @Override
    public AA executeLoad(Map<Integer, Set<String>> session) throws IOException {
        load=new Load();
        Set<Map.Entry<Integer, Set<String>>> entries = load.getLoadMap().entrySet();
        int mapNumber=1;
        Iterator<String> iterator=session.get(mapNumber).iterator();
        while (iterator.hasNext()){
            System.out.println("Grayscale!:)");
            String s=iterator.next();
            if (s.contains(".ppm")){
                new Grayscale().turnGrayscale(s);
            }
        }
    return null;
    }
}
