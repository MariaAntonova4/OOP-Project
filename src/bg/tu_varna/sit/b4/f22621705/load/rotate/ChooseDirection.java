package bg.tu_varna.sit.b4.f22621705.load.rotate;

import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.Session;

import java.io.IOException;
import java.util.*;

public class ChooseDirection implements LoadCommands {

    private Direction direction;

    public ChooseDirection() {
        this.direction = Direction.LEFT;
    }

    @Override
    public LoadCommands executeLoad(Session session) throws IOException {
        Scanner scanner=new Scanner(System.in);
        String string;
        System.out.println("Please write the direction: ");
        string=scanner.next();


        Set<Map.Entry<Integer, Set<String>>> entries = session.getSession().entrySet();

        for(Map.Entry<Integer, Set<String>>entry:entries){
            Iterator<String> iterator=entry.getValue().iterator();
            String s=iterator.next();

            if (string.equals(direction.getDirection())){
                session.addInHistory("rotate left");
                session.addNewData(s,new LeftRotation().rotateLeft(s));

            }
            else{
                session.addInHistory("rotate right");
                session.addNewData(s,new RightRotation().rotateRight(s));
                }
        }
        return null;  }


}

