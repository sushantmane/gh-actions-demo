package tech.bumperdb.controlplane;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ControlPlaneService {

    private static final Logger logger = LoggerFactory.getLogger(ControlPlaneService.class);

    public static void main(String[] args) throws InterruptedException {
        long currentTimeMillis = System.currentTimeMillis();
        while (currentTimeMillis < Long.MAX_VALUE) {
            logger.info("CPS - Current time:{}", currentTimeMillis);
            Thread.sleep(5000);
            currentTimeMillis = System.currentTimeMillis();
        }
    }
}
