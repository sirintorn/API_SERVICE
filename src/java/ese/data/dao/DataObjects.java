package ese.data.dao;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataObjects {
    //============================================================
    // <editor-fold defaultstate="collapsed" desc="Variable">
    private final HashMap arrayObject;

    // </editor-fold>
    //============================================================
    // <editor-fold defaultstate="collapsed" desc="Constructor">

    public DataObjects() {
        arrayObject = new HashMap();
    }

    public DataObjects(String fieldname, String fieldvalue) {
        arrayObject = new HashMap();

        if (!arrayObject.containsKey(fieldname)) {
            arrayObject.put(fieldname, fieldvalue);
        }
    }

    // </editor-fold>
    //============================================================
    // <editor-fold defaultstate="collapsed" desc="Basic Method">

    public void AddString(String fieldname, String fieldvalue) {
        if (!arrayObject.containsKey(fieldname)) {
            arrayObject.put(fieldname, fieldvalue);
        }
    }

    public void AddByteArray(String fieldname, byte[] fieldvalue) {
        if (!arrayObject.containsKey(fieldname)) {
            arrayObject.put(fieldname, fieldvalue);
        }
    }

    public void ClearObject() {
        arrayObject.clear();
    }

    public void SetString(String fieldname, String fieldvalue) {
        if (arrayObject.containsKey(fieldname)) {
            arrayObject.put(fieldname, fieldvalue);
        }
    }

    public HashMap GetAllObject() {
        return this.arrayObject;
    }

    public String GetString(String fieldname) {
        if (arrayObject.containsKey(fieldname)) {
            return (String) arrayObject.get(fieldname);
        } else {
            return null;
        }
    }

    public byte[] GetByteArray(String fieldname) {
        if (arrayObject.containsKey(fieldname)) {
            return (byte[]) arrayObject.get(fieldname);
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return arrayObject.isEmpty();
    }

    // </editor-fold>
    //============================================================
    // <editor-fold defaultstate="collapsed" desc="Advance Method">

    public List<DataObjects> parseObject(ResultSet rs) {
        List<DataObjects> rowList = new ArrayList<DataObjects>();

        if (rs != null) {
            try {
                while (rs.next()) {
                    DataObjects rowData = new DataObjects();
                    ResultSetMetaData rsmd = rs.getMetaData();

                    int totalCol = rsmd.getColumnCount();

                    for (int icol = 0; icol < totalCol; icol++) {
                        String colName = rsmd.getColumnName(icol);

                        if (rsmd.getColumnType(icol) == java.sql.Types.BLOB) {
                            rowData.AddByteArray(colName, rs.getBytes(colName));
                        } else {
                            rowData.AddString(colName, rs.getString(colName));
                        }
                    }

                    rowList.add(rowData);
                }
            } catch (SQLException ex) {
            }
        }

        return rowList;
    }
    // </editor-fold>
    //============================================================
}
