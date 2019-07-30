package ese.data.dao;

public class DatabaseConfig {
    private String databaseType = "";
    private String databaseServer = "";
    private String databasePort = "";
    private String databaseName = "";
    private String databaseUser = "";
    private String databasePwd = "";

    // Set Method ======================================
    public void SetDatabaseType(String dbtype) {
        this.databaseType = dbtype;
    }

    public void SetDatabaseServer(String dbserver) {
        this.databaseServer = dbserver;
    }

    public void SetDatabasePort(String dbport) {
        this.databasePort = dbport;
    }

    public void SetDatabaseName(String dbname) {
        this.databaseName = dbname;
    }

    public void SetDatabaseUser(String username) {
        this.databaseUser = username;
    }

    public void SetDatabasePwd(String pwd) {
        this.databasePwd = pwd;
    }

    // Get Method ======================================

    public String GetDatabaseType() {
        return this.databaseType;
    }

    public String GetDatabaseServer() {
        return this.databaseServer;
    }

    public String GetDatabasePort() {
        return this.databasePort;
    }

    public String GetDatabaseName() {
        return this.databaseName;
    }

    public String GetDatabaseUser() {
        return this.databaseUser;
    }

    public String GetDatabasePwd() {
        return this.databasePwd;
    }
}
