package bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.filesInterface;

import bg.tu_varna.sit.b4.f22621705.files.row.Row;

import java.util.List;

public interface RowMethodsNetpbmFiles {
    void addRow(Row row);
    void deleteRow(Row row);
    void setRows(List<Row> rows);
    List<Row> getRows();
    Row getRow();
}
