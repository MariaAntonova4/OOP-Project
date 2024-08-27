package bg.tu_varna.sit.b4.f22621705.menu;

import bg.tu_varna.sit.b4.f22621705.load.Session;

public class SaveAs extends MapClass{
    private Session session;
    public SaveAs(Session session) throws CommandException {
        this.session=session;
    }

    @Override
    public Menu aaa() {
        return new SaveAsCommand(session);
    }
}
