package org.example;
import java.util.logging.*;
public class DataConnection {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    private static DataConnection single = null;
    String s;

    private DataConnection(String s1) {
        s = "you are connected to the " + s1 + " successfully";
        LOGGER.info(s);
    }

    public static DataConnection getInstance(String s) {
        if (single == null)
            single = new DataConnection(s);

        return single;
    }


    public String newConnection(String ns) {
        s = "The new Connection is " + ns + " established";
        return s;
    }

    public void close() {
        s = "All the connections are Closed";
        LOGGER.info(s);
    }
}