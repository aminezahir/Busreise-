package main.java.contr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import main.java.modell.Bus;

public class BusController {
    private Connection connection;

    public BusController(Connection connection) {
        this.connection = connection;
    }

   
}
