package planetakino.utils;

import java.util.Random;

public class TestsConfig {

    public static void sleep5Seconds() {
        try {
            Thread.sleep(5*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int randomInt(){
        Random rn = new Random();
        return rn.nextInt();
    }

}
