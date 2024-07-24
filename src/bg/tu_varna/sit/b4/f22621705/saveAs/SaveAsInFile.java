package bg.tu_varna.sit.b4.f22621705.saveAs;
import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.menu.Menu;

import bg.tu_varna.sit.b4.f22621705.load.Session;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class SaveAsInFile {
        private Session session;


       /* public SaveAsInFile(Session session) {
            this.session = session;
        }*/

        public Menu saveAsFile(String fileDirector) throws IOException {
        /*    Iterator<String>iterator=session.getCommandHistory().iterator();
            while (iterator.hasNext()){
                String s= iterator.next();
                //setEe(new FF());
                //ee.commands(s,session);

                Set<Map.Entry<Integer, Set<String>>> entries = session.getSession().entrySet();

                for(Map.Entry<Integer, Set<String>>entry:entries){
                    Iterator<String>iterator2=entry.getValue().iterator();
                    String str=iterator2.next();
                    if (str.contains(".pbm")){
                        SaveAsPBM savePBMFile=new SaveAsPBM();
                        savePBMFile.saveAsFile(str,session.saveData(str),fileDirector);
                    }
                    else if (str.contains(".pgm")) {
                        SaveAsPGM savePGMFile=new SaveAsPGM();
                        savePGMFile.saveAsFile(str,session.saveData(str),fileDirector);
                    } else if (str.contains(".ppm")) {
                        SaveAsPPM savePPMFile=new SaveAsPPM();
                        savePPMFile.saveAsFile(str,session.saveData(str),fileDirector);
                    }}}*/
            return null;
        }

}
