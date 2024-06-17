package bg.tu_varna.sit.b4.f22621705.load.rotate;

import bg.tu_varna.sit.b4.f22621705.load.AA;

import java.io.IOException;
import java.util.*;

public class BB implements AA {

    private Direction direction;

    public BB() {
        this.direction = Direction.LEFT;
    }

    @Override
    public AA executeLoad(Map<Integer, Set<String>> session) throws IOException {
        Scanner scanner=new Scanner(System.in);
        String string;
        System.out.println("Please write the direction: ");
        string=scanner.next();

        if (string.equals(direction.getDirection())){
            new LeftRotation().rotateLeft(session);
        }
        else
            new RightRotation().rotateRight(session);



           /* int [][]abi=new int[fileOpen.getHeight()][fileOpen.getWidth()];
            int charNumber=0;
            for(int jj=0;jj< fileOpen.getHeight();jj++){
                for (int ii=0;ii< fileOpen.getWidth();ii++){
                    char pop=fileOpen.getData().charAt(charNumber);
                    abi[jj][ii]= pop;
                    charNumber++;
                }

            }
            int [][]aBi=new int[newHeight][newWidth];
int nH=newHeight;
int nW=newWidth;
                for(int jj=0;jj<newHeight;jj++){
                    for (int ii=0;ii<(newWidth);ii++){
                        aBi[jj][ii]=abi[nW][nH];
                    }nW--;
                nH--;
                }*/
            //saveInFile.saveFile(s);
        return null;  }
        //System.out.println("BB");

    }

