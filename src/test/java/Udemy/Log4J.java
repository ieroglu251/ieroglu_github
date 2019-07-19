package Udemy;
/*
When to use log4j methods based on given scenarios
*******When to Use log. Error, debug and info methods in Selenium test cases*****************************



Use log. Error() to log when elements are not displayed in the page or if any validations fail

Use Log. Debug()

When each Selenium action is performed like click, SendKeys, getText()

Use log.info()

When operation is successfully completed ex: After loading page, or after any successful validations

It’s just counterpart to log. Error()



*****************sample Testcase is found at the end of this section****
 */

import org.apache.logging.log4j.*;

public class Log4J {

    private static Logger log = LogManager.getLogger(Log4J.class.getName());

    public static void main(String[] args) {
        log.debug("I am debuging");

        if(5>4){
            log.info("object is present");
        }
    }
}
