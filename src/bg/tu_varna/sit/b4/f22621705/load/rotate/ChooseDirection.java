package bg.tu_varna.sit.b4.f22621705.load.rotate;

import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.Session;

import java.io.IOException;
import java.util.*;

public class ChooseDirection implements LoadCommands {

    private Direction direction;

    public ChooseDirection() {
        this.direction = Direction.LEFT;
        this.direction=Direction.RIGHT;
    }

    /**
     *
     * @param session gets the session which are the files in
     * @return
     * @throws IOException throws exception for the scanner
     * the function ask for the direction, checks the format of the file and calls new class with the function which has to be executed
     */
    @Override
    public LoadCommands executeLoad(Session session,int sessionNumber) throws IOException {
        Scanner scanner=new Scanner(System.in);
        String string;
        System.out.println("Please write the direction: ");
        string=scanner.next();
        if (string.equals(direction.getDirection())){
                    session.addInHistory("rotate left");
                    new LeftRotation().rotateLeft(session,sessionNumber);

                }
                else{
                    session.addInHistory("rotate right");
                    new RightRotation().rotateRight(session,sessionNumber);
                }return null;
            }


        }


