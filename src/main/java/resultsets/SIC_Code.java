package resultsets;

import database.DWH;
import database.SQL_Queries;
import org.json.simple.JSONObject;

import java.sql.ResultSet;
import java.sql.Statement;

@SuppressWarnings("unchecked")

public class SIC_Code {
    public Statement statement;
    DWH dwh_ = new DWH();
    JSONObject jsonObject = new JSONObject();
    SQL_Queries sql_queries = new SQL_Queries();

    public JSONObject getSICCode(String effectiveDate, String SICCode) throws Exception {
        statement = dwh_.database_connection();
        ResultSet resultSet = statement.executeQuery(sql_queries.get_siccode_group_national(effectiveDate, SICCode));
        while (resultSet.next()) {
            jsonObject.put("siccode_group_national", resultSet.getString("siccode_group_national"));
            jsonObject.put("effective_date", resultSet.getString("effective_date"));
            jsonObject.put("siccode_from_national", resultSet.getString("siccode_from_national"));
            jsonObject.put("siccode_to_national", resultSet.getString("siccode_to_national")); }
        return jsonObject; }
}