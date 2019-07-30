package ese.data.dao;

public class QueryResult {
    private String ErrorCode = "";
    private String ErrorMsg = "";
    private int RowEffect = -1;

    //Set Method ====================================
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    public void setRowEffect(int RowEffect) {
        this.RowEffect = RowEffect;
    }

    //Get Method ====================================
    public String getErrorCode() {
        return this.ErrorCode;
    }

    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    public int getRowEffect() {
        return this.RowEffect;
    }
}
