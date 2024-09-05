package bg.tu_varna.sit.b4.f22621705.menu.models.load.models.rotate;

import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.LoadMenu;
import bg.tu_varna.sit.b4.f22621705.files.Session;

import java.io.IOException;

public class ChooseDirection implements LoadMenu {
    private String stringDirection;
    private StringBuilder stringBuilder;
    private Direction direction;

    public String getStringDirection() {
        return stringDirection;
    }

    public void setStringDirection(String stringDirection) {
        if (stringDirection==null){
            this.stringDirection=getStringBuilder().substring((getStringBuilder().indexOf(" ")+1),getStringBuilder().length());
        }
        else this.stringDirection = stringDirection;
    }

    public ChooseDirection(StringBuilder stringBuilder) {
        this.direction=Direction.RIGHT;
        this.stringBuilder=stringBuilder;
    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    /**
     *
     * @param session gets the session which are the files in
     * @return
     * @throws IOException throws exception for the scanner
     * the function ask for the direction, checks the format of the file and calls new class with the function which has to be executed
     */
    @Override
    public LoadMenu executeLoad(Session session, int sessionNumber) throws IOException {
        setStringDirection(stringDirection);
        if (getStringDirection().equals(Direction.LEFT.getDirection())){
                    session.addInHistory(sessionNumber,"rotate left");
                    new LeftRotation().rotateLeft(session,sessionNumber);

                }
                else if(getStringDirection().equals(Direction.RIGHT.getDirection())){
                    session.addInHistory(sessionNumber,"rotate right");
                    new RightRotation().rotateRight(session,sessionNumber);
                }else {
            System.out.println("This is Not a Direction");
        }
                this.stringDirection=null;
                return null;
            }


        }


