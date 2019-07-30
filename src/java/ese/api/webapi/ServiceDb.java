package ese.api.webapi;

import ese.data.dao.DbConnector;
import ese.data.dao.QueryResult;
import javax.ws.rs.FormParam;
import javax.ws.rs.Produces;
import javax.ws.rs.POST;
import javax.ws.rs.GET;

import javax.ws.rs.Path;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.SQLException;
@Path("service")
public class ServiceDb {

    @POST
    @Path("getView_page2_1_post")
    @Produces("application/json")
    public JSONObject getView_page2_1_post(@FormParam("request") String request) {
        JSONObject jsonResult = new JSONObject();
        try {
            String SQL = "select * from View_page2_1 ";
            DbConnector condb = new DbConnector();
            Connection conn = condb.getConnection();
            Statement m_Statement = conn.createStatement();
            ResultSet rs = m_Statement.executeQuery(SQL);
            
            if (condb.getConnection() != null) {
                JSONArray json_data = condb.convert(rs);
                jsonResult.put("errorcode", "OK");
                jsonResult.put("errormsg", "OK");
                jsonResult.put("data", json_data);
                File JSONOutputFile = new File("data.json");
                PrintWriter writer = new PrintWriter(JSONOutputFile, "UTF-8");
                writer.println(jsonResult);
                writer.close();
            } else {
                jsonResult.put("errorcode", "SERVER_ERROR");
                jsonResult.put("errormsg", "SERVER_ERROR");
            }
        } catch (Exception ex) {
//            jsonResult.put("errorcode", "SERVER_ERROR");
//            jsonResult.put("errormsg", "SERVER_ERROR");
        }

        return jsonResult;
        }
    
    @GET
    @Path("getView_page2_1")
    @Produces("application/json")
    public JSONObject getView_page2_1(@FormParam("request") String request) {
        JSONObject jsonResult = new JSONObject();
        try {
            String SQL = "select * from View_page2_1 ";
            DbConnector condb = new DbConnector();
            Connection conn = condb.getConnection();
            Statement m_Statement = conn.createStatement();
            ResultSet rs = m_Statement.executeQuery(SQL);
            
            if (condb.getConnection() != null) {
                JSONArray json_data = condb.convert(rs);
                jsonResult.put("errorcode", "OK");
                jsonResult.put("errormsg", "OK");
                jsonResult.put("data", json_data);
                File JSONOutputFile = new File("data.json");
                PrintWriter writer = new PrintWriter(JSONOutputFile, "UTF-8");
                writer.println(jsonResult);
                writer.close();
            } else {
                jsonResult.put("errorcode", "SERVER_ERROR");
                jsonResult.put("errormsg", "SERVER_ERROR");
            }
        } catch (Exception ex) {
//            jsonResult.put("errorcode", "SERVER_ERROR");
//            jsonResult.put("errormsg", "SERVER_ERROR");
        }

        return jsonResult;
        }
    
    @GET
    @Path("getView_page2_2")
    @Produces("application/json")
    public JSONObject getView_page2_2() {
        JSONObject jsonResult = new JSONObject();
        try {
            String SQL = "select * from View_page2_2 ";
            DbConnector condb = new DbConnector();
            Connection conn = condb.getConnection();
            Statement m_Statement = conn.createStatement();
            ResultSet rs = m_Statement.executeQuery(SQL);
            
            if (condb.getConnection() != null) {
                JSONArray json_data = condb.convert(rs);
                jsonResult.put("errorcode", "OK");
                jsonResult.put("errormsg", "OK");
                jsonResult.put("data", json_data);
                File JSONOutputFile = new File("data.json");
                PrintWriter writer = new PrintWriter(JSONOutputFile, "UTF-8");
                writer.println(jsonResult);
                writer.close();
            } else {
                jsonResult.put("errorcode", "SERVER_ERROR");
                jsonResult.put("errormsg", "SERVER_ERROR");
            }
        } catch (Exception ex) {
//            jsonResult.put("errorcode", "SERVER_ERROR");
//            jsonResult.put("errormsg", "SERVER_ERROR");
        }

        return jsonResult;
        }
 
    
    
