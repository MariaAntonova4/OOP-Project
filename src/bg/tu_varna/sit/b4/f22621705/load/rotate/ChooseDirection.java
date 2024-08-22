package bg.tu_varna.sit.b4.f22621705.load.rotate;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.files.Pixel;
import bg.tu_varna.sit.b4.f22621705.files.Row;
import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.load.monochrome.MonochromePGM;
import bg.tu_varna.sit.b4.f22621705.load.monochrome.MonochromePPM;

import java.io.IOException;
import java.util.*;

public class ChooseDirection implements LoadCommands {

    private Direction direction;

    public ChooseDirection() {
        this.direction = Direction.LEFT;
    }

    /**
     *
     * @param session gets the session which are the files in
     * @return
     * @throws IOException throws exception for the scanner
     * the function ask for the direction, checks the format of the file and calls new class with the function which has to be executed
     */
    @Override
    public LoadCommands executeLoad(Session session) throws IOException {
        Scanner scanner=new Scanner(System.in);
        String string;
        System.out.println("Please write the direction: ");
        string=scanner.next();




                /*if (string.equals(direction.getDirection())){
                    session.addInHistory("rotate left");
                    session.addNewData(s,new LeftRotatePPM().rotateLeft(s));

                }
                else{
                    session.addInHistory("rotate right");
                    session.addNewData(s,new RightRoatatePPM().rotateRight(s));
                }*/
            }

        return null;
        }
         }

