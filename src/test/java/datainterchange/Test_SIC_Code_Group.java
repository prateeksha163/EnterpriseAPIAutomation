package datainterchange;

import org.testng.annotations.Test;
import resultsets.SIC_Code;
import utils.ConfigFileReader;

public class Test_SIC_Code_Group {

    SIC_Code _sic_code;
    ConfigFileReader configFileReader;

    @Test
    public void getSIC_Code() throws Exception {
        _sic_code = new SIC_Code();
        configFileReader = new ConfigFileReader();
       System.out.println(_sic_code.getSICCode(configFileReader.getConfigValue("effectiveDate"), configFileReader.getConfigValue("SICCode")));
    }
}