    @GET
    @Path("getView_page1")
    @Produces("application/json")
    public JSONObject getView_page1() {
        JSONObject jsonResult = new JSONObject();
        try {
            String SQL = "select * from View_page1 ";
            DbConnector condb = new DbConnector();
            Connection conn = condb.getConnection();
            Statement m_Statement = conn.createStatement();
            ResultSet rs = m_Statement.executeQuery(SQL);
            
            if (condb.getConnection() != null) {
                JSONArray json_data = condb.convert(rs);
                jsonResult.put("errorcode", "OK");
                jsonResult.put("errormsg", "OK");
                jsonResult.put("data", json_data);
                File JSONOutputFile = new File("data.json");
                PrintWriter writer = new PrintWriter(JSONOutputFile, "UTF-8");
                writer.println(jsonResult);
                writer.close();
            } else {
                jsonResult.put("errorcode", "SERVER_ERROR");
                jsonResult.put("errormsg", "SERVER_ERROR");
            }
        } catch (Exception ex) {
//            jsonResult.put("errorcode", "SERVER_ERROR");
//            jsonResult.put("errormsg", "SERVER_ERROR");
        }

        return jsonResult;
        }
 
    
    
//    @POST
//    @Path("getLineBuilFac")
//    @Produces("application/json")
//    public JSONObject getLineBuilFac(@FormParam("factory_id") String factory_id) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "SELECT\n"
//                    + "\"public\".line.\"id\" as line_id,\n"
//                    + "\"public\".line.\"name\" as line_name,\n"
//                    + "\"public\".factory.\"id\" as factory_id,\n"
//                    + "\"public\".line.\"is_auto\" as is_auto, \n"
//                    + "\"public\".line.code \n"
//                    + "FROM\n"
//                    + "\"public\".line ,\n"
//                    + "\"public\".building_floor ,\n"
//                    + "\"public\".factory\n"
//                    + "WHERE \"public\".line.building_floor_id = \"public\".building_floor.\"id\"\n"
//                    + "and \"public\".factory.\"id\" =\"public\".building_floor.factory_id \n"
//                    + "and \"public\".factory.\"id\" ='" + factory_id + "' order by line.code asc";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                JSONArray jsonArray = connector.QueryDataToJSON(sqlcmd);
//                int length = jsonArray.size();
//                if (length == 0) {
//                    jsonResult.put("errorcode", "NOTFOUND");
//                    jsonResult.put("errormsg", "NOTFOUND");
//                    jsonResult.put("data", null);
//                } else {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                    jsonResult.put("data", jsonArray);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//                jsonResult.put("data", null);
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//            jsonResult.put("data", null);
//        }
//
//        return jsonResult;
//    }
//
//    @POST
//    @Path("getGsdHeader")
//    @Produces("application/json")
//    public JSONObject getGsdHeader(@FormParam("request") String request) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "SELECT DISTINCT(customer) FROM gsd_header";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                JSONArray jsonArray = connector.QueryDataToJSON(sqlcmd);
//                int length = jsonArray.size();
//                if (length == 0) {
//                    jsonResult.put("errorcode", "NOTFOUND");
//                    jsonResult.put("errormsg", "NOTFOUND");
//                    jsonResult.put("data", null);
//                } else {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                    jsonResult.put("data", jsonArray);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//                jsonResult.put("data", null);
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//            jsonResult.put("data", null);
//        }
//
//        return jsonResult;
//    }
//
//    @POST
//    @Path("getGsdHeaderByCust")
//    @Produces("application/json")
//    public JSONObject getGsdHeaderByCust(@FormParam("customer") String customer) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "SELECT\n"
//                    + "gsd_header.\"id\",\n"
//                    + "gsd_header.\"style\",\n"
//                    + "gsd_header.total_sam \n"
//                    + "FROM\n"
//                    + "gsd_header\n"
//                    + "where gsd_header.customer ='" + customer + "'";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                JSONArray jsonArray = connector.QueryDataToJSON(sqlcmd);
//                int length = jsonArray.size();
//                if (length == 0) {
//                    jsonResult.put("errorcode", "NOTFOUND");
//                    jsonResult.put("errormsg", "NOTFOUND");
//                    jsonResult.put("data", null);
//                } else {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                    jsonResult.put("data", jsonArray);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//                jsonResult.put("data", null);
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//            jsonResult.put("data", null);
//        }
//
//        return jsonResult;
//    }
//
//    @POST
//    @Path("getLbMainByCdt")
//    @Produces("application/json")
//    public JSONObject getLbMainByCdt(@FormParam("line_id") String line_id,
//            @FormParam("customer") String customer, @FormParam("style") String style) {
//        JSONObject jsonResult = new JSONObject();
//        try {
////            String sqlcmd = "SELECT\n"
////                    + " lb_main.\"id\",\n"
////                    + " lb_main.line_id,\n"
////                    + " lb_main.gsd_header_id,\n"
////                    + " lb_main.otp_target,\n"
////                    + " lb_main.takttime_plan,\n"
////                    + " lb_main.create_datetime,\n"
////                    + " lb_main.total_cycletime,\n"
////                    + " lb_main.cycletime_max,\n"
////                    + " lb_main.man,\n"
////                    + " lb_main.percent_balance,\n"
////                    + " lb_main.bn_position,\n"
////                    + " lb_main.bn_employee,\n"
////                    + " lb_main.bn_output,\n"
////                    + " lb_main.bn_eff,\n"
////                    + " lb_main.bn_otp,\n"
////                    + " lb_main.previous_lb,\n"
////                    + " lb_main.attatch_chart,\n"
////                    + " gsd_header.customer,\n"
////                    + " gsd_header.\"style\",\n"
////                    + " gsd_header.total_sam "
////                    + "FROM\n"
////                    + "lb_main\n"
////                    + "INNER JOIN  gsd_header ON  lb_main.gsd_header_id =  gsd_header.\"id\"\n"
////                    + "where  \n"
////                    + "lb_main.line_id = '" + line_id + "'\n"
////                    + "and gsd_header.customer ='" + customer + "'\n"
////                    + "and gsd_header.\"style\" ='" + style + "' "
////                    + "and date(lb_main.create_datetime)=date(NOW())";
//            String sqlcmd = " SELECT\n"
//                    + " lb_main.\"id\",lb_main.line_id,lb_main.gsd_header_id,\n"
//                    + " lb_main.otp_target,lb_main.takttime_plan,date(lb_main.create_datetime) ||' rev. '|| lb_main.revision as create_datetime,\n"
//                    + " lb_main.total_cycletime,lb_main.cycletime_max,\n"
//                    + " lb_main.man,lb_main.percent_balance,lb_main.bn_position,\n"
//                    + " lb_main.bn_employee,lb_main.bn_output,lb_main.bn_eff,\n"
//                    + " lb_main.bn_otp,lb_main.previous_lb,lb_main.attatch_chart,\n"
//                    + " lb_main.customer_id,customer.customer_name,lb_main.\"style\",lb_main.sam_gsd,lb_main.income,lb_main.eff_plan\n"
//                    + " lb_main.p_red, lb_main.p_green, lb_main.p_yellow, lb_main.p_orange\n"   //Remark SEP072018
//                    + " FROM\n"
//                    + "lb_main,customer\n"
//                    + "where  \n"
//                    + "lb_main.customer_id = customer.id\n"
//                    + "and lb_main.line_id = '" + line_id + "'\n"
//                    + "and customer.customer_name ='" + customer + "'\n"
//                    + " and lb_main.\"style\" ='" + style + "' \n"
// //                   + "and date(lb_main.create_datetime)=date(NOW())"
//                    + " and lb_main.status_id = 1 order by lb_main.id desc";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                JSONArray jsonArray = connector.QueryDataToJSON(sqlcmd);
//                int length = jsonArray.size();
//                if (length == 0) {
//                    jsonResult.put("errorcode", "NOTFOUND");
//                    jsonResult.put("errormsg", "NOTFOUND");
//                    jsonResult.put("data", null);
//                } else {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                    jsonResult.put("data", jsonArray);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//                jsonResult.put("data", null);
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//            jsonResult.put("data", null);
//        }
//
//        return jsonResult;
//    }
//
//    @POST
//    @Path("getGsdHeaderByCdt")
//    @Produces("application/json")
//    public JSONObject getGsdHeaderByCdt(@FormParam("customer") String customer, @FormParam("style") String style) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "Select  gsd_header.\"id\",\n"
//                    + " gsd_header.customer,\n"
//                    + " gsd_header.\"style\",\n"
//                    + " gsd_header.total_sam from gsd_header \n"
//                    + "where customer = '" + customer + "'\n"
//                    + "and style = '" + style + "'";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                JSONArray jsonArray = connector.QueryDataToJSON(sqlcmd);
//                int length = jsonArray.size();
//                if (length == 0) {
//                    jsonResult.put("errorcode", "NOTFOUND");
//                    jsonResult.put("errormsg", "NOTFOUND");
//                    jsonResult.put("data", null);
//                } else {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                    jsonResult.put("data", jsonArray);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//                jsonResult.put("data", null);
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//            jsonResult.put("data", null);
//        }
//        return jsonResult;
//    }
//
//    @POST
//    @Path("addLbMain")
//    @Produces("application/json")
//    public JSONObject addLbMain(
//            @FormParam("line_id") String line_id,
//            @FormParam("takttime_plan") String takttime_plan,
//            @FormParam("otp_target") String otp_target,
//            @FormParam("style") String style,
//            @FormParam("sam_gsd") String sam_gsd,
//            @FormParam("customer_id") String customer_id) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "INSERT INTO  lb_main\n"
//                    + "(  line_id,\n"
//                    + "   takttime_plan,\n"
//                    + "   otp_target,\n"
//                    + "   create_datetime,style,sam_gsd,customer_id)\n"
//                    + "VALUES ('" + line_id + "','" + takttime_plan + "','"
//                    + otp_target + "',NOW(),'" + style + "','" + sam_gsd + "','" + customer_id + "')";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                QueryResult workingResult = connector.ExecuteQuery(sqlcmd);
//                if (workingResult.getErrorCode().equals("OK")) {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                } else {
//                    jsonResult.put("errorcode", "NO_OK");
//                    jsonResult.put("errormsg", sqlcmd);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//        }
//        return jsonResult;
//    }
//
//    @POST
//    @Path("updateLbMainData")
//    @Produces("application/json")
//    public JSONObject updateLbMainData(
//            @FormParam("line_id") String line_id,
//            @FormParam("gsd_header_id") String gsd_header_id,
//            @FormParam("otp_target") String otp_target,
//            @FormParam("takttime_plan") String takttime_plan,
//            @FormParam("total_cycletime") String total_cycletime,
//            @FormParam("cycletime_max") String cycletime_max,
//            @FormParam("man") String man,
//            @FormParam("percent_balance") String percent_balance,
//            @FormParam("bn_position") String bn_position,
//            @FormParam("bn_employee") String bn_employee,
//            @FormParam("bn_output") String bn_output,
//            @FormParam("bn_eff") String bn_eff,
//            @FormParam("bn_otp") String bn_otp,
//            @FormParam("id") String id,
//            @FormParam("income") String income,
//            @FormParam("eff_plan") String eff_plan,
//            @FormParam("attatch_chart") String attatch_chart
//    ) {
//        JSONObject jsonRes = new JSONObject();
//        jsonRes.put("updateLbMain", updateLbMain(line_id, gsd_header_id, otp_target, takttime_plan, total_cycletime, cycletime_max, man, percent_balance, bn_position, bn_employee, bn_output, bn_eff, bn_otp, id,income,eff_plan));
//        jsonRes.put("updatePicLbMain", updatePicLbMain(attatch_chart, id));
//        return jsonRes;
//    }
//
//    public JSONObject updateLbMain(String line_id, String gsd_header_id, String otp_target, String takttime_plan, String total_cycletime, String cycletime_max, String man, String percent_balance, String bn_position, String bn_employee, String bn_output, String bn_eff, String bn_otp, String id,String income,String eff_plan) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "UPDATE lb_main\n"
//                    + "SET\n"
//                    + "     line_id='" + line_id + "',\n"
//                    + "     gsd_header_id='" + gsd_header_id + "',\n"
//                    + "     otp_target='" + otp_target + "',\n"
//                    + "     takttime_plan='" + takttime_plan + "',\n"
//                    + "     create_datetime=NOW(),\n"
//                    + "     total_cycletime='" + total_cycletime + "',\n"
//                    + "     cycletime_max='" + cycletime_max + "',\n"
//                    + "     man='" + man + "',\n"
//                    + "     percent_balance='" + percent_balance + "',\n"
//                    + "     bn_position='" + bn_position + "',\n"
//                    + "     bn_employee='" + bn_employee + "',\n"
//                    + "     bn_output='" + bn_output + "',\n"
//                    + "     bn_eff='" + bn_eff + "',\n"
//                    + "     bn_otp='" + bn_otp + "',\n" 
//                    + "     previous_lb=NOW(),\n"
//                    + "     lastupdate=NOW(),\n"
//                    + "     income='" + income + "',\n"
//                    + "     eff_plan='" + eff_plan + "'\n" 
//                    + "where \"id\" ='" + id + "'\n";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                QueryResult workingResult = connector.ExecuteQuery(sqlcmd);
//                if (workingResult.getErrorCode().equals("OK")) {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                } else {
//                    jsonResult.put("errorcode", "NO_OK");
//                    jsonResult.put("errormsg", "SQL: " + sqlcmd);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//        }
//        return jsonResult;
//    }
//
//    public JSONObject updatePicLbMain(String attatch_chart, String id) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "UPDATE lb_main \n"
//                    + "SET attatch_chart = '" + attatch_chart + "'\n"
//                    + "where \"id\" = '" + id + "'";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                QueryResult workingResult = connector.ExecuteQuery(sqlcmd);
//                if (workingResult.getErrorCode().equals("OK")) {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                } else {
//                    jsonResult.put("errorcode", "NO_OK");
//                    jsonResult.put("errormsg", "SQL: " + sqlcmd);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//        }
//        return jsonResult;
//    }
//
//    @POST
//    @Path("getMaxSeqLbD")
//    @Produces("application/json")
//    public JSONObject getMaxSeqLbD(
//            @FormParam("lb_main_id") String lb_main_id,
//            @FormParam("workgroup_id") String workgroup_id,
//            @FormParam("gcode_id") String gcode_id) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "Select max(seq) \n"
//                    + "from lb_detail \n"
//                    + "where lb_main_id = '" + lb_main_id + "' \n"
//                    + "and workgroup_id='" + workgroup_id + "' "
//                    + "and lb_detail.gcode_id ='" + gcode_id + "'";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                JSONArray jsonArray = connector.QueryDataToJSON(sqlcmd);
//                int length = jsonArray.size();
//                if (length == 0) {
//                    jsonResult.put("errorcode", "NOTFOUND");
//                    jsonResult.put("errormsg", "NOTFOUND " + sqlcmd);
//                    jsonResult.put("data", null);
//                } else {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                    jsonResult.put("data", jsonArray);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//                jsonResult.put("data", null);
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//            jsonResult.put("data", null);
//        }
//        return jsonResult;
//    }
//    
//    @POST
//    @Path("getMaxSeqKaizen")
//    @Produces("application/json")
//    public JSONObject getMaxSeqKaizen(
//            @FormParam("step_id") String step_id){
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "Select COALESCE(max(seq),0)+1 as seq from kaizen "
//                    +"where step_id = '"+step_id+"' ";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                JSONArray jsonArray = connector.QueryDataToJSON(sqlcmd);
//                int length = jsonArray.size();
//                if (length == 0) {
//                    jsonResult.put("errorcode", "NOTFOUND");
//                    jsonResult.put("errormsg", "NOTFOUND " + sqlcmd);
//                    jsonResult.put("data", null);
//                } else {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                    jsonResult.put("data", jsonArray);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//                jsonResult.put("data", null);
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//            jsonResult.put("data", null);
//        }
//        return jsonResult;
//    }    
//
//    @POST
//    @Path("addLbDetails")
//    @Produces("application/json")
//    public JSONObject addLbDetails(@FormParam("emp_qty") String emp_qty,
//            @FormParam("lb_main_id") String lb_main_id,
//            @FormParam("workgroup_id") String workgroup_id,
//            @FormParam("gcode_id") String gcode_id,
//            @FormParam("user_id") String user_id) {
//        JSONObject jsonResult = new JSONObject();
//        JSONArray jsonAr = new JSONArray();
//        int emp_qty_loop = Integer.parseInt(emp_qty);
//        for (int seq = 1; seq <= emp_qty_loop; seq++) {
//            JSONObject json_obj = new JSONObject();
//            json_obj = addLbDetail(String.valueOf(seq), lb_main_id, workgroup_id, gcode_id, user_id);
//            jsonAr.add(json_obj);
//        }
//        jsonResult.put("addLbDetails", jsonAr);
//        return jsonResult;
//    }
//
//    public JSONObject addLbDetail(String seq, String lb_main_id, String workgroup_id, String gcode_id, String user_id) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "INSERT INTO lb_detail (seq,lb_main_id,workgroup_id,gcode_id,user_id) "
//    //                + " VALUES ('" + seq + "','" + lb_main_id + "','" + workgroup_id + "','" + gcode_id + "','" + user_id + "')";
//                     + " VALUES ('" + seq + "','" + lb_main_id + "','" + workgroup_id + "','" + gcode_id + "','" + user_id + "')";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                QueryResult workingResult = connector.ExecuteQuery(sqlcmd);
//                if (workingResult.getErrorCode().equals("OK")) {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                } else {
//                    jsonResult.put("errorcode", "NO_OK");
//                    jsonResult.put("errormsg", "SQL: " + sqlcmd);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//        }
//        return jsonResult;
//    }
//
//    @POST
//    @Path("upOldLbDAddNewLbD")
//    @Produces("application/json")
//    public JSONObject upOldLbDAddNewLbD(
//            @FormParam("after_seq") String after_seq, @FormParam("seq_max") String seq_max,
//            @FormParam("emp_qty") String emp_qty, @FormParam("lb_main_id") String lb_main_id,
//            @FormParam("workgroup_id") String workgroup_id, @FormParam("gcode_id") String gcode_id,
//            @FormParam("user_id") String user_id) {
//        JSONObject jsonResult = new JSONObject();
//        JSONArray jsonArUpdate = new JSONArray();
//        JSONArray jsonArAdd = new JSONArray();
//        int after_seq_prm = Integer.valueOf(after_seq);
//        int emp_qty_prm = Integer.valueOf(emp_qty);
//        int seq_max_prm = Integer.valueOf(seq_max);
//        int user_id_prm = Integer.valueOf(user_id);
////         for (int af_seq = after_seq_prm; af_seq < seq_max_prm; af_seq++) {
//        for (int af_seq = seq_max_prm; af_seq > after_seq_prm; af_seq--) {
////            int seq = af_seq + 1 + emp_qty_prm;
////            int seq_now = af_seq + 1;
//            int seq = af_seq + emp_qty_prm;
//            int seq_now = af_seq;
//            jsonArUpdate.add(updateLbDetailBySeq(seq, seq_now, lb_main_id , user_id_prm));
//        }
//        jsonResult.put("updateLbDetailBySeq", jsonArUpdate);
//        for (int idx = 1; idx <= emp_qty_prm; idx++) {
//            jsonArAdd.add(addLbDetail(String.valueOf(after_seq_prm + idx), lb_main_id, workgroup_id, gcode_id,user_id));
//        }
//        jsonResult.put("addLbDetail", jsonArAdd);
//
////        jsonResult.put("updateLbDetailBySeq", updateLbDetailBySeq())
//        return jsonResult;
//    }
//
//    public JSONObject updateLbDetailBySeq(int seq, int seq_after, String lb_main_id,int user_id) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "UPDATE\n"
//                    + "lb_detail\n"
//                    + "SET\n"
//                    + "seq = '" + seq + "'\n"
//                    + ", user_id = '"+user_id +"'\n"
//                    + " WHERE \n"
//                    + "seq = '" + seq_after + "' and lb_main_id ='" + lb_main_id + "' \n";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                QueryResult workingResult = connector.ExecuteQuery(sqlcmd);
//                if (workingResult.getErrorCode().equals("OK")) {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                } else {
//                    jsonResult.put("errorcode", "NO_OK");
//                    jsonResult.put("errormsg", "NO_OK: " + sqlcmd);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//        }
//        return jsonResult;
//    }
//
//    @POST
//    @Path("getLinebalanceView")
//    @Produces("application/json")
//    public JSONObject getLinebalanceView(@FormParam("lb_main_id") String lb_main_id) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "select  linebalance_view.\"id\",\n"
//                    + " linebalance_view.gsd_detail_id,\n"
//                    + " linebalance_view.code,\n"
//                    + " linebalance_view.description,\n"
//                    + " linebalance_view.seq,\n"
//                    + " linebalance_view.employee,\n"
//                    + " linebalance_view.cycletime,\n"
//                    + " linebalance_view.status_id,\n"
//                    + " linebalance_view.status,\n"
//                    + " linebalance_view.user_id,\n"
//                    + " linebalance_view.\"name\",\n"
//                    + " linebalance_view.lb_main_id,\n"
//                    + " linebalance_view.gcode_id "
//                    + " from linebalance_view\n"
//                    + "where lb_main_id = '" + lb_main_id + "'  order by gcode_id asc , seq asc";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                JSONArray jsonArray = connector.QueryDataToJSON(sqlcmd);
//                int length = jsonArray.size();
//                if (length == 0) {
//                    jsonResult.put("errorcode", "NOTFOUND");
//                    jsonResult.put("errormsg", "NOTFOUND:" + sqlcmd);
//                    jsonResult.put("data", null);
//                } else {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                    jsonResult.put("data", jsonArray);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//                jsonResult.put("data", null);
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//            jsonResult.put("data", null);
//        }
//        return jsonResult;
//    }
//
//    @POST
//    @Path("getGsdDetailByCdt")
//    @Produces("application/json")
//    public JSONObject getGsdDetailByCdt(@FormParam("gsd_header_id") String gsd_header_id, @FormParam("gsd_detail_id") String gsd_detail_id) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "select   gsd_detail.\"id\",\n"
//                    + "  gsd_detail.description,\n"
//                    + "  gsd_detail.gsd_header_id,\n"
//                    + "  gsd_detail.sam_gsd,\n"
//                    + "  gsd_detail.group_id,\n"
//                    + "  gsd_detail.code "
//                    + " from gsd_detail where gsd_detail.sam_gsd <> 0 \n"
//                    + " and gsd_detail.gsd_header_id = " + gsd_header_id;
////                    + " and gsd_detail.\"id\"=" + gsd_detail_id + "";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                JSONArray jsonArray = connector.QueryDataToJSON(sqlcmd);
//                int length = jsonArray.size();
//                if (length == 0) {
//                    jsonResult.put("errorcode", "NOTFOUND");
//                    jsonResult.put("errormsg", "NOTFOUND");
//                    jsonResult.put("data", null);
//                } else {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                    jsonResult.put("data", jsonArray);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//                jsonResult.put("data", null);
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//            jsonResult.put("data", null);
//        }
//        return jsonResult;
//    }
//
//    @POST
//    @Path("getGsdDataByCdn")
//    @Produces("application/json")
//    public JSONObject getGsdDataByCdn(@FormParam("line_id") String line_id, @FormParam("gsd_header_id") String gsd_header_id) {
//        JSONObject jsonResult = new JSONObject();
//        try {
////            
//            String sqlcmd = "SELECT COALESCE(max(kaizen.seq), 0)+1 as seq_max FROM  public.gsd_header, public.gsd_detail\n"
//                    + ", public.factory, public.line, public.building_floor\n"
//                    + ", public.kaizen \n"
//                    + "WHERE gsd_detail.gsd_header_id = gsd_header.id \n"
//                    + "AND line.building_floor_id = building_floor.id \n"
//                    + "AND  line.id = kaizen.line_id \n"
//                    + "AND building_floor.factory_id = factory.id   \n"
//                    //                    + "AND  kaizen.gsd_detail_id = gsd_detail.id \n"
//                    + "and line.id = '" + line_id + "'\n"
//                    + "and gsd_header.id =" + gsd_header_id;
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                JSONArray jsonArray = connector.QueryDataToJSON(sqlcmd);
//                int length = jsonArray.size();
//                if (length == 0) {
//                    jsonResult.put("errorcode", "NOTFOUND");
//                    jsonResult.put("errormsg", "NOTFOUND");
//                    jsonResult.put("data", null);
//                } else {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                    jsonResult.put("data", jsonArray);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//                jsonResult.put("data", null);
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//            jsonResult.put("data", null);
//        }
//        return jsonResult;
//    }
//
//    
//    @POST
//    @Path("updateLbMainByCdt")
//    @Produces("application/json")
//    public JSONObject updateLbMainByCdt(
//            @FormParam("total_cycletime") String total_cycletime, @FormParam("cycletime_max") String cycletime_max, @FormParam("man") String man, @FormParam("percent_balance") String percent_balance, @FormParam("bn_position") String bn_position, @FormParam("bn_employee") String bn_employee, @FormParam("bn_output") String bn_output, @FormParam("bn_eff") String bn_eff, @FormParam("bn_otp") String bn_otp, @FormParam("previous_lb") String previous_lb, @FormParam("id") String id,@FormParam("income") String income,@FormParam("eff_plan") String eff_plan) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "UPDATE "
//                    + "lb_main "
//                    + "SET "
//                    + " total_cycletime ='" + total_cycletime + "' ,"
//                    + " cycletime_max ='" + cycletime_max + "', "
//                    + " man ='" + man + "', "
//                    + " percent_balance ='" + percent_balance + "', "
//                    + " bn_position ='" + bn_position + "', "
//                    + " bn_employee ='" + bn_employee + "', "
//                    + " bn_output ='" + bn_output + "', "
//                    + " bn_eff ='" + bn_eff + "', "
//                    + " bn_otp ='" + bn_otp + "', "
//                    //                    + " ,previous_lb ='" + previous_lb + "'\n"
//                    + " lastupdate = now() , "
//                    + " income ='" + income + "',"
//                    + " eff_plan ='" + eff_plan + "' "
//
//                    + " WHERE id ='" + id + "' ";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                QueryResult workingResult = connector.ExecuteQuery(sqlcmd);
//                if (workingResult.getErrorCode().equals("OK")) {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                } else {
//                    jsonResult.put("errorcode", "NO_OK");
//                    jsonResult.put("errormsg", "NO_OK: " + sqlcmd);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//        }
//        return jsonResult;
//    }
//    
//     @POST
//    @Path("updateLbMainByCdtTaktTime")
//    @Produces("application/json")
//    public JSONObject updateLbMainByCdtTaktTime(
//             @FormParam("id") String id
//            , @FormParam("otp_target") String otp_target
//            , @FormParam("takttime_plan") String takttime_plan
//            , @FormParam("income") String income
//            , @FormParam("eff_plan") String eff_plan
//
//            ) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "UPDATE "
//                    + "lb_main "
//                    + "SET "
//                    + " takttime_plan ='" + takttime_plan + "' "
//                    + " ,  otp_target = '" + otp_target + "' "
//                    + " ,  income = '" + income + "' "
//                    + " ,  eff_plan = '" + eff_plan + "' "
//
//                    + " ,  lastupdate = now() "
//                    + " WHERE id ='" + id + "' ";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                QueryResult workingResult = connector.ExecuteQuery(sqlcmd);
//                if (workingResult.getErrorCode().equals("OK")) {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                } else {
//                    jsonResult.put("errorcode", "NO_OK");
//                    jsonResult.put("errormsg", "NO_OK: " + sqlcmd);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//        }
//        return jsonResult;
//    }
//
//    @POST
//    @Path("updateLbDetailByCdt")
//    @Produces("application/json")
//    public JSONObject updateLbDetailByCdt(
//            @FormParam("gsd_detail_id") String gsd_detail_id, @FormParam("employee") String employee, @FormParam("cycletime") String cycletime, @FormParam("id") String id, @FormParam("status_id") String status_id , @FormParam("user_id") String user_id) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "UPDATE\n"
//                    + "lb_detail\n"
//                    + "SET\n"
//                    //                    + " gsd_detail_id ='" + gsd_detail_id + "'\n"
//                    + "employee ='" + employee + "'\n"
//                    + ",cycletime ='" + cycletime + "'\n"
//                    + ",status_id ='" + status_id + "'\n"
//                    + ",user_id ='" + user_id + "'\n"
//                    + "WHERE \"id\" ='" + id + "'";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                QueryResult workingResult = connector.ExecuteQuery(sqlcmd);
//                if (workingResult.getErrorCode().equals("OK")) {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                } else {
//                    jsonResult.put("errorcode", "NO_OK");
//                    jsonResult.put("errormsg", "NO_OK: " + sqlcmd);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//        }
//        return jsonResult;
//    }
//
//    @POST
//    @Path("getCrdateFrLbMainByMax")
//    @Produces("application/json")
//    public JSONObject getCrdateFrLbMainByMax(@FormParam("line_id") String line_id, @FormParam("customer") String customer, @FormParam("style") String style) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "select main_master.create_datetime from lb_main AS main_master\n"
//                    + "where main_master.\"id\" = \n"
//                    + "(select max(lb_main.\"id\") from lb_main \n"
//                    + "INNER JOIN gsd_header ON lb_main.gsd_header_id = gsd_header.\"id\"\n"
//                    + "where lb_main.line_id='" + line_id + "' \n"
//                    + "and gsd_header.customer='" + customer + "' \n"
//                    + "and gsd_header.\"style\"='" + style + "')";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                JSONArray jsonArray = connector.QueryDataToJSON(sqlcmd);
//                int length = jsonArray.size();
//                if (length == 0) {
//                    jsonResult.put("errorcode", "NOTFOUND");
//                    jsonResult.put("errormsg", "NOTFOUND");
//                    jsonResult.put("data", null);
//                } else {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                    jsonResult.put("data", jsonArray);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//                jsonResult.put("data", null);
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//            jsonResult.put("data", null);
//        }
//        return jsonResult;
//    }
//
//    @POST
//    @Path("getGsdHeaderAll")
//    @Produces("application/json")
//    public JSONObject getGsdHeaderAll(@FormParam("request") String request) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "SELECT\n"
//                    + " gsd_header.\"id\",\n"
//                    + " gsd_header.customer,\n"
//                    + " gsd_header.\"style\",\n"
//                    + " gsd_header.total_sam\n"
//                    + "FROM\n"
//                    + " gsd_header";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                JSONArray jsonArray = connector.QueryDataToJSON(sqlcmd);
//                int length = jsonArray.size();
//                if (length == 0) {
//                    jsonResult.put("errorcode", "NOTFOUND");
//                    jsonResult.put("errormsg", "NOTFOUND");
//                    jsonResult.put("data", null);
//                } else {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                    jsonResult.put("data", jsonArray);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//                jsonResult.put("data", null);
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//            jsonResult.put("data", null);
//        }
//        return jsonResult;
//    }
//
//    @POST
//    @Path("addGsdHeader")
//    @Produces("application/json")
//    public JSONObject addGsdHeader(
//            @FormParam("customer") String customer, @FormParam("style") String style) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "INSERT INTO gsd_header\n"
//                    + "(customer,\n"
//                    + "\"style\"\n)"
//                    + "VALUES ('" + customer + "','" + style + "')\n";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                QueryResult workingResult = connector.ExecuteQuery(sqlcmd);
//                if (workingResult.getErrorCode().equals("OK")) {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                } else {
//                    jsonResult.put("errorcode", "NO_OK");
//                    jsonResult.put("errormsg", "NO_OK: " + sqlcmd);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//        }
//        return jsonResult;
//    }
//
////    @POST
////    @Path("addKaizen")
////    @Produces("application/json")
////    public JSONObject addKaizen(
////            @FormParam("seq") String seq,
////            @FormParam("before_byte") String before_byte,
////            @FormParam("before_detail") String before_detail,
////            @FormParam("after_byte") String after_byte,
////            @FormParam("after_detail") String after_detail,
////            @FormParam("corrective_action") String corrective_action,
////            @FormParam("gsd_header_id") String gsd_header_id,
////            @FormParam("line_id") String line_id,
////            @FormParam("process_name") String process_name) {
////        JSONObject jsonResult = new JSONObject();
////        try {
////            String sqlcmd = "INSERT INTO kaizen "
////                    + "   ("
////                    + "   seq, "
////                    + "   before_byte, "
////                    + "   before_detail, "
////                    + "   after_byte, "
////                    + "   after_detail, "
////                    + "   corrective_action, "
////                    + "   gsd_header_id, "
////                    + "   line_id, "
////                    + "   process_name) "
////                    + " VALUES("
////                    + "'"+seq+"'" 
////                    + ",'" + before_byte + "'"
////                    + ",'" + before_detail + "'"
////                    + ",'" + after_byte + "'"
////                    + ",'" + after_detail + "'"
////                    + ",'" + corrective_action + "'"
////                    + ",'" + gsd_header_id + "'"
////                    + ",'" + line_id + "'"
////                    + ",'" + process_name + "'"
////                    + ")";
////            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
////            if (connector.GetConnection() != null) {
////                QueryResult workingResult = connector.ExecuteQuery(sqlcmd);
////                if (workingResult.getErrorCode().equals("OK")) {
////                    jsonResult.put("errorcode", "OK");
////                    jsonResult.put("errormsg", "OK");
////                } else {
////                    jsonResult.put("errorcode", "NO_OK");
////                    jsonResult.put("errormsg", "NO_OK: " + sqlcmd);
////                }
////            } else {
////                jsonResult.put("errorcode", "SERVER_ERROR");
////                jsonResult.put("errormsg", "SERVER_ERROR");
////            }
////        } catch (Exception ex) {
////            jsonResult.put("errorcode", "EXCEPTION");
////            jsonResult.put("errormsg", ex.toString());
////        }
////        return jsonResult;
////    }
//    
//    
//    @POST
//    @Path("addKaizen")
//    @Produces("application/json")
//    public JSONObject addKaizen(
//            @FormParam("seq") String seq,
//            @FormParam("before_byte") String before_byte,
//            @FormParam("before_detail") String before_detail,
//            @FormParam("after_byte") String after_byte,
//            @FormParam("after_detail") String after_detail,
//            @FormParam("corrective_action") String corrective_action,
//            @FormParam("gsd_header_id") String gsd_header_id,
//            @FormParam("line_id") String line_id,
//            @FormParam("step_id") String step_id) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "INSERT INTO kaizen "
//                    + " (seq,"
//                    + " before_byte,"
//                    + " before_detail,"
//                    + " after_byte,"
//                    + " after_detail,"
//                    + " corrective_action,"
//                    + " gsd_header_id,"
//                    + " line_id,"
//                    + " step_id)"
//                    + " VALUES('"+ seq + "'"
//                    + ",'" + before_byte + "'"
//                    + ",'" + before_detail + "'"
//                    + ",'" + after_byte + "'"
//                    + ",'" + after_detail + "'"
//                    + ",'" + corrective_action + "'"
//                    + ",'" + gsd_header_id + "'"
//                    + ",'" + line_id + "'"
//                    + ",'" + step_id + "'"
//                    + ")";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                QueryResult workingResult = connector.ExecuteQuery(sqlcmd);
//                if (workingResult.getErrorCode().equals("OK")) {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                } else {
//                    jsonResult.put("errorcode", "NO_OK");
//                    jsonResult.put("errormsg", "NO_OK: " + sqlcmd);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//        }
//        return jsonResult;
//    }
//
//    @POST
//    @Path("gsdDetailByCdt")
//    @Produces("application/json")
//    public JSONObject gsdDetailByCdt(
//            @FormParam("gsd_header_id") String gsd_header_id, @FormParam("description") String description) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "Insert into gsd_detail (\"id\",gsd_header_id,description)\n"
//                    + "VALUES((select COALESCE(max(dt.\"id\"), 0)+1 from gsd_detail as dt),'" + gsd_header_id + "','" + description + "')";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                QueryResult workingResult = connector.ExecuteQuery(sqlcmd);
//                if (workingResult.getErrorCode().equals("OK")) {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                } else {
//                    jsonResult.put("errorcode", "NO_OK");
//                    jsonResult.put("errormsg", "NO_OK: " + sqlcmd);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//        }
//        return jsonResult;
//    }
//
//    @POST
//    @Path("getWorkgroupGcodeFilter")
//    @Produces("application/json")
//    public JSONObject getWorkgroupGcodeFilter(@FormParam("gcode_id") String gcode_id) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "Select \"id\",group_code,group_name from workgroup where gcode_id = "+ gcode_id+" order by id asc ";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                JSONArray jsonArray = connector.QueryDataToJSON(sqlcmd);
//                int length = jsonArray.size();
//                if (length == 0) {
//                    jsonResult.put("errorcode", "NOTFOUND");
//                    jsonResult.put("errormsg", "NOTFOUND");
//                    jsonResult.put("data", null);
//                } else {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                    jsonResult.put("data", jsonArray);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//                jsonResult.put("data", null);
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//        }
//        return jsonResult;
//    }
//    
//    @POST
//    @Path("getWorkgroup")
//    @Produces("application/json")
//    public JSONObject getWorkgroup(@FormParam("request") String request) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "Select \"id\",group_code,group_name from workgroup order by id asc ";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                JSONArray jsonArray = connector.QueryDataToJSON(sqlcmd);
//                int length = jsonArray.size();
//                if (length == 0) {
//                    jsonResult.put("errorcode", "NOTFOUND");
//                    jsonResult.put("errormsg", "NOTFOUND");
//                    jsonResult.put("data", null);
//                } else {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                    jsonResult.put("data", jsonArray);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//                jsonResult.put("data", null);
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//        }
//        return jsonResult;
//    }
//
//
//    @POST
//    @Path("getGcode")
//    @Produces("application/json")
//    public JSONObject getGcode(@FormParam("request") String request) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "Select id,code from gcode order by id asc";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                JSONArray jsonArray = connector.QueryDataToJSON(sqlcmd);
//                int length = jsonArray.size();
//                if (length == 0) {
//                    jsonResult.put("errorcode", "NOTFOUND");
//                    jsonResult.put("errormsg", "NOTFOUND");
//                    jsonResult.put("data", null);
//                } else {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                    jsonResult.put("data", jsonArray);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//                jsonResult.put("data", null);
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//        }
//        return jsonResult;
//    }
//
//    @POST
//    @Path("getWorkgroupFilter")
//    @Produces("application/json")
//    public JSONObject getWorkgroupFilter(@FormParam("workgroup_id") String workgroup_id) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "Select \"id\",group_code,group_name from workgroup where id = " + workgroup_id;
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                JSONArray jsonArray = connector.QueryDataToJSON(sqlcmd);
//                int length = jsonArray.size();
//                if (length == 0) {
//                    jsonResult.put("errorcode", "NOTFOUND");
//                    jsonResult.put("errormsg", "NOTFOUND");
//                    jsonResult.put("data", null);
//                } else {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                    jsonResult.put("data", jsonArray);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//                jsonResult.put("data", null);
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//        }
//        return jsonResult;
//    }
//
//    @POST
//    @Path("addWorkgroup")
//    @Produces("application/json")
//    public JSONObject addWorkgroup(
//            @FormParam("group_code") String group_code,
//            @FormParam("group_name") String group_name) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "INSERT INTO workgroup\n"
//                    + "   ("
//                    //                    + "   group_code,\n"
//                    + "   group_name)\n"
//                    + "VALUES(\n"
//                    //                    + "'"+ group_code + "',"
//                    + "'" + group_name + "'\n"
//                    + ")";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                QueryResult workingResult = connector.ExecuteQuery(sqlcmd);
//                if (workingResult.getErrorCode().equals("OK")) {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                } else {
//                    jsonResult.put("errorcode", "NO_OK");
//                    jsonResult.put("errormsg", "NO_OK: " + sqlcmd);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//        }
//        return jsonResult;
//    }
//
//    @POST
//    @Path("addGcode")
//    @Produces("application/json")
//    public JSONObject addGcode(@FormParam("code") String code) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "INSERT INTO gcode (code)\n"
//                    + "VALUES('" + code + "')";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                QueryResult workingResult = connector.ExecuteQuery(sqlcmd);
//                if (workingResult.getErrorCode().equals("OK")) {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                } else {
//                    jsonResult.put("errorcode", "NO_OK");
//                    jsonResult.put("errormsg", "NO_OK: " + sqlcmd);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//        }
//        return jsonResult;
//    }
//
//    @POST
//    @Path("deleteLbDetail")
//    @Produces("application/json")
//    public JSONObject deleteLbDetail(
//            @FormParam("id") String id,
//            @FormParam("seq_delete") String seq_delete,
//            @FormParam("workgroup_id") String workgroup_id,
//            @FormParam("gcode_id") String gcode_id) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "delete from lb_detail where \"id\"='" + id + "'";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                QueryResult workingResult = connector.ExecuteQuery(sqlcmd);
//                if (workingResult.getErrorCode().equals("OK")) {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                    jsonResult.put("updateSeqMoreDelete", updateSeqMoreDelete(seq_delete, workgroup_id, gcode_id));
//                } else {
//                    jsonResult.put("errorcode", "NO_OK");
//                    jsonResult.put("errormsg", "NO_OK: " + sqlcmd);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//        }
//        return jsonResult;
//    }
//
//    public JSONObject updateSeqMoreDelete(String seq, String workgroup_id, String gcode_id) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "UPDATE lb_detail \n"
//                    + "SET seq=seq-1\n"
//                    + "WHERE gcode_id ='" + gcode_id + "' and workgroup_id ='" + workgroup_id + "' and seq > '" + seq + "'";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                QueryResult workingResult = connector.ExecuteQuery(sqlcmd);
//                if (workingResult.getErrorCode().equals("OK")) {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                } else {
//                    jsonResult.put("errorcode", "NO_OK");
//                    jsonResult.put("errormsg", "NO_OK: " + sqlcmd);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//        }
//        return jsonResult;
//    }
//
////    @POST
////    @Path("getMaxSeq")
////    @Produces("application/json")
////    public JSONObject gsdDetailByCdt(
////            @FormParam("gsd_header_id") String gsd_header_id, @FormParam("description") String description) {
////        JSONObject jsonResult = new JSONObject();
////        try {
////            String sqlcmd = "Insert into gsd_detail (\"id\",gsd_header_id,description)\n"
////                    + "VALUES((select COALESCE(max(dt.\"id\"), 0)+1 from gsd_detail as dt),'" + gsd_header_id + "','" + description + "')";
////            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
////            if (connector.GetConnection() != null) {
////                QueryResult workingResult = connector.ExecuteQuery(sqlcmd);
////                if (workingResult.getErrorCode().equals("OK")) {
////                    jsonResult.put("errorcode", "OK");
////                    jsonResult.put("errormsg", "OK");
////                } else {
////                    jsonResult.put("errorcode", "NO_OK");
////                    jsonResult.put("errormsg", "NO_OK: " + sqlcmd);
////                }
////            } else {
////                jsonResult.put("errorcode", "SERVER_ERROR");
////                jsonResult.put("errormsg", "SERVER_ERROR");
////            }
////        } catch (Exception ex) {
////            jsonResult.put("errorcode", "EXCEPTION");
////            jsonResult.put("errormsg", ex.toString());
////        }
////        return jsonResult;
////    }
////***********************GSD ANALYSIS****************************
////    @POST
////    @Path("getGaMainData")
////    @Produces("application/json")
////    public JSONObject getGaMainData(
////            @FormParam("line_id") String line_id,
////            @FormParam("customer") String customer,
////            @FormParam("style") String style,
////            @FormParam("sam_gsd") String sam_gsd
////    ) {
////        JSONObject jsonRes = new JSONObject();
////        try {
////            JSONObject getGaMainJoinHead = getGaMainJoinHead(line_id, customer, style);
////
////            if (getGaMainJoinHead.getAsString("errorcode").equals("OK")) {
////                JSONParser parser = new JSONParser();
////                Object gaMainObject = parser.parse(getGaMainJoinHead.getAsString("data"));
////                JSONArray gaMainAr = (JSONArray) gaMainObject;
////                JSONObject gaMainObj = (JSONObject) gaMainAr.get(0);
////
////                jsonRes.put("getGaDetail", getGaDetail(gaMainObj.getAsString("id")).toJSONString());
////                jsonRes.put("ga_main_id", gaMainObj.getAsString("id"));
////            } else {
////                JSONObject addGaMain = addGaMain(line_id, sam_gsd);
////                jsonRes.put("addGaMain", addGaMain.toJSONString());
////                if (addGaMain.getAsString("errorcode").equals("OK")) {
////                    jsonRes.put("ga_main_id", getLastGaMainId());
////                } else {
////                    jsonRes.put("ga_main_id", null);
////                }
////                jsonRes.put("getGsdHeaderByCdt", getGsdHeaderByCdt(customer, style).toJSONString());
////            }
////        } catch (Exception ex) {
////            System.out.println(ex.toString());
////        }
////        return jsonRes;
////    }
//    public JSONObject getGaMainJoinHead(String line_id, String customer, String style) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "SELECT\n"
//                    + " ga_main.\"id\",\n"
//                    + " ga_main.line_id,\n"
//                    + " ga_main.gsd_header_id,\n"
//                    + " ga_main.create_datetime,\n"
//                    + " ga_main.total_cycletime,\n"
//                    + " ga_main.sam_header_ratio,\n"
//                    + " gsd_header.customer,\n"
//                    + " gsd_header.\"style\",\n"
//                    + " gsd_header.total_sam\n"
//                    + "FROM\n"
//                    + " ga_main\n"
//                    + "LEFT JOIN gsd_header ON ga_main.gsd_header_id = gsd_header.\"id\"\n"
//                    + "WHERE ga_main.line_id=" + line_id + "\n"
//                    + "and gsd_header.customer ='" + customer + "' \n"
//                    + "and gsd_header.\"style\" ='" + style + "'\n"
//                    + "and DATE(ga_main.create_datetime)= DATE(NOW())\n";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                JSONArray jsonArray = connector.QueryDataToJSON(sqlcmd);
//                int length = jsonArray.size();
//                if (length == 0) {
//                    jsonResult.put("errorcode", "NOTFOUND");
//                    jsonResult.put("errormsg", "NOTFOUND");
//                    jsonResult.put("data", null);
//                } else {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                    jsonResult.put("data", jsonArray);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//                jsonResult.put("data", null);
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//            jsonResult.put("data", null);
//        }
//
//        return jsonResult;
//    }
//
//    @POST
//    @Path("getGaDetail")
//    @Produces("application/json")
//    public JSONObject getGaDetail(@FormParam("ga_main_id") String ga_main_id) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "SELECT "
//                    + " ga_detail.id, "
//                    + " ga_detail.gsd_detail_id, "
//                    + " ga_detail.ga_main_id, "
//                    + " ga_detail.cycletime, "
//                    + " ga_detail.diff, "
//                    + " ga_detail.sam_detail_ratio, "
//                    + " gsd_detail.id, "
//                    + " gsd_detail.description,(select gd2.description from gsd_detail as gd2 where gd2.id = gsd_detail.group_id) as group_desc, "
//                    + " gsd_detail.gsd_header_id, "
//                    + " gsd_detail.sam_gsd, "
//                    + " gsd_detail.group_id, "
//                    + " gsd_detail.code , "
//                    + " ga_detail.status_id ,"
//                    + " system_status.status "
//                    + " FROM "
//                    + " ga_detail "
//                    + " INNER JOIN  gsd_detail ON  ga_detail.gsd_detail_id =  gsd_detail.id "
//                    + " LEFT JOIN system_status on ga_detail.status_id = system_status.id "
//                    + " where ga_detail.ga_main_id ='" + ga_main_id + "' order by ga_detail.id asc ";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                JSONArray jsonArray = connector.QueryDataToJSON(sqlcmd);
//                int length = jsonArray.size();
//                if (length == 0) {
//                    jsonResult.put("errorcode", "NOTFOUND");
//                    jsonResult.put("errormsg", "NOTFOUND");
//                    jsonResult.put("data", null);
//                } else {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                    jsonResult.put("data", jsonArray);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//                jsonResult.put("data", null);
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//            jsonResult.put("data", null);
//        }
//
//        return jsonResult;
//    }
//
//    @POST
//    @Path("addGaMain")
//    @Produces("application/json")
//    public JSONObject addGaMain(@FormParam("line_id") String line_id,
//            @FormParam("sam_gsd") String sam_gsd,
//            @FormParam("customer_id") String customer_id,
//            @FormParam("style") String style) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "INSERT INTO ga_main\n"
//                    + " ( line_id,\n"
//                    + "  sam_gsd,\n"
//                    + "  create_datetime,\n"
//                    + "  total_cycletime,\n"
//                    + "  sam_header_ratio,"
//                    + " customer_id,style)\n"
//                    + "VALUES(\n"
//                    + "'" + line_id + "','" + sam_gsd + "',NOW(),'0','0','" + customer_id + "','" + style + "'\n"
//                    + ")";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                QueryResult workingResult = connector.ExecuteQuery(sqlcmd);
//                if (workingResult.getErrorCode().equals("OK")) {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
////                    jsonResult.put("data", getLastGaMainId());
//                } else {
//                    jsonResult.put("errorcode", "NO_OK");
//                    jsonResult.put("errormsg", sqlcmd);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//        }
//
//        return jsonResult;
//    }
//
//    @POST
//    @Path("getLastGaMainId")
//    @Produces("application/json")
//    public String getLastGaMainId() {
//        String maxId = "";
//        try {
//            String sqlcmd = "SELECT \"max\"(\"id\")\n"
//                    + "FROM ga_main";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                JSONArray jsonArray = connector.QueryDataToJSON(sqlcmd);
//                int length = jsonArray.size();
//                if (length == 0) {
//                    maxId = "-1";
//                } else {
//                    JSONObject json = (JSONObject) jsonArray.get(0);
//                    maxId = json.getAsString("max");
//                }
//            } else {
//            }
//        } catch (Exception ex) {
//            maxId = "-2";
//        }
//        return maxId;
//    }
//
//    @POST
//    @Path("getGsdDetailsToGroup")
//    @Produces("application/json")
//    public JSONObject getGsdDetailsToGroup(@FormParam("customer") String customer, @FormParam("style") String style) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "Select a.id,a.code,a.description,a.sam_gsd,a.group_id \n"
//                    + "from gsd_detail a \n"
//                    + "left join gsd_detail b on a.group_id = b.id \n"
//                    + "left join gsd_header on a.gsd_header_id = gsd_header.id \n"
//                    + "where gsd_header.customer = '" + customer + "' and gsd_header.style = '" + style + "' ";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                JSONArray jsonArray = connector.QueryDataToJSON(sqlcmd);
//                int length = jsonArray.size();
//                if (length == 0) {
//                    jsonResult.put("errorcode", "NOTFOUND");
//                    jsonResult.put("errormsg", "NOTFOUND");
//                    jsonResult.put("data", null);
//                } else {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                    jsonResult.put("data", jsonArray);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//                jsonResult.put("data", null);
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//        }
//        return jsonResult;
//    }
//    
//    @POST
//    @Path("getGsdDetailStepOnly")
//    @Produces("application/json")
//    public JSONObject getGsdDetailStepOnly(@FormParam("style") String style) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "select a.id,a.code,a.description,a.sam_gsd,a.group_id,a.gsd_header_id \n" 
//                    + " from gsd_detail a \n" 
//                    +" left join gsd_detail b on a.group_id = b.id \n" 
//                    +" left join gsd_header on a.gsd_header_id = gsd_header.id \n" 
//                    +" where gsd_header.style = '"+style+"' \n" 
//                    +" and a.sam_gsd >0 \n" 
//                    +" order by a.id asc ";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                JSONArray jsonArray = connector.QueryDataToJSON(sqlcmd);
//                int length = jsonArray.size();
//                if (length == 0) {
//                    jsonResult.put("errorcode", "NOTFOUND");
//                    jsonResult.put("errormsg", "NOTFOUND");
//                    jsonResult.put("data", null);
//                } else {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                    jsonResult.put("data", jsonArray);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//                jsonResult.put("data", null);
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//        }
//        return jsonResult;
//    }
//
//    @POST
//    @Path("addGaDetails")
//    @Produces("application/json")
//    public JSONObject addGaDetails(
//            @FormParam("gsd_detail_id") String gsd_detail_id,
//            @FormParam("ga_main_id") String ga_main_id,
//            @FormParam("cycletime") String cycletime,
//            @FormParam("diff") String diff,
//            @FormParam("sam_detail_ratio") String sam_detail_ratio) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "INSERT INTO ga_detail\n"
//                    + "( gsd_detail_id,\n"
//                    + "  ga_main_id,\n"
//                    + "  cycletime,\n"
//                    + "  diff,\n"
//                    + "  sam_detail_ratio)"
//                    + "VALUES('" + gsd_detail_id + "','" + ga_main_id + "','" + cycletime + "','" + diff + "','" + sam_detail_ratio + "')\n";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                QueryResult workingResult = connector.ExecuteQuery(sqlcmd);
//                if (workingResult.getErrorCode().equals("OK")) {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                } else {
//                    jsonResult.put("errorcode", "NO_OK");
//                    jsonResult.put("errormsg", "NO_OK: " + sqlcmd);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//        }
//        return jsonResult;
//    }
//
//    @POST
//    @Path("updateGaDetails")
//    @Produces("application/json")
//    public JSONObject updateGaDetails(
//            @FormParam("ga_detail_id") String ga_detail_id,
//            @FormParam("cycletime") String cycletime,
//            @FormParam("diff") String diff,
//            @FormParam("sam_detail_ratio") String sam_detail_ratio,
//            @FormParam("status_id") String status_id) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "UPDATE ga_detail\n"
//                    + " SET cycletime='" + cycletime + "',\n"
//                    + "  diff='" + diff + "',\n"
//                    + "  sam_detail_ratio='" + sam_detail_ratio + "' ,"
//                    + " status_id = '"+status_id+"'"
//                    + " WHERE id = '" + ga_detail_id + "'";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                QueryResult workingResult = connector.ExecuteQuery(sqlcmd);
//                if (workingResult.getErrorCode().equals("OK")) {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                } else {
//                    jsonResult.put("errorcode", "NO_OK");
//                    jsonResult.put("errormsg", "NO_OK: " + sqlcmd);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//        }
//        return jsonResult;
//    }
//
//    @POST
//    @Path("deleteGaDetail")
//    @Produces("application/json")
//    public JSONObject deleteGaDetail(@FormParam("ga_detail_id") String ga_detail_id) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "delete from ga_detail "
//                    + " WHERE id = '" + ga_detail_id + "'";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                QueryResult workingResult = connector.ExecuteQuery(sqlcmd);
//                if (workingResult.getErrorCode().equals("OK")) {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                } else {
//                    jsonResult.put("errorcode", "NO_OK");
//                    jsonResult.put("errormsg", "NO_OK: " + sqlcmd);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//        }
//        return jsonResult;
//    }
//
//    @POST
//    @Path("getLoginData")
//    @Produces("application/json")
//    public JSONObject getLoginData(
//            @FormParam("username") String username,
//            @FormParam("password") String password,
//            @FormParam("device_sn") String device_sn) {
//        JSONObject jsonObj = new JSONObject();
//        try {
//            String sqlcmd = "SELECT\n"
//                    + " \"user\".\"id\",\n"
//                    + " \"user\".code,\n"
//                    + " \"user\".\"name\",\n"
//                    + " \"user\".line_id,\n"
//                    + " \"user\".section_id,\n"
//                    + " \"user\".username,\n"
//                    + " \"user\".\"password\",\n"
//                    + " \"user\".isactive,\n"
//                    + " \"user\".user_image,\n"
//                    + " \"user\".factory_id,\n"
//                    + " \"user\".building_floor_id,\n"
//                    + " \"user\".\"position\",\n"
//                    + " \"user\".\"Contry_id\",\n"
//                    + " \"user\".is_ctt_use,\n"
//                    + " \"user\".tablet_sn\n"
//                    + "FROM\n"
//                    + " \"user\"\n"
//                    + "where \"user\".username ='" + username + "' and \"user\".is_ctt_use = TRUE";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() == null) {
//                jsonObj.put("errorcode", "SERVER_ERROR");
//                jsonObj.put("errormsg", "SERVER_ERROR : " + sqlcmd);
//                jsonObj.put("data", null);
//            } else {
//                JSONArray jsonArray = connector.QueryDataToJSON(sqlcmd);
//                int length = jsonArray.size();
//                if (length > 0) {
//                    JSONObject json = new JSONObject();
//                    json = (JSONObject) jsonArray.get(0);
//                    String pwdFromQuery = json.getAsString("password");
//                    if (pwdFromQuery.equals(password)) {
//                        String snFromQuery = json.getAsString("tablet_sn");
//                        if (snFromQuery.equals(device_sn)) {
//                            jsonObj.put("errorcode", "OK");
//                            jsonObj.put("errormsg", "Success");
//                            jsonObj.put("data", json);
//                        } else {
//                            jsonObj.put("errorcode", "SN_NOT_OK");
//                            jsonObj.put("errormsg", "Device is not Correct!" + sqlcmd);
//                            jsonObj.put("data", json);
//                        }
//                    } else {
//                        jsonObj.put("errorcode", "PASS_NOT_OK");
//                        jsonObj.put("errormsg", "Password is not Correct!");
//                        jsonObj.put("data", null);
//                    }
//                } else {
//                    jsonObj.put("errorcode", "USER_NOT_HAVE");
//                    jsonObj.put("errormsg", "User is not Found!");
//                    jsonObj.put("data", null);
//                }
//            }
//        } catch (Exception ex) {
//            jsonObj.put("errorcode", "EXCEPTION");
//            jsonObj.put("errormsg", ex.toString());
//            jsonObj.put("data", null);
//        }
//        return jsonObj;
//    }
////Change TAB1 Add Method
//
//    @POST
//    @Path("getPdtPlan")
//    @Produces("application/json")
//    public JSONObject getPdtPlan(@FormParam("line_code") String line_code) {
//        JSONObject jsonResult = new JSONObject();
//        try {
////            String sql = "select distinct style,sam_gsd from production_plan where line like 'VSEW001 %'";
//            String sqlcmd = "select distinct(style) as style,sam_gsd from production_plan where line like '" + line_code + "%' ";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                JSONArray jsonArray = connector.QueryDataToJSON(sqlcmd);
//                int length = jsonArray.size();
//                if (length == 0) {
//                    jsonResult.put("errorcode", "NOTFOUND");
//                    jsonResult.put("errormsg", "NOTFOUND");
//                    jsonResult.put("data", null);
//                } else {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                    jsonResult.put("data", jsonArray);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//                jsonResult.put("data", null);
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//        }
//        return jsonResult;
//    }
//
//    @POST
//    @Path("getCustomerByCode")
//    @Produces("application/json")
//    public JSONObject getCustomerByCode(@FormParam("style") String style) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "select \"id\",customer_name as customer\n"
//                    + "from customer \n"
//                    + "where customer_code like substring('" + style + "',1,3)";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                JSONArray jsonArray = connector.QueryDataToJSON(sqlcmd);
//                int length = jsonArray.size();
//                if (length == 0) {
//                    jsonResult.put("errorcode", "NOTFOUND");
//                    jsonResult.put("errormsg", "NOTFOUND");
//                    jsonResult.put("data", null);
//
//                } else {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                    jsonResult.put("data", jsonArray);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//                jsonResult.put("data", null);
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//        }
//        return jsonResult;
//    }
//
//    @POST
//    @Path("getGaMainByCdt")
//    @Produces("application/json")
//    public JSONObject getGaMainByCdt(@FormParam("line_id") String line_id,
//            @FormParam("customer") String customer, @FormParam("style") String style) {
//        JSONObject jsonResult = new JSONObject();
//        try {
////            String sqlcmd = "select ga_main.\"id\",\n"    //Remark By P.Sirintorn JUN202017
////                    + " ga_main.line_id,\n"
////                    + " ga_main.gsd_header_id,\n"
////                    + " ga_main.create_datetime,\n"
////                    + " ga_main.total_cycletime,\n"
////                    + " ga_main.sam_header_ratio,\n"
////                    + " ga_main.sam_gsd,\n"
////                    + " ga_main.customer_id,\n"
////                    + " ga_main.style ,"
////                    + " ga_main.revision"
////                    + "from ga_main \n"
////                    + "left join customer on ga_main.customer_id = customer.id\n"
////                    + "left join line on ga_main.line_id = line.id\n"
////                    + "where customer.customer_name = '" + customer + "'\n"
////                    + "and style = '" + style + "'\n"
////                    + "and ga_main.line_id = '" + line_id + "'\n"
////                    + "and date(create_datetime) = date(NOW())";
////            
//            String sqlcmd = "select ga_main.id, "
//                    + " ga_main.line_id, "
//                    + " ga_main.gsd_header_id, "
//                    + " ga_main.create_datetime, "
//                    + " ga_main.total_cycletime, "
//                    + " ga_main.sam_header_ratio, "
//                    + " ga_main.sam_gsd, "
//                    + " ga_main.customer_id, "
//                    + " ga_main.style , "
//                    + " ga_main.revision "
//                    + " from ga_main  "
//                    + " left join line on ga_main.line_id = line.id "
//                    + " where ga_main.style = '"+style+"'"
//                    + " and ga_main.line_id = '"+line_id+"'"
//                    + " and ga_main.revision = (select max(revision) "
//                    + " from ga_main where style = '"+style+"' and ga_main.line_id = '"+line_id+"')";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                JSONArray jsonArray = connector.QueryDataToJSON(sqlcmd);
//                int length = jsonArray.size();
//                if (length == 0) {
//                    jsonResult.put("errorcode", "NOTFOUND");
//                    jsonResult.put("errormsg", "NOTFOUND");
//                    jsonResult.put("data", null);
//                } else {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                    jsonResult.put("data", jsonArray);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//                jsonResult.put("data", null);
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//            jsonResult.put("data", null);
//        }
//
//        return jsonResult;
//    }
//    
//    @POST
//    @Path("getKaizen")
//    @Produces("application/json")
//    public JSONObject getKaizen(@FormParam("style") String style
//            , @FormParam("step_id") String step_id) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "select kaizen.id, kaizen.seq,encode(kaizen.before_byte::bytea, 'escape') as before_byte,kaizen.before_detail,encode(kaizen.after_byte::bytea, 'escape') as after_byte,kaizen.after_detail\n" +
//                ",kaizen.corrective_action,kaizen.gsd_header_id,kaizen.line_id,kaizen.benefit,kaizen.step_id\n" +
//                ",gsd_header.style\n" +
//                "from kaizen,gsd_header,gsd_detail\n" +
//                "where kaizen.gsd_header_id = gsd_header.id\n" +
//                "and kaizen.step_id = gsd_detail.id\n" +
//                "and gsd_header.style = '"+style+"'\n" +
//                "and step_id = '"+step_id+"'\n"+
//                "and kaizen.seq = (select max(seq) from kaizen,gsd_header,gsd_detail\n"+
//                "where kaizen.gsd_header_id = gsd_header.id\n"+
//                "and kaizen.step_id = gsd_detail.id\n"+
//                "and gsd_header.style = '"+style+"'\n"+
//                "and step_id = '"+step_id+"')\n";
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                JSONArray jsonArray = connector.QueryDataToJSON(sqlcmd);
//                int length = jsonArray.size();
//                if (length == 0) {
//                    jsonResult.put("errorcode", "NOTFOUND");
//                    jsonResult.put("errormsg", "NOTFOUND");
//                    jsonResult.put("data", null);
//
//                } else {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                    jsonResult.put("data", jsonArray);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//                jsonResult.put("data", null);
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//        }
//        return jsonResult;
//    }
//    
//    @POST
//    @Path("getSewingStandard")
//    @Produces("application/json")
//    public JSONObject getSewingStandard(@FormParam("id") String id) {
//        JSONObject jsonResult = new JSONObject();
//        try {
//            String sqlcmd = "select * from linebalance_view where id = '"+ id+"'" ;
//            DbConnector connector = new DbConnector(DbConnector.ConnectionName.DB_SV);
//            if (connector.GetConnection() != null) {
//                JSONArray jsonArray = connector.QueryDataToJSON(sqlcmd);
//                int length = jsonArray.size();
//                if (length == 0) {
//                    jsonResult.put("errorcode", "NOTFOUND");
//                    jsonResult.put("errormsg", "NOTFOUND");
//                    jsonResult.put("data", null);
//                } else {
//                    jsonResult.put("errorcode", "OK");
//                    jsonResult.put("errormsg", "OK");
//                    jsonResult.put("data", jsonArray);
//                }
//            } else {
//                jsonResult.put("errorcode", "SERVER_ERROR");
//                jsonResult.put("errormsg", "SERVER_ERROR");
//                jsonResult.put("data", null);
//            }
//        } catch (Exception ex) {
//            jsonResult.put("errorcode", "EXCEPTION");
//            jsonResult.put("errormsg", ex.toString());
//        }
//        return jsonResult;
//    }
    
}
