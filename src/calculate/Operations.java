package calculate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Operations {
    public static final String PATH_TO_PROPERTIES = "src/course.properties";
    private static double getDollar(){
        FileInputStream fileInputStream;
        Properties prop = new Properties();
        try {
            fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
            prop.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String dollarString = prop.getProperty("dollar");
        double dollar=Double.parseDouble(dollarString);
       return dollar;
    }
    public static double getRuble(){
        FileInputStream fileInputStream;
        Properties prop = new Properties();
        try {
            fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
            prop.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String rubleString = prop.getProperty("ruble");
        double ruble=Double.parseDouble(rubleString);
        return ruble;
    }
   public static double toDollars(double a){
        return a*getDollar();
    }
    public static double toRubles(double a){
        return a*getRuble();
    }

}
