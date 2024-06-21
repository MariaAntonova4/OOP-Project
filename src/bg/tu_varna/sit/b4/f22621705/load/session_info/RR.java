package bg.tu_varna.sit.b4.f22621705.load.session_info;

import bg.tu_varna.sit.b4.f22621705.load.AA;
import bg.tu_varna.sit.b4.f22621705.load.Load;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class RR implements AA {
    private Load load;

    private StringBuilder sessionInfo=new StringBuilder();
    @Override
    public AA executeLoad(Map<Integer, Set<String>> session) throws IOException {
        load=new Load();

        Set<Map.Entry<Integer, Set<String>>> entries = load.getLoadMap().entrySet();

        Iterator<String> iterator=session.get(load.getMapNumber()).iterator();
        System.out.println();
        while (iterator.hasNext()){
            String s=iterator.next();
            System.out.println(s);
        }
        return null;
    }
}
