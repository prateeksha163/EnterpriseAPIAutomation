package database;

public class SQL_Queries {

    public String get_siccode_group_national(String effectiveDate, String SICcode) {
        return "SELECT TOP (1) siccode_group_national, effective_date, siccode_from_national, siccode_to_national FROM DWH.dbo.Everwell_2021_SIC WHERE effective_date = '" + effectiveDate + "' AND '" + SICcode + "' BETWEEN siccode_from_national AND siccode_to_national";
    }

    public String get_argus_plan_ID(String EverwellPlanID) {
        return "select top 1 PlanID, everwellPlanId, EmployerPaidFLag from DWH.dbo.Everwell_2021_Crosswalk_PID where everwellPlanId = '" + EverwellPlanID + "'"; }
}