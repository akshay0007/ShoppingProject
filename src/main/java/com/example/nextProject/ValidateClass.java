package com.example.nextProject;

/**
 * Created by ubuntu on 13/2/18.
 */
public class ValidateClass {
//    Logger logger = new Logger("logs");

    public boolean isValidate(String uname, String passwd) {
//        logger.log(Level.ALL, "uan " + uname + " " + "passw " + passwd);
        if (uname.equalsIgnoreCase("akshay") && passwd.equalsIgnoreCase("skilrock")) {
            return true;
        }
        return false;
    }
}
