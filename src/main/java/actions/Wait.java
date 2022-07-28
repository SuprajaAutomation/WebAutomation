package actions;

import org.apache.log4j.Logger;

public class Wait {

    private static Logger log=Logger.getLogger(Wait.class);

    public static void forSeconds(int seconds) {
        try{
            Thread.sleep(seconds);
        }catch (InterruptedException e){
            log.warn("Failed to execute thread.sleep()");
        }
    }
}
