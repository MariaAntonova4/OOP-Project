package bg.tu_varna.sit.b4.f22621705.menu;

import bg.tu_varna.sit.b4.f22621705.load.Session;

public class SaveAs extends MapClass{
    private StringBuilder stringBuilder;
    private Session session;
    public SaveAs(Session session,StringBuilder stringBuilder) throws CommandException {
        this.session=session;
        this.stringBuilder=stringBuilder;
    }

    @Override
    public Menu aaa() {
        return new SaveAsCommand(session,stringBuilder);
    }
}
