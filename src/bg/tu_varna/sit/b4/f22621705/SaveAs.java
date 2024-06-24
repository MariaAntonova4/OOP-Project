package bg.tu_varna.sit.b4.f22621705;

import bg.tu_varna.sit.b4.f22621705.saveAs.SaveAsInFile;

public class SaveAs extends MapClass{
    public SaveAs() throws CommandException {
    }

    @Override
    public Menu aaa() {
        return new SaveAsCommand();
    }
}
