package bg.tu_varna.sit.b4.f22621705.load.session_info;

import bg.tu_varna.sit.b4.f22621705.load.AA;
import bg.tu_varna.sit.b4.f22621705.load.Load;
import bg.tu_varna.sit.b4.f22621705.load.Session;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class RR implements AA {
    private Load load;

    private StringBuilder sessionInfo=new StringBuilder();
    @Override
    public AA executeLoad(Session session) throws IOException {
        //load=new Load();
        //Session session1=new Session();

        session.addInHistory("session info");
        System.out.println(session.getCommandHistory());

        //Set<Map.Entry<Account,Float>> entries = bankAccounts.entrySet();
       // for (Map.Entry<Account,Float> entry : entries) {
        //    System.out.println("Account: " + entry.getKey()+"\nInterestValue: "+entry.getValue());
        //}


        Set<Map.Entry<Integer, Set<String>>> entries = session.getSession().entrySet();

        for(Map.Entry<Integer, Set<String>>entry:entries){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        return null;
    }
}
