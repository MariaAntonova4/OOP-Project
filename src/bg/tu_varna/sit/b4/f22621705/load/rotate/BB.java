package bg.tu_varna.sit.b4.f22621705.load.rotate;

import bg.tu_varna.sit.b4.f22621705.load.AA;
import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.load.grayscale.Grayscale;

import java.io.IOException;
import java.util.*;

public class BB implements AA {

    private Direction direction;

    public BB() {
        this.direction = Direction.LEFT;
    }

    @Override
    public AA executeLoad(Session session) throws IOException {
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
                setResult(new LeftRotation().rotateLeft(s));
            }
            else{
                session.addInHistory("rotate right");
                setResult(new RightRotation().rotateRight(s));
                }
        }
        return null;  }

    @Override
    public StringBuilder result() {
        return result();
    }

    @Override
    public void setResult(StringBuilder result) {
        this.result();
    }

}

