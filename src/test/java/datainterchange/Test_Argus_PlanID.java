package datainterchange;

import org.testng.annotations.Test;
import resultsets.ArgusPlanID;
import utils.ConfigFileReader;

@Test
public class Test_Argus_PlanID {
    ConfigFileReader configFileReader;

    ArgusPlanID getArgusPlanID = new ArgusPlanID();

    public void getArgusPlanID() throws Exception {
        getArgusPlanID = new ArgusPlanID();
        configFileReader = new ConfigFileReader();
        System.out.println(getArgusPlanID.getArgusPlanID(configFileReader.getConfigValue("everwellPlanId"))); }
}