package bg.tu_varna.sit.b4.f22621705.menu.models;

import bg.tu_varna.sit.b4.f22621705.menu.CommandException;

import java.io.IOException;

public interface Menu {
    Menu execute() throws IOException, CommandException;
}
