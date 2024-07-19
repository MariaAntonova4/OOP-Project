package bg.tu_varna.sit.b4.f22621705.menu;

public class SaveAs extends MapClass{
    public SaveAs() throws CommandException {
    }

    @Override
    public Menu aaa() {
        return new SaveAsCommand();
    }
}
