package resultsets;

import database.DWH;
import database.SQL_Queries;
import org.json.simple.JSONObject;

import java.sql.ResultSet;
import java.sql.Statement;

@SuppressWarnings("unchecked")
public class ArgusPlanID {
    Statement statement;
    DWH dwh_ = new DWH();
    JSONObject jsonObject = new JSONObject();
    SQL_Queries sql_queries = new SQL_Queries();

    public JSONObject getArgusPlanID(String EverwellPlanID) throws Exception {
        statement = dwh_.database_connection();
        ResultSet resultSet = statement.executeQuery(sql_queries.get_argus_plan_ID(EverwellPlanID));
        while (resultSet.next()) {
            jsonObject.put("PlanID", resultSet.getString("PlanID"));
            jsonObject.put("everwellPlanId", resultSet.getString("everwellPlanId"));
            jsonObject.put("EmployerPaidFLag", resultSet.getString("EmployerPaidFLag"));

        }return jsonObject;
    }
}