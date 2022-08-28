package tech.bumperdb.dataplane;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataPlaneService {

    private static final Logger logger = LoggerFactory.getLogger(DataPlaneService.class);

    public static void main(String[] args) throws InterruptedException {
        long currentTimeMillis = System.currentTimeMillis();
        while (currentTimeMillis < Long.MAX_VALUE) {
            logger.info("Current time:{}", currentTimeMillis);
            Thread.sleep(5000);
            currentTimeMillis = System.currentTimeMillis();
        }
    }
}
