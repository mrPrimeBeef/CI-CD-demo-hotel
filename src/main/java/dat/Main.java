package dat;

import dat.config.ApplicationConfig;
import dat.controllers.impl.ExceptionController;
import dat.exceptions.ApiException;
import dat.exceptions.Message;
import dat.routes.Routes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static void main(String[] args) {
        ApplicationConfig.startServer(7070);
    }
}