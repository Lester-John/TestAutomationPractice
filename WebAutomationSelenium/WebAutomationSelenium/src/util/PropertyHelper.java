package util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
//import java.util.Enumeration;


public class PropertyHelper {



    @SuppressWarnings("unused")
	public static String ReadProperty(String sFileName, String sKey)
    {

    Properties prop = new Properties();
    InputStream input = null;

    	try {
        input = new FileInputStream("C:\\TestAutomation\\WebAutomationSelenium\\WebAutomationSelenium\\src\\data\\" + sFileName + ".properties");
        if(input==null){
            System.out.println("Sorry, unable to find " + sFileName);
            return null;
        }
        //load a properties file from class path, inside static method
        prop.load(input);

        return prop.getProperty(sKey);

      
    } catch (Exception ex) {

    } finally{
        if(input!=null){
            try {
                input.close();
            } catch (Exception e) {

            }
        }
    }
return null;
}

}
