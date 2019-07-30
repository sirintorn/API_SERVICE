/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese.data.dao;

 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import org.json.JSONException;

/**
 *
 * @author Teerachai Chaijinda
 */
public class DbConnector {
    
 private Connection connection = null;
	  

	  public Connection getConnection(){
//	  	SystemConfiguration sc = new SystemConfiguration();
//	  	String host = sc.checkHost();
//	  	System.out.println("Host "+ host);
	  	String url = "";
	    try {
	    		url = "jdbc:sqlserver://192.168.2.252;databaseName=RUNGJAROEN";
	      String user = "sa";
	      String passwd = "L123456!";
	      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	      connection = DriverManager.getConnection(url,user,passwd);
	    } catch (ClassNotFoundException e){
	      e.printStackTrace();
	    }catch (SQLException e){	
	    	e.printStackTrace();
	    }
	    return this.connection;
	  }
	  
	  public void closeConnectionDB(){
	    try{
	      this.connection.close();
	    }
	    catch (SQLException e){
	      e.printStackTrace();
	    }
          }

    
 public JSONArray convert(ResultSet rs) throws JSONException {

    JSONArray jsonArray = new JSONArray();
    JSONObject obj = null;
    JSONObject obj2 = null;
    try {
        while (rs.next()) {
            int total_rows = rs.getMetaData().getColumnCount();
            {
                if (obj != null) {
                    jsonArray.add(obj);
                }
                obj = new JSONObject();
                obj2 = new JSONObject();
                for (int j = 1; j < total_rows; j++) {
                    obj2.put(rs.getMetaData().getColumnLabel(j + 1).toLowerCase(),
                            rs.getObject(j + 1) != null ? rs.getObject(j + 1) : "");
                }
                obj.put("name", rs.getString(1));
                obj.put("item", obj2);
            }
        }
        jsonArray.add(obj);
    } catch (SQLException e) {
    }
    return jsonArray;
}
    
   
}