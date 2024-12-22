package main;

import java.io.IOException;
import java.util.logging.*;

public class LoggerConfig {
    private static final Logger logger = Logger.getLogger(LoggerConfig.class.getName());

    static {
        try {
            FileHandler fileHandler = new FileHandler("order_log.log", true);
            fileHandler.setFormatter(new SimpleFormatter());

            fileHandler.setLevel(Level.ALL);

            logger.addHandler(fileHandler);

            logger.setUseParentHandlers(false);

            logger.setLevel(Level.ALL);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getLogger() {
        return logger;
    }
}
